package es.jacaranda.historial;

import java.time.LocalDateTime;

public class PaginaWeb {
	
private String url;
private LocalDateTime fecha;

public PaginaWeb(String url) {
	super();
	this.url = url;
	LocalDateTime.now();
}

public String getUrl() {
	return url;
}

public LocalDateTime getFecha() {
	return fecha;
}

@Override
public String toString() {
	return "PaginaWeb [url=" + url + ", fecha=" + fecha + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
	result = prime * result + ((url == null) ? 0 : url.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PaginaWeb other = (PaginaWeb) obj;
	if (fecha == null) {
		if (other.fecha != null)
			return false;
	} else if (!fecha.equals(other.fecha))
		return false;
	if (url == null) {
		if (other.url != null)
			return false;
	} else if (!url.equals(other.url))
		return false;
	return true;
}



}
