package ar.unrn.tp3P2.main;

import java.util.ArrayList;

import ar.unrn.tp3P2.modelo.EnviarMensajeEmpleado;
import ar.unrn.tp3P2.persistencia.DiscoLeerEmpleados;
import ar.unrn.tp3P2.serviciomail.ServicioMail;

public class Main {

	public static void main(String[] args) {

		String tituloEmail = "Mensaje de Feliz Cumplea�os";
		String cuerpoEmail = "�FELIZ CUMPLEA�OS!";	
		new EnviarMensajeEmpleado(new DiscoLeerEmpleados(), new ServicioMail()).EnviarMensaje(tituloEmail, cuerpoEmail);;
	}

}
