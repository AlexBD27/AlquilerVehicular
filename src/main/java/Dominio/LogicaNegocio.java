package Dominio;

import java.time.LocalTime;

public class LogicaNegocio {
	private Alquiler alquiler;

    public LogicaNegocio() {
        this.alquiler = new Alquiler();
    }

    public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente, LocalTime horaRecogida, int numeroHorasFacturadas) {
        alquiler.setVehiculoAlquilado(vehiculo);
        alquiler.setCliente(cliente);
        alquiler.setHoraRecogida(horaRecogida);
        alquiler.setNumeroHorasFacturadas(numeroHorasFacturadas);
    }

    public int calcularVolumenTotalHorasAlquiladas() {
        return alquiler.getNumeroHorasFacturadas();
    }

    public double calcularVolumenTotalDineroFacturado() {
        Vehiculo vehiculo = alquiler.getVehiculoAlquilado();
        double precioHora = 0.0;
        if (vehiculo instanceof Carro) {
            Carro carro = (Carro) vehiculo;
            precioHora = carro.getPrecioHora();
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            precioHora = moto.getPrecioHora();
        } else if (vehiculo instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) vehiculo;
            precioHora = bicicleta.getPrecioHora();
        }
        return precioHora * alquiler.getNumeroHorasFacturadas();
    }
    
    public Alquiler getAlquiler() {
    	return this.alquiler;
    }
    
    public void setAlquiler(Alquiler alquiler) {
    	this.alquiler = alquiler;
    }
}
