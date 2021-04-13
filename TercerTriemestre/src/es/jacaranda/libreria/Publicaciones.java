package es.jacaranda.libreria;

enum Tematica {
	 Aventura, Historia, Acción;
}

public abstract class  Publicaciones implements Comparable<Publicaciones>{
	private int codigo;
	private String titulo;
	private Tematica tematica;
	private int anoPublicacion;
	
	
	public Publicaciones(int codigo, String titulo, Tematica tematica, int anoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.tematica = tematica;
		this.anoPublicacion = anoPublicacion;
	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setTitulo(String nombre) {
		this.titulo = nombre;
	}


	public int getAnoPublicacion() {
		return anoPublicacion;
	}



	public String getTitulo() {
		return titulo;
	}



	@Override
	public String toString() {
		return "Codigo=" + codigo + ", Título=" + titulo + ", Tematica=" + tematica + ", Año ublicación="
				+ anoPublicacion;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Publicaciones other = (Publicaciones) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	

	@Override
	public int compareTo(Publicaciones o) {
		if (titulo.compareTo(o.titulo) == 0) {
			return this.codigo - o.codigo;
		}else
			return this.titulo.compareTo(o.getTitulo());
	}
	
	
}
