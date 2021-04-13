package es.jacaranda.libreria;

public class Libros extends Publicaciones implements Prestable {

	private boolean prestado;
	
	public Libros(int codigo, String titulo, Tematica tematica, int anoPublicacion) {
		super(codigo, titulo, tematica, anoPublicacion);
		prestado = false;
	}

	@Override
	public void prestar() {
		this.prestado = true;
		
	}

	@Override
	public void devolver() {
		this.prestado = false;
		
	}

	@Override
	public boolean prestado() {
		return this.prestado;
	}
	
	@Override
	public String toString() {
		return "Libro prestado=" + prestado + ", " + super.toString();
	}

	
	
	

}
