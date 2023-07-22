/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.ModeloCliente;

/**
 *
 * @author USER
 */
public class PresentadorLogin {
    
    private ModeloCliente mcliente = new ModeloCliente();
    
    public void setModeloCliente(ModeloCliente mcliente){
        this.mcliente = mcliente;
    }
    
    public void setDNI(String dni){
        mcliente.setDni(dni);
    }
    
    public void iniciarSesion(){
        mcliente.iniciarSesion();
    }
    
    public boolean Acceso(){
        return mcliente.DniValido();
    }
    
    public String mensaje(){
        if (!mcliente.DniValido()){
            return "DNI invalido";
        } else {
            return "Inicio de Sesion exitoso";
        }
    }
}
