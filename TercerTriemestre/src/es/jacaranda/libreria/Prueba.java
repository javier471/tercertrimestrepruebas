package es.jacaranda.libreria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Publicaciones> catalogo = new HashSet<Publicaciones>();
		catalogo.add(new Libros(1,"El quijote", null,1923));
		catalogo.add(new Libros(2,"El lazarillo", null,1923));
		catalogo.add(new Revistas(1,"Hola", null,1923,1));

		Iterator<Publicaciones> siguiente = catalogo.iterator();
		
		while (siguiente.hasNext()) {
			Object p = siguiente.next();
			System.out.println(p);
			System.out.println(p.getClass());
		}
		

	}

}
