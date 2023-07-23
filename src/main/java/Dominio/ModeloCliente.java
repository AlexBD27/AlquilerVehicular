
package Dominio;

import AccesoDatos.ClienteDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOLANDA
 */
public class ModeloCliente {
    
    private Cliente cliente;
    private boolean dniValido;
    
    public ModeloCliente(){
        cliente = new Cliente();
    }
    
    public boolean DniValido(){
        return dniValido;
    }
    
    public void setDni(String dni) {
        cliente.setDni(dni);
    }
    
    public void iniciarSesion(){
        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> listaClientes = clienteDao.listado();
        
        for (Cliente c : listaClientes){
            if (c.getDni().equals(cliente.getDni())){
                dniValido = true;
            }
            else {
                dniValido = false;
            }
        }
    }
}
