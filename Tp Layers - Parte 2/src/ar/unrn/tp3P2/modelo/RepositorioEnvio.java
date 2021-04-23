package ar.unrn.tp3P2.modelo;

import ar.unrn.tp3P2.libreria.exception.SmtpException;

public interface RepositorioEnvio {
	
	void enviar(String destinatarioEmail, String tituloEmail, String cuerpoEmail) throws SmtpException;
	
}
