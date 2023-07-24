package Dominio;

import AccesoDatos.AlquilerDAO;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ModeloAlquiler {
    
    private Alquiler alquiler;
    
    public ModeloAlquiler() {
        this.alquiler = new Alquiler();
    }
    
    public Alquiler getAlquiler() {
    	return this.alquiler;
    }
    
    public void setAlquiler(Alquiler alquiler) {
    	this.alquiler = alquiler;
    }
    
    public void setVehiculo(Vehiculo vehiculoAlquilado){
        alquiler.setVehiculoAlquilado(vehiculoAlquilado);
    }
    
    public void setCliente(Cliente cliente){
        alquiler.setCliente(cliente);
    }
    
    public void setHoraRecogida(LocalTime horaRecogida){
        alquiler.setHoraRecogida(horaRecogida);
    }
    
    public void setHorasFacturadas(int numeroHorasFacturadas){
        alquiler.setNumeroHorasFacturadas(numeroHorasFacturadas);
    }
    
    //agregar a BD
    public void alquilar() {
        AlquilerDAO alquilerDao = new AlquilerDAO();
        alquilerDao.create(alquiler);
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
    
    public List<Alquiler> obtenerAlquileres(int id){
        AlquilerDAO alquilerDao = new AlquilerDAO();
        List<Alquiler> lista = alquilerDao.listado();
        List<Alquiler> alquileresCliente = new ArrayList<>();

        for (Alquiler alquiler : lista) {
            if (alquiler.getCliente().getId() == id) {
                alquileresCliente.add(alquiler);
            }
        }
        
        for (int i = 0; i < alquileresCliente.size(); i++) {
            System.out.println("Cliente: "+alquileresCliente.get(i).getCliente().getNombre());
            System.out.println("Vehiculo: "+alquileresCliente.get(i).getVehiculoAlquilado().getDescripcion());
        }
        
        return alquileresCliente;
    }
    
}
