package ar.unrn.tp3P2.modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import ar.unrn.tp3P2.libreria.exception.SmtpException;

public class EnviarMensajeEmpleados {
	RepositorioEmpleados repositorioEmpleado;
	RepositorioEnvio repositorioEnvio;
	ArrayList<Empleados> empleados = new ArrayList<Empleados>();
	
	public EnviarMensajeEmpleados(RepositorioEmpleados repositorioEmpleado, RepositorioEnvio repositorioEnvio) {
		super();
		this.repositorioEmpleado = repositorioEmpleado;
		this.repositorioEnvio = repositorioEnvio;
	}

	public void EnviarMensaje(String tituloEmail, String cuerpoEmail)
			throws FileNotFoundException, ClassNotFoundException, IOException, SmtpException {

		empleados = this.repositorioEmpleado.leerEmpleados();

		for (Empleados empleado : empleados) {

			this.repositorioEnvio.enviar(empleado.EmailDeEmpleado(), tituloEmail, cuerpoEmail);

		}
	}
	
	public boolean ExisteEmpleado(Empleados empleado) {
		
		for(Empleados empleadoLista: this.empleados) {
			if(empleadoLista.EmailDeEmpleado().equals(empleado.EmailDeEmpleado()))
				return true;
		}
		
		return false;
	}
}
