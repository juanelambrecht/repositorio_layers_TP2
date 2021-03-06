package ar.unrn.tp3P2.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleados implements Serializable {

	private static final long serialVersionUID = 1L;

	String apellido, nombre, fecha_de_nacimiento, email;

	public Empleados(String apellido, String nombre, String fecha_de_nacimiento, String email) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.email = email;
	}

	public Empleados() {

	}

	@Override
	public String toString() {
		return "Empleado [apellido=" + apellido + ", nombre=" + nombre + ", fecha_de_nacimiento=" + fecha_de_nacimiento
				+ ", email=" + email + "]";
	}

	public boolean esSuCumpleaņos() {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd");
		System.out.println("\n cumpleaņos del empleado " + this.nombre + ": "
				+ this.fecha_de_nacimiento.substring(5, 10) + " - fecha de hoy: " + localDate.format(formatter));
		return localDate.format(formatter).equals(this.fecha_de_nacimiento.substring(5, 10));
	}

	public String EmailDeEmpleado() {
		return email;
	}

}
