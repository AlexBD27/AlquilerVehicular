
package AccesoDatos;

import Dominio.Alquiler;
import Dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlquilerDAO extends DAO<Alquiler>{
    
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Alquiler create(Alquiler obj) {
        ps = null;
        sql = "insert into Alquiler (id_vehiculo,id_cliente, hora_recojo, cantidad_horas) values (?,?,?,?)";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setInt(1 , obj.getVehiculoAlquilado().getIdentificador());
            ps.setInt(2 , obj.getCliente().getId());
            LocalTime horaRecogida = obj.getHoraRecogida();
            java.sql.Time sqlTime = java.sql.Time.valueOf(horaRecogida);
            ps.setTime(3 , sqlTime);
            ps.setInt(4 , obj.getNumeroHorasFacturadas());
            
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
      return obj;
    }

    @Override
    public Alquiler read(int id) {
        Alquiler alquiler = null;
        
        sql = "select id_alquiler, id_vehiculo, id_cliente, hora_recojo, cantidad_horas from Alquiler where id_alquiler = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                alquiler = new Alquiler();
                alquiler.setId(rs.getInt(1));
                alquiler.getVehiculoAlquilado().setIdentificador(rs.getInt(2));
                alquiler.getCliente().setId(rs.getInt(3));
                java.sql.Time sqlTime = rs.getTime(4);
                LocalTime horaRecogida = sqlTime.toLocalTime();
                alquiler.setHoraRecogida(horaRecogida);
                alquiler.setNumeroHorasFacturadas(rs.getInt(5));
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alquiler;
    }

    @Override
    public Alquiler update(Alquiler obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Alquiler obj) {
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

    @Override
    public List<Alquiler> listado() {
        List<Alquiler> listaAlquiler = new ArrayList<>();
        try {
            sql = "select * from Alquiler";
            ps = this.connect.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Alquiler alquiler = new Alquiler();
                alquiler.setId(rs.getInt(1));
                alquiler.getVehiculoAlquilado().setIdentificador(rs.getInt(2));
                alquiler.getCliente().setId(rs.getInt(3));
                java.sql.Time sqlTime = rs.getTime(4);
                LocalTime horaRecogida = sqlTime.toLocalTime();
                alquiler.setHoraRecogida(horaRecogida);
                alquiler.setNumeroHorasFacturadas(rs.getInt(5));
            }
   
        }catch (Exception e){
          e.printStackTrace();} 
        return listaAlquiler;
    }

}
