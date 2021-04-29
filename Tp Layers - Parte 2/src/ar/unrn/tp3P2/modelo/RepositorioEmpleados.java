package ar.unrn.tp3P2.modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface RepositorioEmpleados {

	ArrayList<Empleados> leerEmpleados() throws FileNotFoundException, IOException, ClassNotFoundException;

}
