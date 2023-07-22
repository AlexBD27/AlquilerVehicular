package Dominio;

public abstract class Vehiculo {

    protected int identificador;
    protected String descripcion;
    protected double precioHora;
    protected String tipo;

    public Vehiculo() {
    }

    public Vehiculo(int identificador, String descripción, double precioHora, String tipo) {
        this.identificador = identificador;
        this.descripcion = descripción;
        this.precioHora = precioHora;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
	
    public void setIdentificador(int identificador) {
            this.identificador = identificador;
    }

    public int getIdentificador() {
            return this.identificador;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
