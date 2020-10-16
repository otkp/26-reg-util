package org.epragati.exception;

public class UnauthorizedException extends Exception {

	/**
	 * @author saroj.sahoo
	 */
	private static final long serialVersionUID = -3523375960664504242L;
	
	public UnauthorizedException() {
        super();
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnauthorizedException(String message) {
        super(message);
    }

}
