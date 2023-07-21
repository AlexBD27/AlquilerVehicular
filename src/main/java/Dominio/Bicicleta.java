package Dominio;

public class Bicicleta extends Vehiculo{
	
	private final double precioHora = 2.0;
 public Bicicleta(){
     super(0, "");
 }

    public Bicicleta(int identificador, String descripcion) {
        super(identificador, descripcion);
    }

    public double getPrecioHora() {
        return precioHora;
    }
}
