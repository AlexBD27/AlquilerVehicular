
package AccesoDatos;

import Dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO extends DAO<Cliente> {
    
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Cliente create(Cliente obj) {
        ps = null;
        sql = "insert into Cliente (DNI,nombre,fecha_nac) values (?,?,?)";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setString(1 , obj.getDni());
            ps.setString(2 , obj.getNombre());
            java.util.Date utilDate = obj.getFechaNacimiento();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            ps.setDate(3 , sqlDate); 
            
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
      return obj;
    }

    @Override
    public Cliente read(int id) {
        Cliente c = null;
        
        sql = "select id_cliente, DNI, nombre, fecha_nac from Cliente where id_cliente = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setFechaNacimiento(rs.getDate(4));                
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }

    @Override
    public Cliente update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void ejecutarActualizacion() throws SQLException{
        try {
            ps.executeUpdate();
            conector.commit();  
            JOptionPane.showMessageDialog(null,"Transacción exitosa","Confirmación",JOptionPane.NO_OPTION);                          
            } 
        catch (SQLException ex) {
            conector.rollback();
            JOptionPane.showMessageDialog(null,"Transacción NO exitosa","Error...",JOptionPane.NO_OPTION);              
        } finally {
            if (ps != null){
                ps.close();
            }
          }
            
    }
    
}
