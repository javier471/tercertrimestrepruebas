package es.jacaranda.historial;

import java.util.ArrayList;

public class Historial {
	private String usuario;
	private ArrayList<PaginaWeb> hist;
	
	public Historial(String usuario, ArrayList<PaginaWeb> hist) {
		super();
		this.usuario = usuario;
		this.hist = hist;
	}

	
}
