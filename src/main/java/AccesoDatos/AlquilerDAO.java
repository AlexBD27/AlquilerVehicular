
package AccesoDatos;

import Dominio.Alquiler;
import Dominio.Cliente;
import Dominio.Vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlquilerDAO extends DAO<Alquiler>{
    
    //private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Alquiler create(Alquiler obj) {
        ps = null;
        sql = "insert into Alquiler (id_vehiculo,id_cliente, hora_recojo, cantidad_horas) values (?,?,?,?)";
        
        try {
            ps = this.connect.prepareStatement(sql);
            
            ps.setInt(1 , obj.getVehiculoAlquilado().getIdentificador());
            System.out.println("id vehiculo: "+obj.getVehiculoAlquilado().getIdentificador() );
            ps.setInt(2 , obj.getCliente().getId());
            System.out.println("id cliente: "+obj.getCliente().getId());
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
            ps = this.connect.prepareStatement(sql);
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
            this.connect.commit();  
            JOptionPane.showMessageDialog(null,"Transacción exitosa","Confirmación",JOptionPane.NO_OPTION);                          
            } 
        catch (SQLException ex) {
            this.connect.rollback();
            JOptionPane.showMessageDialog(null,"Transacción NO exitosa"+ ex.getMessage(),"Error...",JOptionPane.NO_OPTION);
            
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
                
                VehiculoDAO vDAO = new VehiculoDAO();
                Vehiculo v = vDAO.read(rs.getInt(2));
                alquiler.setVehiculoAlquilado(v);
                //alquiler.getVehiculoAlquilado().setIdentificador(rs.getInt(2));
                
                ClienteDAO cDAO = new ClienteDAO();
                Cliente c = cDAO.read(rs.getInt(3));
                alquiler.setCliente(c);
                //alquiler.getCliente().setId(rs.getInt(3));
                
                java.sql.Time sqlTime = rs.getTime(4);
                LocalTime horaRecogida = sqlTime.toLocalTime();
                alquiler.setHoraRecogida(horaRecogida);
                alquiler.setNumeroHorasFacturadas(rs.getInt(5));
                listaAlquiler.add(alquiler);
            }
   
        }catch (Exception e){
          e.printStackTrace();} 
        return listaAlquiler;
    }

}
