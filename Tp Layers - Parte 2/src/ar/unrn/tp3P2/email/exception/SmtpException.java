package ar.unrn.tp3P2.email.exception;

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
