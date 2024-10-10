package com.tamal.pension.common.modules.schema;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Map;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.pivovarit.function.ThrowingFunction;
import com.tamal.pension.common.Path;


public class SchemaProvider {
	private static final Logger logger = LogManager.getLogger(SchemaProvider.class);
	public final static String DEFAULT_SCHEMA_LANGUAGE = "http://www.w3.org/2001/XMLSchema";
	public final static String DEFAULT_BASE_PATH = "";
	
	private final String basePath;
	private final SchemaFactory schemaFactory;
	private final Map<String, Schema> schemas = Maps.newHashMap(); 
	
	public SchemaProvider() {
		this(DEFAULT_BASE_PATH);
	}
	
	public SchemaProvider(String basePath) {
		this(basePath, DEFAULT_SCHEMA_LANGUAGE);
	}
	
	public SchemaProvider(String basePath, String schemaLanguage) {
		this.basePath = Preconditions.checkNotNull(basePath, "basePath");
		this.schemaFactory = SchemaFactory.newInstance(Preconditions.checkNotNull(schemaLanguage, "schemaLanguage"));
	}
	
	public Schema getSchema(String schemaPath) {
		return
		schemas.computeIfAbsent(schemaPath, ThrowingFunction.unchecked(filePath -> {
			String strPath = Path.combine(basePath, filePath);
			
			if(!new File(strPath).isAbsolute()) {
				URL absolutePath = this.getClass().getResource(Path.combine("/", strPath));
				if(null == absolutePath){
					logger.error("Unable to locate file '{}'", strPath);
					throw new FileNotFoundException(String.format("Unable to locate file '%s'", strPath));
				}
				strPath = absolutePath.getFile();
			}
			
			return schemaFactory.newSchema(new File(strPath));
		}));	
	}
}
