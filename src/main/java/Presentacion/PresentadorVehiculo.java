/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Dominio.Categoria;
import Dominio.ModeloVehiculo;
import java.awt.BorderLayout;
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
    
    public void setDatosVehiculoCarro(String descripcion, Categoria categoria){
        modeloVehiculo.setDatosCarro(descripcion, categoria);
    }
    
    

}
