package org.epragati.exception;

import java.util.List;

public class RcValidationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> errors;

	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public RcValidationException(List<String> errors) {
		super();
		this.errors = errors;
	}
	
	  public RcValidationException(List<String> errors, Throwable  throwable) {
	        super(throwable);
	        this.errors = errors;
	    }

}
