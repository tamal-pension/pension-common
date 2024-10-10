package com.tamal.pension.common.errortickets;

import com.inqwise.errors.ErrorCode;
import com.inqwise.errors.spi.ErrorCodeProvider;

public class PensionErrorCodesProvider implements ErrorCodeProvider {

	@Override
	public String group() {
		return PensionErrorCodes.GROUP;
	}

	@Override
	public ErrorCode valueOf(String errorCodeName) {
		return PensionErrorCodes.valueOf(errorCodeName);
	}

}
