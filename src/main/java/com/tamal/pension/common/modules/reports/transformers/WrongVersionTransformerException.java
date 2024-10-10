package com.tamal.pension.common.modules.reports.transformers;

public class WrongVersionTransformerException extends TransformerException {
	
	private static final long serialVersionUID = 3659321494316401289L;

	public WrongVersionTransformerException() {
		super();
	}

	public WrongVersionTransformerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WrongVersionTransformerException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongVersionTransformerException(String message) {
		super(message);
	}

	public WrongVersionTransformerException(Throwable cause) {
		super(cause);
	}
	
}
