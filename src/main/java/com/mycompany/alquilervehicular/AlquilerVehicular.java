

package com.mycompany.alquilervehicular;

import AccesoDatos.ConnectionSql;
import Dominio.ModeloAlquiler;
import Dominio.ModeloCliente;
import Dominio.ModeloVehiculo;
import Presentacion.PresentadorGeneral;
import Presentacion.VistaLogin;
import java.sql.Connection;
import java.text.ParseException;


/**
 *
 * @author USER
 */
public class AlquilerVehicular {

    public static void main(String[] args) throws ParseException {
        
        Connection con = ConnectionSql.getInstancia();
        
        
        ModeloCliente mCliente = new ModeloCliente();
        ModeloVehiculo mVehiculo = new ModeloVehiculo();
        PresentadorGeneral.getInstancia().setModeloPresentadorLogin(mCliente);
        PresentadorGeneral.getInstancia().setModeloPresentadorVehiculo(mVehiculo);
        PresentadorGeneral.getInstancia().setModeloPresentadorAlquiler(new ModeloAlquiler(), mVehiculo, mCliente);
        VistaLogin v = new VistaLogin(PresentadorGeneral.getInstancia());
        v.iniciar();

        
    }
}
