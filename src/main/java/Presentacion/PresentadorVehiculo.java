/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.*;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class PresentadorVehiculo {

    private ModeloVehiculo modeloVehiculo = new ModeloVehiculo();

    public PresentadorVehiculo() {

    }

    public void cambiarTipoVehiculo(JPanel base, JPanel siguiente) {
        siguiente.setSize(690, 570);
        siguiente.setLocation(0, 0);
        base.removeAll();
        base.add(siguiente, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }

    public void setModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        modeloVehiculo.setTipoVehiculo(tipoVehiculo);
    }

    public void setDatosVehiculoCarro(String descripcion, Categoria categoria) {
        modeloVehiculo.setDatosCarro(descripcion, categoria);
    }

    public void setDatosVehiculoMoto(String descripcion) {
        modeloVehiculo.setDatosMoto(descripcion);
    }

    public void setDatosVehiculoBicicleta(String descripcion) {
        modeloVehiculo.setDatosBicicleta(descripcion);
    }

    public List<Carro> obtenerCarros() {
        return modeloVehiculo.obtenerCarros();
    }


    public List<Moto> obtenerMotos() {
        return modeloVehiculo.obtenerMotos();
    }

    public List<Bicicleta> obtenerBicicletas() {
        return modeloVehiculo.obtenerBicicletas();
    }
}
