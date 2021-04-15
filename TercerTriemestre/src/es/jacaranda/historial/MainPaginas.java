package es.jacaranda.historial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPaginas {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Historial histo = new Historial("Paco");

		int opc;
		do {
			mostrarMenu();
			opc = leerEntero("Introduce una opción del menú");
			switch (opc) {
			case 1:
				String URL = leerString("Introduzca URL");
				histo.anadirPagina(URL);
				break;
			case 2:
				System.out.println(histo);
				break;
			case 3:
				String cadena=leerString("Introduzca fecha (dd/MM/yyyy)");
				DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fecha=LocalDate.parse(cadena,format);
				System.out.println(histo.devuelveDia(cadena));
				break;
			case 4:
				histo.borrarHistorial();
				break;
			default:
				System.out.println("Opción no válida");

			}
		} while (opc != 5);
	}

	public static void mostrarMenu() {
		System.out.println("1.- Insertar nueva página\n" + "2.- Consultar historial\n"
				+ "3.- Consultar historial de un dia\n" + "4.- Borrar historial\n" + "5.- Salir\n");
	}

	public static int leerEntero(String msg) {
		System.out.println(msg);
		int resul = Integer.parseInt(teclado.nextLine());
		return resul;
	}

	public static String leerString(String msg) {
		System.out.println(msg);
		String resul = teclado.nextLine();
		return resul;
	}

}
