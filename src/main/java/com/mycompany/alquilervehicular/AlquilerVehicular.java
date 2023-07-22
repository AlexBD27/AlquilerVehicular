

package com.mycompany.alquilervehicular;

import AccesoDatos.ConnectionSql;
import Presentacion.PresentadorGeneral;
import Presentacion.VistaAlquiler;
import java.sql.Connection;


/**
 *
 * @author USER
 */
public class AlquilerVehicular {

    public static void main(String[] args) {
        System.out.println("Hello World!");   
        
        Connection con = ConnectionSql.getInstancia();
        
        
        PresentadorGeneral pG = new PresentadorGeneral();
        VistaAlquiler v = new VistaAlquiler(pG);
        v.iniciar();
        
    }
}
