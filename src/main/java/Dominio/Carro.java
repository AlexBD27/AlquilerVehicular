package Dominio;

public class Carro extends Vehiculo {
	private Categoria categoria;
	private double precioHora;
	
	public Carro(int identificacion, String descripcion) {
		super(identificacion, descripcion);
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(Categoria c) {
		this.categoria = c;
	}
	
	public double getPrecioHora() {
		switch(categoria) {
			case A:
				this.precioHora = 18;
				break;
			case B:
				this.precioHora = 14;
				break;
			case C:
				this.precioHora = 10;
				break;
		}
		return precioHora;
	}

}
