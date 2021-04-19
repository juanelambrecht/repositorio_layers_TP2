package ar.unrn.tp3P2.ui;

import ar.unrn.tp3P2.modelo.*;
import ar.unrn.tpP2.exception.SmtpException;

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
