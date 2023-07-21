package Dominio;

public class Moto extends Vehiculo {

    private final double precioHora = 8.0;

    public Moto(int identificacion, String descripcion) {
        super(identificacion, descripcion);
    }

    public Moto() {
        super(0, ""); // Llamada al constructor de la clase base con valores predeterminados
    }

    public double getPrecioHora() {
        return precioHora;
    }
}
