package ejercicio.hotel;

public enum TipoSala {
	SIMPLE(1,1.15),DOBLE(1,2.15);
	public int numPersonasMax;
	public double factor;
	
	private TipoSala(int numPersonasMax, double factor) {
		this.numPersonasMax = numPersonasMax;
		this.factor = factor;
	}
	
	
}
