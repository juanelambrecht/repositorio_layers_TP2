package ar.unrn.tp3P2.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


import ar.unrn.tp3P2.modelo.Empleado;
import ar.unrn.tp3P2.ui.CargarEmpleado;

class EmpleadoTest {

	@Test
	void test() {
		Empleado empleado1 = new Empleado("Young", "Angus", "1982/" + CargarEmpleado.MesyDia(), "angus@acdc.com");
		Empleado empleado2 = new Empleado("Johnson", "Brian", "1975/" +  CargarEmpleado.MesyDia(), "brian@acdc.com");

		CargarEmpleado empleados = new CargarEmpleado();
		
		assertTrue(empleados.existeEmpleado(empleado1));
		assertTrue(empleados.existeEmpleado(empleado2));
		
	}

}
