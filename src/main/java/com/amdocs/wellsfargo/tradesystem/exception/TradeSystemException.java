package com.amdocs.wellsfargo.tradesystem.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus; 
/**
*
* @author Jeevan
*/
@ResponseStatus(HttpStatus.NOT_FOUND)  
public class TradeSystemException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String errorMessage;
	
	public TradeSystemException() {
	}

	public TradeSystemException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
