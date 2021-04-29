package ar.unrn.tp3P2.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import ar.unrn.tp3P2.libreria.exception.SmtpException;
import ar.unrn.tp3P2.modelo.Empleados;
import ar.unrn.tp3P2.modelo.EnviarMensajeEmpleados;
import ar.unrn.tp3P2.persistencia.DiscoLeerEmpleados;
import ar.unrn.tp3P2.serviciomail.ServicioMail;

class EmpleadoTest {

	@Test
	void test() {

		String tituloEmail = "Mensaje de Feliz Cumpleaños";
		String cuerpoEmail = "¡FELIZ CUMPLEAÑOS!";
		String nombreArchivo = "empleados.txt";

		Empleados empleado1 = new Empleados("Young", "Angus", "1982/" + DiscoLeerEmpleados.MesyDia(), "angus@acdc.com");
		Empleados empleado2 = new Empleados("Johnson", "Brian", "1975/" + DiscoLeerEmpleados.MesyDia(),
				"brian@acdc.com");

		try {
			EnviarMensajeEmpleados envioMensaje = new EnviarMensajeEmpleados(new DiscoLeerEmpleados(nombreArchivo),
					new ServicioMail());

			envioMensaje.EnviarMensaje(tituloEmail, cuerpoEmail);

			assertTrue(envioMensaje.ExisteEmpleado(empleado1));
			assertTrue(envioMensaje.ExisteEmpleado(empleado2));

		} catch (ClassNotFoundException | IOException | SmtpException e) {
			throw new RuntimeException(e);
		}

	}

}
