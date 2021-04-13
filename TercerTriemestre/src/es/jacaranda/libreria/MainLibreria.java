package es.jacaranda.libreria;

import java.util.Arrays;
import java.util.Scanner;

public class MainLibreria {

	public static Scanner teclado = new Scanner(System.in);
	public static Publicaciones array[] = new Publicaciones[100];
	public static int numPublicaciones = 0;
	
	public static void main(String[] args) {
		
		int opc;
		
		
		do {
			mostrarMenu();
			opc = leerEntero("Introduce una opción del menú");
			switch (opc) {
			case 1: {
				// Dar de alta un libro
				int codigo = leerEntero("Introduce el código del libro");
				String titulo = leerString("Introduce el titutlo del libro");
				Tematica tematica = Tematica.valueOf(leerString("Introduce la tematica del libro"));
				int anoPublicacion = leerEntero("Introduce el año de la publicación");
				array[numPublicaciones++] = new Libros(codigo,titulo, tematica,anoPublicacion);
				break;
				}
			
			case 2:{ 
				// Dar de alta una revista
				int codigo = leerEntero("Introduce el código del libro");
				String titulo = leerString("Introduce el titutlo del libro");
				Tematica tematica = Tematica.valueOf(leerString("Introduce la tematica del libro"));
				int anoPublicacion = leerEntero("Introduce el año de la publicación");
				int numero = leerEntero("Introduce el número de la revista");
				array[numPublicaciones++] = new Revistas(codigo,titulo, tematica,anoPublicacion, numero);
				break;
				}
			case 3: {
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else {
					if (array[pos] instanceof Libros) {
						Libros l = (Libros) array[pos];
						if (l.prestado())
							System.out.println("El libro está prestado");
						else
							System.out.println("El libro NO está prestado");
					}else
						System.out.println("Las revistas no se prestan");
				}
			}
				break;
			case 4: {
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else {
					if (array[pos] instanceof Libros) {
						Libros l = (Libros) array[pos];
						if (l.prestado())
							System.out.println("El libro está prestado");
						else
							l.prestar();
					}else
						System.out.println("Las revistas no se prestan");
				}
			}
				break;
			case 5: {
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else {
					if (array[pos] instanceof Libros) {
						Libros l = (Libros) array[pos];
						if (l.prestado())
							l.devolver();
						else
							System.out.println("El libro No está prestado");
					}else
						System.out.println("Las revistas no se prestan");
				}
		
				break;
			}
			case 6: {
				
				String titulo = leerString("Introduce el título de la revista o libro");
				int pos = encuentraLibroRevista(titulo);
				if (pos == -1) System.out.println("Libro o revista no encontrada");
				else System.out.println(array[pos]);				
				break;
			}
			case 7: 
				Arrays.sort(array, 0, numPublicaciones);
				for (int i=0; i < numPublicaciones; i++) {
					System.out.println(array[i]);
				}
				break;
			case 8: 
				System.out.println("Salidendo del sistema");
				break;
			default:
				System.out.println("Opción no permitida");
			}
		}while (opc!= 8);
		
		
	
		
	}
	
	public static <E> void copiar(E[] origen, E[] destino) {
		destino[0] = origen[0];
	}
	
	public static void mostrarMenu() {
		System.out.println("1.- Dar de alta libro\n" +
				"2.- Dar de alta revista\n" +
				"3.- Comprobar si libro está prestado\n" +
				"4.- Prestar libro\n" +
				"5.- Devolver libro\n" +
				"6.- Mostrar información\n" +
				"7.- Mostrar el catálogo\n" +
				"8.- Salir");
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
	
	public static int encuentraLibroRevista(String nombre) {
		
		for (int i=0; i<numPublicaciones; i++) {
			if (nombre.equals(array[i].getTitulo())) {
				return i;
			}
		}
		return -1;
	}
}
