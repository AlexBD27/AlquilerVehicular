
package AccesoDatos;

import Dominio.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VehiculoDAO extends DAO<Vehiculo>{

    //private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public Vehiculo create(Vehiculo obj) {
        ps = null;
        sql = "insert into Vehiculo (descripcion, precio_hora, tipo, categoria) values (?,?,?,?)";
        
        try {
            ps = this.connect.prepareStatement(sql);
            
            ps.setString(1 , obj.getDescripcion());
//            ps.setDouble(2 , obj.);
//            ps.setTime(3 , sqlTime);
//            ps.setInt(4 , obj.getNumeroHorasFacturadas());
            
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
      return obj;
    }

    @Override
    public Vehiculo read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehiculo update(Vehiculo obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Vehiculo obj) {
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
            JOptionPane.showMessageDialog(null,"Transacción NO exitosa","Error...",JOptionPane.NO_OPTION);              
        } finally {
            if (ps != null){
                ps.close();
            }
          }
            
    }

    @Override
    public List<Vehiculo> listado() {
        List<Vehiculo> listaVehiculo = new ArrayList<>();
        try {
            sql = "select * from Cliente";
            ps = this.connect.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
//                Vehiculo v = new Vehiculo();
//                c.setId(rs.getInt(1));
//                c.setDni(rs.getString(2));
//                c.setNombre(rs.getString(3));
//                c.setFechaNacimiento(rs.getDate(4));
//                listaVehiculo.add(v);
            }
   
        }catch (Exception e){
          e.printStackTrace();} 
        return listaVehiculo;
    }


    
}
