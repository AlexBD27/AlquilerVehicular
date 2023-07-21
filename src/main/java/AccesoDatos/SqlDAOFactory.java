
package AccesoDatos;

import Dominio.Alquiler;
import Dominio.Cliente;
import Dominio.Vehiculo;

public class SqlDAOFactory extends AbstractDAOFactory {

    @Override
    public DAO<Vehiculo> getVehiculoDAO() {
        return new VehiculoDAO();
    }

    @Override
    public DAO<Alquiler> getAlquilerDAO() {
        return new AlquilerDAO();
    }

    @Override
    public DAO<Cliente> getClienteDAO() {
        return new ClienteDAO();
    }
    
}
