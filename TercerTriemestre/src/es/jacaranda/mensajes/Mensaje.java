package es.jacaranda.mensajes;

import java.time.LocalDateTime;

public class Mensaje {

	private Persona remitente;
	private String texto;
	private LocalDateTime fecha;
	
	public Mensaje(Persona remitente, String texto) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fecha=LocalDateTime.now();
		
	}
	
		
	
	
}
