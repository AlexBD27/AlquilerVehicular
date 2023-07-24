package Dominio;

import java.time.LocalTime;

public class Alquiler {
    private int id;
    private Vehiculo vehiculoAlquilado = new Bicicleta();
    private Cliente cliente = new Cliente();
    private LocalTime horaRecogida;
    private int numeroHorasFacturadas;
    
    public Alquiler() {
    }

    public Alquiler(int id, Vehiculo vehiculoAlquilado, Cliente cliente, LocalTime horaRecogida, int numeroHorasFacturadas) {
        this.id = id;
        this.vehiculoAlquilado = vehiculoAlquilado;
        this.cliente = cliente;
        this.horaRecogida = horaRecogida;
        this.numeroHorasFacturadas = numeroHorasFacturadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getVehiculoAlquilado() {
        return vehiculoAlquilado;
    }

    public void setVehiculoAlquilado(Vehiculo vehiculoAlquilado) {
        this.vehiculoAlquilado = vehiculoAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalTime getHoraRecogida() {
        return horaRecogida;
    }

    public void setHoraRecogida(LocalTime horaRecogida) {
        this.horaRecogida = horaRecogida;
    }

    public int getNumeroHorasFacturadas() {
        return numeroHorasFacturadas;
    }

    public void setNumeroHorasFacturadas(int numeroHorasFacturadas) {
        this.numeroHorasFacturadas = numeroHorasFacturadas;
    }
    
}
