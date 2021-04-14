package es.jacaranda.futbol;

public class MainFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo marchena = new Equipo("Marchena");
		Alumno a;
		try {
			a = new Alumno("Pablo", "1");
			marchena.anadirAlumno(a);
			a = new Alumno("Pepe", "2");
			marchena.anadirAlumno(a);

		} catch (FutbolException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error inesperado");
		}

		System.out.println(marchena.toString());

		a = new Alumno("Pablo", "1");
		Alumno resul = marchena.encontrarAlumno(a);
		if (resul == null)
			System.out.println("Alumno no encontrado");
		else {
			resul.setDni("20");
			resul.setNombre("inma");
		}
		System.out.println(marchena.toString());

		Equipo betis = new Equipo("Betis");
		Alumno paco = new Alumno("Paco", "1");
		Alumno antonio = new Alumno("Antonio", "5");
		Alumno pepe = new Alumno("Pepe", "2");
		try {
			betis.anadirAlumno(paco);
			betis.anadirAlumno(antonio);
			betis.anadirAlumno(pepe);
		} catch (FutbolException fe) {

		}
		System.out.println(betis);
		Equipo betismarchena=betis.union(marchena);
		System.out.println(betismarchena);
		Equipo inter=betis.interseccionEquipo(marchena);
		System.out.println(inter);
	}

}
