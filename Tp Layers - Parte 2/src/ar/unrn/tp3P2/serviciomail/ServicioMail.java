package ar.unrn.tp3P2.serviciomail;

import ar.unrn.tp3P2.libreria.Email;
import ar.unrn.tp3P2.libreria.exception.SmtpException;
import ar.unrn.tp3P2.modelo.RepositorioEnvio;

public class ServicioMail implements RepositorioEnvio{

	@Override
	public void enviar(String destinatarioEmail, String tituloEmail, String cuerpoEmail) throws SmtpException {
	
			new Email(destinatarioEmail, tituloEmail, cuerpoEmail).enviar();
	}

}
