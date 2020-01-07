package com.shina.Exception;

import com.shina.dto.UserDTO;

public class CustomErrorType extends UserDTO {
	
	private String errorMessage;

	public CustomErrorType(final String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
	

}
