package es.jacaranda.mensajes;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void enviarMensaje(Persona destinatario, String texto) {
		
	}
	
}
