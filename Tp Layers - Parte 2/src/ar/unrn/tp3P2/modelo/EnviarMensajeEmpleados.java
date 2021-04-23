package ar.unrn.tp3P2.modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import ar.unrn.tp3P2.libreria.exception.SmtpException;

public class EnviarMensajeEmpleados {
	RepositorioEmpleados repositorioEmpleado;
	RepositorioEnvio repositorioEnvio;

	public EnviarMensajeEmpleados(RepositorioEmpleados repositorioEmpleado, RepositorioEnvio repositorioEnvio) {
		super();
		this.repositorioEmpleado = repositorioEmpleado;
		this.repositorioEnvio = repositorioEnvio;
	}

	public void EnviarMensaje(String tituloEmail, String cuerpoEmail)
			throws FileNotFoundException, ClassNotFoundException, IOException, SmtpException {

		ArrayList<Empleados> empleados = this.repositorioEmpleado.leerEmpleados();

		for (Empleados empleado : empleados) {

			this.repositorioEnvio.enviar(empleado.EmailDeEmpleado(), tituloEmail, cuerpoEmail);

		}
	}

}
