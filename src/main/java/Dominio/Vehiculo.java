package Dominio;

public abstract class Vehiculo {

	protected int identificador;
	protected String descripción;
	
	public Vehiculo(int identificacion, String descripcion) {
		this.identificador = identificacion;
		this.descripción = descripcion;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripción = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripción;
	}

}
