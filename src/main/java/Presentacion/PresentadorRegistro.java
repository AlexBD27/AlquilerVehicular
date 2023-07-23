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
    
    public void setModelo(ModeloCliente mcliente){
        this.modeloCliente = mcliente;
    }
    
    public void setDatosCliente(String dni, String nombre, Date FechaNacimiento){
        this.modeloCliente.setDatosCliente(dni, nombre, FechaNacimiento);
    }
    
    public void registrar(){
        modeloCliente.registrarCliente();
    }
}
