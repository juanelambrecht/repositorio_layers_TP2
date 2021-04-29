package ar.unrn.tp3P2.test;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import ar.unrn.tp3P2.libreria.exception.SmtpException;
import ar.unrn.tp3P2.modelo.EnviarMensajeEmpleados;
import ar.unrn.tp3P2.persistencia.DiscoLeerEmpleados;
import ar.unrn.tp3P2.serviciomail.ServicioMail;

class EnvioEmailTest {

	@Test
	void test() {
		String tituloEmail = "Mensaje de Feliz Cumpleaños";
		String cuerpoEmail = "¡FELIZ CUMPLEAÑOS!";
		String nombreArchivo = "empleados.txt";
		
		try {
			EnviarMensajeEmpleados envioMensaje = new EnviarMensajeEmpleados(new DiscoLeerEmpleados(nombreArchivo),
					new ServicioMail());

			envioMensaje.EnviarMensaje(tituloEmail, cuerpoEmail);

			assertTrue(envioMensaje.mailsEnviados(2));
			
		} catch (ClassNotFoundException | IOException | SmtpException e) {
			throw new RuntimeException(e);
		}
	}

}
