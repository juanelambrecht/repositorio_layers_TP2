package ar.unrn.tp3P2.modelo;

import ar.unrn.tpP2.exception.SmtpException;

public interface RepositorioEmpleado {
	void enviar() throws SmtpException;
}