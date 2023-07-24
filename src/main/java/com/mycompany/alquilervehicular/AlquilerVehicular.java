

package com.mycompany.alquilervehicular;

import AccesoDatos.ClienteDAO;
import AccesoDatos.ConnectionSql;
import Dominio.Cliente;
import Dominio.ModeloAlquiler;
import Dominio.ModeloCliente;
import Dominio.ModeloVehiculo;
import Presentacion.PresentadorGeneral;
import Presentacion.VistaAlquiler;
import Presentacion.VistaLogin;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
