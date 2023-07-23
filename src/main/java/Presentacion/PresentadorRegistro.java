/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.ModeloCliente;
import java.util.Date;

/**
 *
 * @author USER
 */
public class PresentadorRegistro {
    
    private ModeloCliente modeloCliente = new ModeloCliente();
    
    public PresentadorRegistro(){
    
    }
    
    public ModeloCliente getModeloCliente(){
        return modeloCliente;
    }
    
    public void setModeloCliente(ModeloCliente mcliente){
        this.modeloCliente = mcliente;
    }
    
    public void setDNI(String dni){
        modeloCliente.setDni(dni);
    }
    
    public void setNombre(String nombre){
        modeloCliente.setNombre(nombre);
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        modeloCliente.setFechaNacimiento(fechaNacimiento);
    }
    
    public void registrar(){
        modeloCliente.registrarCliente();
    }
}
