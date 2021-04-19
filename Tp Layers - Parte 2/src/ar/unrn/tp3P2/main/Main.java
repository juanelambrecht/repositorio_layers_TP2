package ar.unrn.tp3P2.main;

import ar.unrn.tp3P2.ui.CargarEmpleado;
import ar.unrn.tp3P2.ui.EnviarMailEmpleado;

import java.util.ArrayList;

import ar.unrn.tp3P2.email.Email;

public class Main {

	public static void main(String[] args) {

		ArrayList<Email> listaEmails = new CargarEmpleado().retornarEmails();
		listaEmails.toString();
		for (Email email : listaEmails) {
			EnviarMailEmpleado emailEmpleado = new EnviarMailEmpleado(email);
			emailEmpleado.EnviarMail();
		}

	}

}
