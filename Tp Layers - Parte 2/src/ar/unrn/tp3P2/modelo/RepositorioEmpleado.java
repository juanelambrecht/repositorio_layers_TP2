package ar.unrn.tp3P2.modelo;

import ar.unrn.tp3P2.email.exception.SmtpException;

public interface RepositorioEmpleado {
	void enviar() throws SmtpException;
}
