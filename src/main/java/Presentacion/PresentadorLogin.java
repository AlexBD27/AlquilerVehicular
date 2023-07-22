/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.Cliente;

/**
 *
 * @author USER
 */
public class PresentadorLogin {
    
    private Cliente cliente;
    
    public void setModeloCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setDNI(String dni){
        cliente.setDni(dni);
    }
    
    public void iniciarSesion(){
        cliente.iniciarSesion();
    }
    
    public boolean Acceso(){
        return cliente.DniValido();
    }
    
    public String mensaje(){
        if (!cliente.DniValido()){
            return "DNI invalido";
        } else {
            return "Inicio de Sesion exitoso";
        }
    }
}
