package ar.unrn.tpP2.exception;

public class SmtpException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SmtpException(String msg) {
		// ponerlo en un paquete exception
		super(msg);
	}
}
