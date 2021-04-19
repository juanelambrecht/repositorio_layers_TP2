package ar.unrn.tp3P2.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import ar.unrn.tp3P2.email.Email;
import ar.unrn.tp3P2.modelo.Empleado;

public class CargarEmpleado {
	ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public CargarEmpleado() {
		this.cargarEmpleados();
	}

	private void cargarEmpleados() {

		String nombreFichero = "empleados.txt";
		System.out.println("Lleago a cargar");
		Empleado empleado1 = new Empleado("Young", "Angus", "1982/" + CargarEmpleado.MesyDia(), "angus@acdc.com");
		Empleado empleado2 = new Empleado("Johnson", "Brian", "1975/" + CargarEmpleado.MesyDia(), "brian@acdc.com");
		this.empleados.add(empleado1);
		this.empleados.add(empleado2);
		System.out.println("" + empleados.toString());
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

	public ArrayList<Empleado> retornarEmpleados() {
		
		String nombreFichero = "empleados.txt";
		ArrayList<Empleado> listaEmpleados = null;
		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreFichero));

			listaEmpleados = (ArrayList<Empleado>) entrada.readObject();
			System.out.println("------------------------------");
			System.out.println(listaEmpleados.get(0).toString());
			System.out.println("------------------------------");
			System.out.println(listaEmpleados.get(1).toString() + "\n");
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
		return listaEmpleados;
	}

	public ArrayList<Email> retornarEmails() {

		ArrayList<Email> listaEmails = new ArrayList<Email>();
		String tituloEmail = "Mensaje de Feliz Cumpleaños";
		String cuerpoEmail = "¡FELIZ CUMPLEAÑOS!";
		
		System.out.println("--------------------------------------------------------");
		for (Empleado empleado : empleados) {
			if (empleado.esSuCumpleaños()) {
				listaEmails.add(new Email(empleado.retornarMailEmpleado(), tituloEmail, cuerpoEmail));
			}
		}
		System.out.println("\n--------------------------------------------------------\n");
		return listaEmails;
	}
	
	public static String MesyDia() {
		
		return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd"));
		
	}
	
	public boolean existeEmpleado(Empleado empleado) {
		for(Empleado emp: empleados) {
			if(empleado.EmailDeEmpleado().equals(emp.EmailDeEmpleado()))
				return true;
		}
		return false;
	}
}
