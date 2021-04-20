package ar.unrn.tp3P2.ui;

import ar.unrn.tp3P2.email.exception.SmtpException;
import ar.unrn.tp3P2.modelo.*;

public class EnviarMailEmpleado {

	RepositorioEmpleado repositorio;

	public EnviarMailEmpleado(RepositorioEmpleado repositorio) {
		this.repositorio = repositorio;
	}

	public void EnviarMail() {
		try {
			this.repositorio.enviar();
		} catch (SmtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
