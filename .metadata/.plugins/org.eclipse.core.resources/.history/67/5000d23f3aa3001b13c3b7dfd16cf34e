package ejercicio.hotel;

import java.time.LocalDate;
import java.util.HashSet;

enum Instalacion1 {
	 h, s;
}

enum habitacion{
	simple,doble,suite;
}

enum sala{
	reuniones,celebraciones;
}

public abstract class Reserva {
	
	private LocalDate fechainicio;
	private LocalDate fechafin;
	private HashSet<Persona> usuarios;
	private String codigo;
	private Instalacion1 tipo;
	
	
	public Reserva(LocalDate fechainicio, LocalDate fechafin, HashSet<Persona> usuarios, String codigo,
			Instalacion1 tipo) {
		super();
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.usuarios = usuarios;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechafin() {
		return fechafin;
	}

	public void setFechafin(LocalDate fechafin) {
		this.fechafin = fechafin;
	}

	public HashSet<Persona> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashSet<Persona> usuarios) {
		this.usuarios = usuarios;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Instalacion1 getTipo() {
		return tipo;
	}

	public void setTipo(Instalacion1 tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Reserva [fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", usuarios=" + usuarios + ", codigo="
				+ codigo + ", tipo=" + tipo + "]";
	}
	

	

	
	
}


