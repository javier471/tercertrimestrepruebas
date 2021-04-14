package es.jacaranda.futbol;

import java.util.HashSet;
import java.util.Iterator;

public class Equipo {
	private String nombre;
	private HashSet<Alumno> alumnos;
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new HashSet<Alumno>();
	}
	
	public void anadirAlumno(Alumno alumno) throws FutbolException {
		if (!alumnos.add(alumno))
			throw new FutbolException("Alumno repetido");
	}
	
	public void borrarAlumno(Alumno alumno) throws FutbolException {
		if (!alumnos.remove(alumno))
			throw new FutbolException("Alumno no existente");
	}
	
	public Alumno encontrarAlumno(Alumno a) {
		if (alumnos.contains(a)) {
			Iterator<Alumno> siguiente = alumnos.iterator();
			while (siguiente.hasNext()) {
				Alumno resul = siguiente.next();
				if (resul.equals(a))
					return resul;
			}
			return null;
		}else
			return null;
	}
	
	public Equipo union(Equipo e) {
		Equipo resul=new Equipo(this.nombre+"-UNION-"+e.nombre);
//		for (Alumno j: alumnos) {
//			try {
//			resul.anadirAlumno(j);
//			}
//			catch(FutbolException fe){
//				
//			}
//		}
		resul.alumnos.addAll(this.alumnos);
		resul.alumnos.addAll(e.alumnos);
		return resul;
//		for (Alumno j: e.alumnos) {
//			try {
//			resul.anadirAlumno(j);
//			}
//			catch(FutbolException fe){
//				
//			}
//		}
	}
	public Equipo interseccionEquipo(Equipo e) {
		Equipo resul=new Equipo(this.nombre+"-INTERSECCION-"+e.nombre);
		for(Alumno j:this.alumnos) {
			if(e.alumnos.contains(j)) {
				try {
					resul.anadirAlumno(j);
				}
					catch(FutbolException fe){
				}
			}
			
		}
		return resul;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
