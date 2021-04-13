package es.jacaranda.futbol;

public class MainFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo marchena = new Equipo("Marchena");
		Alumno a;
		try {
			a = new Alumno("Pablo","1");
			marchena.anadirAlumno(a);
			a = new Alumno("Pepe","2");
			marchena.anadirAlumno(a);
			
			
		}catch(FutbolException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Error inesperado");
		}
		
		
		System.out.println(marchena.toString());
		
		a = new Alumno("Pablo","1");
		Alumno resul = marchena.encontrarAlumno(a);
		if (resul == null )
			System.out.println("Alumno no encontrado");
		else {
			resul.setDni("20");
			resul.setNombre("inma");
		}
		System.out.println(marchena.toString());
			
		
		
	}

}
