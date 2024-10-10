package com.tamal.pension.common.modules.reports.transformers;

public class TransformerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 897984136617855916L;

	public TransformerException() {
		super();
	}

	public TransformerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TransformerException(String message, Throwable cause) {
		super(message, cause);
	}

	public TransformerException(String message) {
		super(message);
	}

	public TransformerException(Throwable cause) {
		super(cause);
	}
}
