/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.Alquiler;
import Dominio.ModeloVehiculo;
import java.time.LocalTime;

/**
 *
 * @author USER
 */
public class PresentadorAlquiler {
    
    private Alquiler alquiler = new Alquiler();
    private ModeloVehiculo modeloVehiculo = new ModeloVehiculo();
    
    public void setAlquiler(Alquiler alquiler){
        this.alquiler = alquiler;
    }
    
    public void setTipoVehiculo (String tipoVehiculo){
        modeloVehiculo.setTipoVehiculo(tipoVehiculo);
    }
    
    public void setId (int id){
        alquiler.setId(id);
    }
    
    public void setHoraRecogida(LocalTime HoraRecogida){
        alquiler.setHoraRecogida(HoraRecogida);
    }
    
    public void setHorasFacturadas(int numeroHorasFacturadas){
        alquiler.setNumeroHorasFacturadas(numeroHorasFacturadas);
    }
    
    public void alquilar(){
        alquiler.alquilar();
    }
}
