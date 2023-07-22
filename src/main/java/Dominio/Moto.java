package Dominio;

public class Moto extends Vehiculo {

    public Moto(int identificador, String descripción, double precioHora, String tipo) {
        super(identificador, descripción, precioHora, tipo);
    }


    public Moto() {
        //super(0, ""); // Llamada al constructor de la clase base con valores predeterminados
    }
}
