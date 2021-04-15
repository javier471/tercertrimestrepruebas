package es.jacaranda.historial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {
	private String usuario;
	private ArrayList<PaginaWeb> hist;

	public Historial(String usuario) {
		super();
		this.usuario = usuario;
		hist = new ArrayList<PaginaWeb>();
	}

	public void anadirPagina(String URL) {
		PaginaWeb aux = new PaginaWeb(URL);
		hist.add(aux);
	}

	public String devuelveDia(String dia) {
		String salida = "";
		for (PaginaWeb i : hist) {
//			if (i.getFecha().getDayOfMonth() == dia.getDayOfMonth() && i.getFecha().getMonth() == dia.getMonth()
//					&& i.getFecha().getYear() == dia.getYear()) {
			LocalDate dia;
			dia=LocalDate parse(dia);
			if ((i.getFecha()).toLocalDate().equals(dia)) {
			salida = salida + i.getUrl() + "\n";	
			}
		}

		
		return salida;
	}

	public void borrarHistorial() {
		this.hist.clear();
	}

	@Override
	public String toString() {
		StringBuilder salida = new StringBuilder();
		for (PaginaWeb i : hist) {
			salida.append(i.getUrl() + " " + i.getFecha() + "\n");
		}
		return "Historial [usuario=" + usuario + ", hist=" + salida + "]";
	}

}
