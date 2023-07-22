package Dominio;

public class Bicicleta extends Vehiculo{
	    
    public Bicicleta(){
        //super(0, "");
    }

    public Bicicleta(int identificador, String descripción, double precioHora, String tipo) {
        super(identificador, descripción, precioHora, tipo);
    }
}
