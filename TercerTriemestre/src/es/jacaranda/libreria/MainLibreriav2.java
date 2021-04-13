package es.jacaranda.libreria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class MainLibreriav2 {

	public static Scanner teclado = new Scanner(System.in);
	public static Set<Publicaciones> catalogo = new HashSet<Publicaciones>();
	
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
				//Libros l = new Libros(codigo,titulo, tematica,anoPublicacion);
				//libros.add(l);
				
				if (!catalogo.add(new Libros(codigo,titulo, tematica,anoPublicacion)))
					System.out.println("No se ha podido añadir, mire si ya está en el catálogo");
				break;
				}
			
			case 2:{ 
				// Dar de alta una revista
				int codigo = leerEntero("Introduce el código de la revista");
				String titulo = leerString("Introduce el titutlo de la revista");
				Tematica tematica =Tematica.valueOf(leerString("Introduce la tematica de la revista"));
				int anoPublicacion = leerEntero("Introduce el año de la publicación");
				int numero = leerEntero("Introduce el número de la revista");
				if (!catalogo.add(new Revistas(codigo,titulo, tematica,anoPublicacion, numero)))
					System.out.println("No se ha podido añadir, mire si ya está en el catálogo");
				break;
				}
			case 3: {
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicaciones> publi = catalogo.iterator();
				boolean encontrado = false;
				while (publi.hasNext() && !encontrado) {
					Publicaciones p = publi.next();
					if (p.getTitulo().equals(titulo)) {
						if (p instanceof Revistas) {
							System.out.println("Las revistas no se prestan");
						}else if (((Libros) p).prestado()) {
							System.out.println("El libro está prestado");
						} else
							System.out.println("El libro NO está prestado");
							
					}
				}
				}
				break;
			case 4: {
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicaciones> publi = catalogo.iterator();
				boolean encontrado = false;
				while (publi.hasNext() && !encontrado) {
					Publicaciones p = publi.next();
					if (p.getTitulo().equals(titulo)) {
						if (p instanceof Revistas) {
							System.out.println("Las revistas no se prestan");
						}else if (((Libros) p).prestado()) {
							System.out.println("El libro está prestado");
						} else
							((Libros) p).prestar();
							
					}
				}
			}
				break;
			case 5: {
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicaciones> publi = catalogo.iterator();
				boolean encontrado = false;
				while (publi.hasNext() && !encontrado) {
					Publicaciones p = publi.next();
					if (p.getTitulo().equals(titulo)) {
						if (p instanceof Revistas) {
							System.out.println("Las revistas no se prestan");
						}else if (((Libros) p).prestado()) {
							((Libros) p).devolver();
						} else
							System.out.println("El libro NO está prestado");							
					}
				}
				break;
			}
			case 6: {
				
				String titulo = leerString("Introduce el título de la revista o libro");
				Iterator<Publicaciones> publi = catalogo.iterator();
				boolean encontrado = false;
				while (publi.hasNext() && !encontrado) {
					Publicaciones p = publi.next();
					if (p.getTitulo().equals(titulo)) {
						System.out.println(p);
					}
				}		
				break;
			}
			case 7: 
				for (Publicaciones  p: catalogo) {
					System.out.println(p);
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
	
	
}
