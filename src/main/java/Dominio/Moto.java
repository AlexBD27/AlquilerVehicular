package Dominio;

public class Moto extends Vehiculo{
	
	private final double precioHora = 8.0;
	
	public Moto(int identificacion, String descripcion) {
		super(identificacion, descripcion);
	}
	
	public double getPrecioHora() {
        return precioHora;
    }
}
