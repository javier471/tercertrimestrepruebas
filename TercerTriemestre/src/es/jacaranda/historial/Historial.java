package es.jacaranda.historial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {
	private String usuario;
	private ArrayList<PaginaWeb> hist;

	public Historial(String usuario) {
		super();
		this.usuario = usuario;
		hist=new ArrayList<PaginaWeb>();
	}

	public void anadirPagina(String URL) {
		PaginaWeb aux=new PaginaWeb(URL);
		hist.add(aux);
		}

	public String devuelveDia(LocalDate dia) {
		String salida = "";
		for (PaginaWeb i : hist) {
			if (i.getFecha().getDayOfMonth() == dia.getDayOfMonth() && i.getFecha().getMonth() == dia.getMonth()
					&& i.getFecha().getYear() == dia.getYear()) {
				salida = salida + i.getUrl();
			}

		}
		return salida;
	}
	public void borrarHistorial() {
		this.hist.clear();
	}

	@Override
	public String toString() {
		String salida = "";
		for (PaginaWeb i : hist) {
			salida = salida + i.getUrl() + " " + i.getFecha() + "\n";
		}
		return "Historial [usuario=" + usuario + ", hist=" + salida + "]";
	}

}
