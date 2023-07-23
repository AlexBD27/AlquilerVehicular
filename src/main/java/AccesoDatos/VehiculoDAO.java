
package AccesoDatos;

import Dominio.Bicicleta;
import Dominio.Carro;
import Dominio.Categoria;
import Dominio.Moto;
import Dominio.Vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            ps.setDouble(2 , obj.getPrecioHora());
            ps.setString(3 , obj.getTipo());
            if(obj instanceof Carro){
                ps.setString(4 , ((Carro) obj).getCategoria().name());
            }
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
      return obj;
    }

    @Override
    public Vehiculo read(int id) {
        Vehiculo v = null;
        sql = "select * from Vehiculo where id_vehiculo = ?";
        
        try {
            ps = this.connect.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if(rs.getString(5)!=null){
                    v = new Carro();
                    Carro c = (Carro) v;
                    c.setIdentificador(rs.getInt(1));
                    c.setDescripcion(rs.getString(2));
                    c.setPrecioHora(rs.getDouble(3));
                    c.setTipo(rs.getString(4));
                    c.setCategoria(Categoria.valueOf(rs.getString(5)));
                }else if("Moto".equals(rs.getString(4))){
                    v = new Moto();
                    v.setIdentificador(rs.getInt(1));
                    v.setDescripcion(rs.getString(2));
                    v.setPrecioHora(rs.getDouble(3));
                    v.setTipo(rs.getString(4));
                }else{
                    v = new Bicicleta();
                    v.setIdentificador(rs.getInt(1));
                    v.setDescripcion(rs.getString(2));
                    v.setPrecioHora(rs.getDouble(3));
                    v.setTipo(rs.getString(4));
                }                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return v;
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
            sql = "select * from Vehiculo";
            ps = this.connect.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Vehiculo v;
                if(rs.getString(5)!=null){
                    v = new Carro();
                    Carro c = (Carro) v;
                    c.setIdentificador(rs.getInt(1));
                    c.setDescripcion(rs.getString(2));
                    c.setPrecioHora(rs.getDouble(3));
                    c.setTipo(rs.getString(4));
                    c.setCategoria(Categoria.valueOf(rs.getString(5)));
                    listaVehiculo.add(c);
                }else if("Moto".equals(rs.getString(4))){
                    v = new Moto();
                    v.setIdentificador(rs.getInt(1));
                    v.setDescripcion(rs.getString(2));
                    v.setPrecioHora(rs.getDouble(3));
                    v.setTipo(rs.getString(4));
                    listaVehiculo.add(v);
                }else{
                    v = new Bicicleta();
                    v.setIdentificador(rs.getInt(1));
                    v.setDescripcion(rs.getString(2));
                    v.setPrecioHora(rs.getDouble(3));
                    v.setTipo(rs.getString(4));
                    listaVehiculo.add(v);
                }
            }
        }catch (Exception e){
          e.printStackTrace();} 
        return listaVehiculo;
    }


    
}
