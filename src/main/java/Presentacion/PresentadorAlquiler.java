/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.Alquiler;
import Dominio.Cliente;
import Dominio.ModeloAlquiler;
import Dominio.ModeloCliente;
import Dominio.ModeloVehiculo;
import Dominio.Vehiculo;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author USER
 */
public class PresentadorAlquiler {
    
    private ModeloAlquiler modeloAlquiler = new ModeloAlquiler();
    private ModeloVehiculo modeloVehiculo = new ModeloVehiculo();
    private ModeloCliente modeloCliente = new ModeloCliente();

    public ModeloAlquiler getModeloAlquiler() {
        return modeloAlquiler;
    }

    public void setModeloAlquiler(ModeloAlquiler modeloAlquiler) {
        this.modeloAlquiler = modeloAlquiler;
    }

    public ModeloVehiculo getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public ModeloCliente getModeloCliente() {
        return modeloCliente;
    }

    public void setModeloCliente(ModeloCliente modeloCliente) {
        this.modeloCliente = modeloCliente;
    }
        
    public void setTipoVehiculo (String tipoVehiculo){
        modeloVehiculo.setTipoVehiculo(tipoVehiculo);
    }
    
    public void setVehiculo(){
        modeloAlquiler.setVehiculo(modeloVehiculo.getVehiculo());
    }
    
    public void setCliente(){
        modeloAlquiler.setCliente(modeloCliente.getCliente());
    }
    
    public void setHoraRecogida(LocalTime HoraRecogida){
        modeloAlquiler.setHoraRecogida(HoraRecogida);
    }
    
    public void setHorasFacturadas(int numeroHorasFacturadas){
        modeloAlquiler.setHorasFacturadas(numeroHorasFacturadas);
    }
    
    public void alquilar(){
        modeloAlquiler.alquilar();
    }
    
    public List<Alquiler> obtenerAlquileres(){
        return modeloAlquiler.obtenerAlquileres(modeloCliente.getCliente().getId());
    }
    
}
