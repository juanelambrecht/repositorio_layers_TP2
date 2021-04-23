package ar.unrn.tp3P2.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import ar.unrn.tp3P2.modelo.*;

public class DiscoLeerEmpleados implements RepositorioEmpleados {
	String nombreArchivo;
	RepositorioEnvio repositorio;

	public DiscoLeerEmpleados(String nombreArchivo) throws FileNotFoundException, IOException {
		this.nombreArchivo = nombreArchivo;
		this.cargarEmpleados();
	}

	public ArrayList<Empleados> leerEmpleados() throws FileNotFoundException, IOException, ClassNotFoundException {

		String nombreFichero = this.nombreArchivo;
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();

		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreFichero));

		empleados = (ArrayList<Empleados>) entrada.readObject();
		empleados.toString();
		entrada.close();

		return empleados;
	}

	private void cargarEmpleados() throws FileNotFoundException, IOException {
		String nombreFichero = this.nombreArchivo;// por constructor
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();

		Empleados empleado = new Empleados("Young", "Angus", "1982/" + this.MesyDia(), "angus@acdc.com");
		Empleados empleado2 = new Empleados("Johnson", "Brian", "1975/" + this.MesyDia(), "brian@acdc.com");

		empleados.add(empleado);
		empleados.add(empleado2);

		ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));

		objetoSalida.writeObject(empleados);

		objetoSalida.close();

	}

	private String MesyDia() {

		return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd"));

	}

}
