

package com.mycompany.alquilervehicular;

import AccesoDatos.ClienteDAO;
import AccesoDatos.ConnectionSql;
import Dominio.Cliente;
import Presentacion.PresentadorGeneral;
import Presentacion.VistaAlquiler;
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
        System.out.println("Hello World!");   
        
        Connection con = ConnectionSql.getInstancia();
        
        
        PresentadorGeneral pG = new PresentadorGeneral();
        VistaAlquiler v = new VistaAlquiler(pG);
        v.iniciar();
        
        String fechaStr = "27-07-2003";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("Porcediendo a crear un cliente");
        ClienteDAO cDAO = new ClienteDAO();
        Cliente c = new Cliente();
        c.setDni("73887937");
        c.setNombre("Alex");
        try {
            // Parsear la cadena de fecha y obtener el objeto Date
            Date fecha = sdf.parse(fechaStr);

            // Asignar la fecha al objeto c (suponiendo que es una instancia de una clase que tiene un atributo de tipo Date llamado fechaNacimiento)
            c.setFechaNacimiento(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            // Manejar la excepción en caso de que el formato de la cadena de fecha no sea válido
        }
        cDAO.create(c);
        
    }
}
