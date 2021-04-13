package es.jacaranda.enumerados;

public class Persona implements Comparable {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Persona otra = (Persona) o;
		
		return this.nombre.compareTo(otra.nombre);
		
	}
	
	

	
	
	

}
