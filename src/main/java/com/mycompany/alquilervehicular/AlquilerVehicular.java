

package com.mycompany.alquilervehicular;

import AccesoDatos.ConnectionSql;
import java.sql.Connection;


/**
 *
 * @author USER
 */
public class AlquilerVehicular {

    public static void main(String[] args) {
        System.out.println("Hello World!");   
        
        Connection con = ConnectionSql.getInstancia();
    }
}
