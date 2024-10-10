package com.tamal.pension.common.modules.schema;

import javax.xml.validation.Schema;

import com.tamal.pension.common.Version;

public class SchemaVersion {
	private Version version;
	private Schema schema;
	public SchemaVersion(Schema schema, Version version) {
		super();
		this.version = version;
		this.schema = schema;
	}
	public Version version() {
		return version;
	}
	public Schema schema() {
		return schema;
	}
}
