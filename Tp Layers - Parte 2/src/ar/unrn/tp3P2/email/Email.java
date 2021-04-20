package ar.unrn.tp3P2.email;

import ar.unrn.tp3P2.email.exception.SmtpException;
import ar.unrn.tp3P2.modelo.RepositorioEmpleado;

public class Email implements RepositorioEmpleado {
	public String destinatarioEmail;
	public String tituloEmail;
	public String cuerpoEmail;

	public Email(String destinatarioEmail, String tituloEmail, String cuerpoEmail) {
		this.destinatarioEmail = destinatarioEmail;
		this.tituloEmail = tituloEmail;
		this.cuerpoEmail = cuerpoEmail;
	}

	public void enviar() throws SmtpException {
//conectar con el servidor SMTP para el envio
//Si algo sale mal, se lanza una SmtpException
//Si todo sale bien
		System.out.println("Se envi� el email correctamente");
	}

	@Override
	public String toString() {
		return "Email [destinatarioEmail=" + destinatarioEmail + ", tituloEmail=" + tituloEmail + ", cuerpoEmail="
				+ cuerpoEmail + "]";
	}

}