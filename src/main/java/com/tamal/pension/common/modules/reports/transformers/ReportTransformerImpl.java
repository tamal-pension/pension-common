package com.tamal.pension.common.modules.reports.transformers;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Validator;

import org.apache.commons.io.input.CharSequenceReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Lazy;
import org.xml.sax.SAXParseException;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.Maps;
import com.inqwise.errors.ErrorCodes;
import com.inqwise.errors.ErrorTicket;
import com.inqwise.errors.Throws;
import com.pivovarit.function.ThrowingSupplier;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.errortickets.PensionErrorCodes;
import com.tamal.pension.common.modules.reports.ReportType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class ReportTransformerImpl implements ReportTransformer {
	
	private final ReportType reportType;
	private final Map<Version, ReportVersionTransformerImpl> versionTransformersMap;
	
	private static final Logger logger = LogManager.getLogger(ReportTransformerImpl.class);
	
	private class ReportVersionTransformerImpl implements ReportVersionTransformer {
		private final ReportVersion reportVersion;
		private final Lazy<JAXBContext> context;
		
		public ReportVersionTransformerImpl(ReportVersion reportVersion) {
			this.reportVersion = reportVersion;
			this.context = Lazy.lazy(ThrowingSupplier.unchecked(() -> JAXBContext.newInstance(reportVersion.getClazz())));
		}
		
		public final Unmarshaller unmarshaller(){
			logger.debug("unmarshaller for: {} {}", reportType, reportVersion);
			try {
				Unmarshaller u = context.value().createUnmarshaller();
				u.setSchema(reportVersion.getSchema().orElseThrow(() -> new TransformerException(String.format("No schema found for %s %s", reportType, version()))));
				
				return u;
			} catch (JAXBException e) {
				throw Throws.propagate(e);
			} catch (Throwable e) {
				throw Throws.propagate(Throwables.getRootCause(e));
			}
			
		}
		
		public final Marshaller marshaller(boolean withValidation){
			logger.debug("marshaller for: {} {} with validation:{}", reportType, reportVersion, withValidation);
			try {
				Marshaller m = context.value().createMarshaller();
				
				m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
				if(withValidation) {
					m.setSchema(reportVersion.getSchema().orElseThrow(() -> new TransformerException(String.format("No schema found for %s %s", reportType, version()))));
				}
				
				return m;
			} catch (JAXBException e) {
				throw Throws.propagate(e);
			}
		}
		
		
		@Override
		@SuppressWarnings("unchecked")
		public <T> T unmarshal(CharSequence str) {
			Unmarshaller u = unmarshaller();
			try(var reader = new CharSequenceReader(str)){
				Source xmlFile = new StreamSource(reader);
				Validator validator = u.getSchema().newValidator();
				
				try {
					validator.validate(xmlFile);
					try(var reader2 = new CharSequenceReader(str)){
						T obj = (T)unmarshaller().unmarshal(reader2);
						logger.debug("unmarshaled to instance of '{}'", obj.getClass());
						return obj;
					}
				} catch (SAXParseException e) {
					logger.debug(str);
					logger.error("unmarshal failed", e);
					 
					throw ErrorTicket.propagate(e, builder -> builder.withError(PensionErrorCodes.XSDParseFailed).withDetails("failed to unmarshal {}", Throwables.getRootCause(e).getMessage()));
				} catch (JAXBException e) {
					logger.debug(str);
					logger.error("unmarshal failed", e);
					throw ErrorTicket.propagate(e, builder -> builder.withError(ErrorCodes.ArgumentWrong).withDetails("failed to unmarshal {}", Throwables.getRootCause(e).getMessage()));
				} catch (Throwable e) {
					logger.debug(str);
					throw new TransformerException("failed to unmarshal", Throwables.getRootCause(e));
				}
			}
		}
		
		@Override
		public <T> T tryUnmarshal(CharSequence str){
			try {
				return unmarshal(str);
			} catch (Throwable e) {
				logger.error("unmarshal failed.", e);
				return null;
			}
		}
		
		@Override
		public String marshal(Object obj, boolean withValidation) {
			
			try(StringWriter sw = new StringWriter()){
				
				logger.debug("marshal from instance of '{}'", Optional.ofNullable(obj).map(Object::getClass).orElse(null));
				marshaller(withValidation).marshal(obj, sw);
				
				return sw.toString();
			} catch (IOException | JAXBException e) {
				logger.error(String.format("marshal failed of '%s'", MoreObjects.toStringHelper(obj)), e);
				throw ErrorTicket.propagate(e, builder -> ErrorTicket.builder().withError(ErrorCodes.ArgumentWrong).withDetails("failed to marshal {}", Throwables.getRootCause(e).getMessage()));
			} catch(Throwable e) {
				throw new TransformerException(Throwables.getRootCause(e));
			}
		}
		
		@Override
		public final Version version() {
			return reportVersion.getVersion();
		}
	}
	
	public ReportTransformerImpl(ReportType reportType) {
		this.reportType = reportType;
		this.versionTransformersMap = Maps.newHashMap();
	}
	
	public ReportTransformerImpl(ReportType reportType, ReportVersion[] versions) {
		this(reportType);
		Arrays.stream(Preconditions.checkNotNull(versions, "versions"))
		.map(ReportVersionTransformerImpl::new)
		.forEach(this::addReportVersionTransformer);
	}
	
	private boolean addReportVersionTransformer(ReportVersionTransformerImpl versionTransformer) {
		return addReportVersionTransformer(versionTransformer, false);
	}
	
	private boolean addReportVersionTransformer(ReportVersionTransformerImpl versionTransformer, boolean skipIfExist) {
		logger.trace("addReportVersionTransformer({}, {}, {})", versionTransformer.version(), skipIfExist, reportType);
		
		if(skipIfExist && versionTransformersMap.containsKey(versionTransformer.version())) {
			return true;
		}
		
		logger.trace("version {} not exist in transformers map {}, adding", versionTransformer.version(), versionTransformersMap);
		return null != versionTransformersMap.put(versionTransformer.version(), versionTransformer);
	}
	
	protected final Unmarshaller unmarshaller(Version version){
		return Optional.ofNullable(versionTransformersMap.get(version)).map(ReportVersionTransformerImpl::unmarshaller).orElse(null);
	}
	
	protected final Marshaller marshaller(Version version){
		return Optional.ofNullable(versionTransformersMap.get(version)).map(vertionTransformer -> vertionTransformer.marshaller(true)).orElse(null);
	}
	
	@Override
	public <T> T unmarshal(CharSequence str){
		// identify version
		Version version = new ReportIdentifier(str).identify().map(meta -> meta.version()).orElseThrow(() -> new TransformerException("unable to identify version"));
		return unmarshal(str, version);
	}
	
	@Override
	public <T> T tryUnmarshal(CharSequence str){
		// identify version
		Version version = new ReportIdentifier(str).identify().map(meta -> meta.version()).orElseThrow(() -> new TransformerException("unable to identify version"));
		return tryUnmarshal(str, version);
	}
	
	@Override
	public <T> T unmarshal(CharSequence str, Version version){
		return Optional.ofNullable(versionTransformersMap.get(version)).map(t -> t.<T>unmarshal(str)).orElseThrow(() -> new TransformerException(String.format("Unsupported version '%s' for %s report", version, reportType)));
	}
	
	@Override
	public <T> T tryUnmarshal(CharSequence str, Version version){
		return tryUnmarshal(str, version, null);
	}
	
	@Override
	public <T> T tryUnmarshal(CharSequence str, Version version, T def){
		return Optional.ofNullable(versionTransformersMap.get(version)).map(t -> t.<T>tryUnmarshal(str)).orElse(def);
	}

	@Override
	public String marshal(Object obj, Version version) {
		return Optional.ofNullable(versionTransformersMap.get(version)).map(t -> t.marshal(obj, true)).orElseThrow(() -> new TransformerException(String.format("Unsupported version '%s' for %s report", version, reportType)));
	}
	
	@Override
	public ReportVersionTransformer getVersionTransformer(Version version) {
		logger.debug("getVersionTransformer({})", version.get());
		return Optional.ofNullable(versionTransformersMap.get(version)).orElseThrow(() -> new WrongVersionTransformerException(String.format("no transformer found for version %s", version)));
	}

	@Override
	public boolean isSupportForVersion(Version version) {
		return versionTransformersMap.containsKey(version);
	}

	public boolean addReportVersion(ReportVersion reportVersion, boolean skipIfExist) {
		return addReportVersionTransformer(new ReportVersionTransformerImpl(reportVersion), skipIfExist);
	}
}
