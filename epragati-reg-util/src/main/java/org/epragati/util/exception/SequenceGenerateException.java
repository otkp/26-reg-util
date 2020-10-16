package org.epragati.util.exception;

public class SequenceGenerateException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public SequenceGenerateException(){
		super();
	}
	public SequenceGenerateException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

