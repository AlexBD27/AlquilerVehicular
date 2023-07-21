
package AccesoDatos;

import Dominio.Cliente;
import java.sql.PreparedStatement;

public class ClienteDAO extends DAO<Cliente> {

    @Override
    public Cliente create(Cliente obj) {
        try {
            String sql = "insert into curso (DNI, nombre, fecha_nac) values (?,?,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getdni());
            statement.setString(2,obj.getNombre());
            //statement.setString(3,obj.getFechaNacimiento());
            statement.execute();
                 
        }catch (Exception e){
          e.printStackTrace();} 
      return obj;
    }

    @Override
    public Cliente read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
