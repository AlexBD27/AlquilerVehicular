package Dominio;

public class Carro extends Vehiculo {
	private Categoria categoria;
	private double precioHora;
        
        public Carro(){
            super(0, "");
        }
         // solo para poblar
	
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
			case A -> this.precioHora = 18;
			case B -> this.precioHora = 14;
			case C -> this.precioHora = 10;
		}
		return precioHora;
	}

}
