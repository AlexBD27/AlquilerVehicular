
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionSql {
    private static ConnectionSql instancia;
    private static String url;
    private static String nombreServidor;
    private static String numeroPuerto;
    private static String nombreBaseDato;
    private static String nombreUsuario;
    private static String clave;
    private static String conexion;
    private static Connection connect;
    
    
    public static Connection getInstancia() {
        if(connect == null){
            conectar();
        }        
        return connect;
    }
    
    
    public static void conectar() {
        conexion = url
                + nombreServidor + ":"
                + numeroPuerto + ";"
                + "databaseName=" + nombreBaseDato;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Driver no encontrado: "+e.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        
        try
        {
            connect = DriverManager.getConnection(conexion,nombreUsuario,clave);
            // Por defecto esta habilitado el modo auto-commit en la conexión            
            connect.setAutoCommit(false); //Para tener el control en forma manual           
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error de nombre de usuario y/o clave: "+e.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public static void desconectar() throws SQLException  {
	connect.close();
    }
    
}
