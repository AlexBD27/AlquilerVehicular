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
    
    public List<Alquiler> obtenerAlquileres(int id){
        AlquilerDAO alquilerDao = new AlquilerDAO();
        List<Alquiler> lista = alquilerDao.listado();
        List<Alquiler> alquileresCliente = new ArrayList<>();

        for (Alquiler alquiler : lista) {
            if (alquiler.getCliente().getId() == id) {
                alquileresCliente.add(alquiler);
            }
        }        
        return alquileresCliente;
    }
    
}
