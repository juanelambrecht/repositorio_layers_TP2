package ar.unrn.tp3P2.serviciomail;

import ar.unrn.tp3P2.libreria.Email;
import ar.unrn.tp3P2.libreria.exception.SmtpException;
import ar.unrn.tp3P2.modelo.RepositorioEnvio;

public class ServicioMail implements RepositorioEnvio{

	@Override
	public void enviar(String destinatarioEmail, String tituloEmail, String cuerpoEmail) {
		
		try {
			new Email(destinatarioEmail, tituloEmail, cuerpoEmail).enviar();
		} catch (SmtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
