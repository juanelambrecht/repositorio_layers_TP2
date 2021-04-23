package ar.unrn.tp3P2.modelo;

import java.util.ArrayList;

public class EnviarMensajeEmpleado {
	RepositorioEmpleados repositorioEmpleado;
	RepositorioEnvio repositorioEnvio;
	
	public EnviarMensajeEmpleado(RepositorioEmpleados repositorioEmpleado, RepositorioEnvio repositorioEnvio) {
		super();
		this.repositorioEmpleado = repositorioEmpleado;
		this.repositorioEnvio = repositorioEnvio;
	}
	
	public void EnviarMensaje(String tituloEmail, String cuerpoEmail) {
		
		ArrayList<Empleados> empleados = this.repositorioEmpleado.leerEmpleados();
		
		for(Empleados empleado: empleados) {
		
				this.repositorioEnvio.enviar(empleado.EmailDeEmpleado(),tituloEmail,cuerpoEmail);
			
		}
	}
	
}
