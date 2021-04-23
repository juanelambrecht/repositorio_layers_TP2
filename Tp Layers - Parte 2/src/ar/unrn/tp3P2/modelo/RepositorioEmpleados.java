package ar.unrn.tp3P2.modelo;

import java.util.ArrayList;

public interface RepositorioEmpleados {
	
	void cargarEmpleados();
	
	ArrayList<Empleados> leerEmpleados();
	
}
