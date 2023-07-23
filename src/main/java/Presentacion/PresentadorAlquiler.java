/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.Alquiler;
import Dominio.Cliente;
import Dominio.ModeloAlquiler;
import Dominio.ModeloVehiculo;
import Dominio.Vehiculo;
import java.time.LocalTime;

/**
 *
 * @author USER
 */
public class PresentadorAlquiler {
    
    private ModeloAlquiler modeloAlquiler = new ModeloAlquiler();
    private ModeloVehiculo modeloVehiculo = new ModeloVehiculo();
    
    public void setTipoVehiculo (String tipoVehiculo){
        modeloVehiculo.setTipoVehiculo(tipoVehiculo);
    }
    
    public void setVehiculo(Vehiculo vehiculoAlquilado){
        modeloAlquiler.setVehiculo(vehiculoAlquilado);
    }
    
    public void setCliente(Cliente cliente){
        modeloAlquiler.setCliente(cliente);
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
    
}
