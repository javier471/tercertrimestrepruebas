package es.jacaranda.enumerados;

import java.util.Arrays;
import java.util.Scanner;

public class pruebaEnumerado {
	
	enum Dia
	{
	 LUNES("8:3, 4:7"), MARTES("8:3"), MIERCOLES("8:3, 4:7") , 
	 JUEVES("8:3"),
	 VIERNES("8:3"), SABADO(""), DOMINGO("");
		private String horasTrabajo;
		Dia(String hora){ this.horasTrabajo = hora;}
		public String getHorasTrabajo() { return this.horasTrabajo;}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String s1="Inma", s2 ="Inma";
		System.out.println(s2.compareTo(s1));
		
		
//		Persona persona[] = new Persona[3];
//		
//		persona[0] = new Persona("Inma",25);
//		persona[1] = new Persona("Pepe",50);
//		persona[2] = new Persona("Juan",5);
//		
//		
//		for (int i=0;i< persona.length;i++) {
//			System.out.println(persona[i]);
//		}
//		
//		Arrays.sort(persona);
//		
//		System.out.println("despues de ordenar");
//		System.out.println("");
//		
//		for (int i=0;i< persona.length;i++) {
//			System.out.println(persona[i]);
//		}
		
//		System.out.println("Introduce el día de la semana en mayúsculas");
//		String respuesta = teclado.nextLine().toUpperCase();
//		
//		try {
//			
//		
//			Dia dia = Dia.valueOf(respuesta);
//			
//			switch (dia)
//			 {
//			 case LUNES:
//				 System.out.println("Los lunes son feos."+ dia.getHorasTrabajo());
//				 break;
//			 case VIERNES:
//				 System.out.println("Los viernes son mejores.");
//				 break;
//			 case SABADO:
//			 case DOMINGO:
//				 System.out.println("Los fines de semana son mejores.");
//				 break;
//			 default:
//				 System.out.println("Los días entre semana son regulares.");
//			 break;
//			 }
//		}catch (Exception e) {
//			System.out.println("Dia no válido");
//		}
	}

}
