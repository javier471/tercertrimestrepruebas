package es.jacaranda.libreria;

public class Revistas extends Publicaciones{
	private int numero;
	
	public Revistas(int codigo, String titulo, Tematica tematica, int anoPublicacion, int numero) {
		super(codigo, titulo, tematica, anoPublicacion);
		this.numero = numero;
	}

	
	public int getNumero() {
		return numero;
	}


	@Override
	public String toString() {
		return "Revistas numero=" + numero + ", " + super.toString();
	}
	
	

}
