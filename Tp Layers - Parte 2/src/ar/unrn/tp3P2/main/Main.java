package ar.unrn.tp3P2.main;

import java.io.IOException;

import ar.unrn.tp3P2.libreria.exception.SmtpException;
import ar.unrn.tp3P2.modelo.EnviarMensajeEmpleados;
import ar.unrn.tp3P2.persistencia.DiscoLeerEmpleados;
import ar.unrn.tp3P2.serviciomail.ServicioMail;

public class Main {

	public static void main(String[] args) {
		String tituloEmail = "Mensaje de Feliz Cumpleaños";
		String cuerpoEmail = "¡FELIZ CUMPLEAÑOS!";
		String nombreArchivo = "empleados.txt";

		try {
			new EnviarMensajeEmpleados(new DiscoLeerEmpleados(nombreArchivo), new ServicioMail())
					.EnviarMensaje(tituloEmail, cuerpoEmail);

		} catch (ClassNotFoundException | IOException | SmtpException e) {
			throw new RuntimeException(e);
		}

	}

}
