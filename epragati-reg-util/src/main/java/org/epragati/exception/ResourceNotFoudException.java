package org.epragati.exception;

public class ResourceNotFoudException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoudException(String resourcNotFound) {

		super(resourcNotFound);
	}

}
