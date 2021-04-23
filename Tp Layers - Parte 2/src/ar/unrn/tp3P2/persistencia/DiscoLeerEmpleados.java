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

public class DiscoLeerEmpleados implements RepositorioEmpleados{

	RepositorioEnvio repositorio;

	public DiscoLeerEmpleados() {
		
	}
	
	public ArrayList<Empleados> leerEmpleados() {
			
			this.cargarEmpleados();
			
			String nombreFichero = "empleados.txt";
			ArrayList<Empleados> empleados = new ArrayList<Empleados>();
			
			try {
				ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreFichero));

				empleados = (ArrayList<Empleados>) entrada.readObject();
				empleados.toString();
				entrada.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return empleados;
	}

	@Override
	public void cargarEmpleados() {
		String nombreFichero = "empleados.txt";
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();
		
		Empleados empleado = new Empleados("Young", "Angus", "1982/" + this.MesyDia(), "angus@acdc.com");
		Empleados empleado2 = new Empleados("Johnson", "Brian", "1975/" + this.MesyDia(), "brian@acdc.com");
		
		empleados.add(empleado);
		empleados.add(empleado2);
		
		try {

			ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));

			objetoSalida.writeObject(empleados);

			objetoSalida.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("¡El fichero no existe!");
		} catch (Exception e) {
			System.out.println("excp");
			System.out.println(e.getMessage());
		}
	}


	public static String MesyDia() {
		
		return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd"));
		
	}


}
