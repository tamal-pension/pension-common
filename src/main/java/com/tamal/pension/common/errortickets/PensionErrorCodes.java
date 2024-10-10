package com.tamal.pension.common.errortickets;

import com.inqwise.errors.ErrorCode;

public enum PensionErrorCodes implements ErrorCode {
	
	ConnectionError(9),
	UnsupportedVersion(11),
	UnsupportedXSDVersion(12),
	DuplicateCompany(13),
	FileSizeNotSupported(14),
	IncorrectKeys(15),
	XSDParseFailed(16),
	FileExtensionNotSupported(18), 
	FileExecuteFailed(19),
	FileValidateFailed(20),
	DuplicateYearlyKey(21),
	MissingPensionfund(22),
	WrongTimeStamp(23),
	DuplicateFileKey(24);
	
	public static final String GROUP = "pension";
	
	@Override
	public String group() {
		return GROUP;
	}
	
	private int value;

	public int value(){
		return value;
	}
		
	private PensionErrorCodes(int value){
		this.value = value;
	}
	
	public static PensionErrorCodes valueOf(int value){
		PensionErrorCodes[] values = PensionErrorCodes.values();
		for (PensionErrorCodes status : values) {
			if( value == status.value() ) {
				return status;
			}
		}
		
		return null;
	}
}
