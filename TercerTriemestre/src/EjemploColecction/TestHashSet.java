package EjemploColecction;

import java.util.HashSet;
import java.util.Iterator;


public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> ciudades = new HashSet<String>();
		
		if (!ciudades.add("Sevilla")) System.out.println("No se puede añadir Sevilla");
		if (!ciudades.add("Málaga")) System.out.println("No se puede añadir Málaga");
		if (!ciudades.add("Cádiz")) System.out.println("No se puede añadir Cádiz");
		if (!ciudades.add("Sevilla")) System.out.println("No se puede añadir Sevilla");
		
		for(String aux:ciudades) {
			System.out.println(aux);
		}
		System.out.println("Igual pero con iterator");
		
		
		Iterator<String> aux = ciudades.iterator();
		boolean encontrado = false;
		while (aux.hasNext() && !encontrado) {
			String cadena = aux.next();
			System.out.println(cadena);
			if (cadena.equals("Sevilla")) {
				System.out.println("encontrado Sevilla");
				encontrado = true;
			}
		}
		
		
		if (ciudades.contains("Sevilla")) System.out.println("Existe Sevilla");
		if (ciudades.contains("Brenes")) System.out.println("Existe Brenes");

		ciudades.remove("Málaga");
		ciudades.remove("Brenes");
		for(String aux1:ciudades) {
			System.out.println(aux1);
		}

	}

}
