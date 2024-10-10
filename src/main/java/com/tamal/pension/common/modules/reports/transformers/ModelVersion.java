package com.tamal.pension.common.modules.reports.transformers;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.tamal.pension.common.Version;

public class ModelVersion {

	private final Version version;
	private final Class<?> clazz;

	public ModelVersion(Version version, Class<?> clazz) {
		this.version = version;
		this.clazz = clazz;
	}

	public final Version getVersion() {
		return version;
	}

	public Class<?> getClazz() {
		return clazz;
	}
	
	public static ModelVersion of(Version version, Class<?> clazz) {
		return new ModelVersion(version, clazz);
	}
	
	@Override
	public String toString() {
		return toStringHelper().toString();
	}
	
	protected ToStringHelper toStringHelper() {
		return MoreObjects.toStringHelper(this).add("version", version).add("clazz", clazz);
	}
}
