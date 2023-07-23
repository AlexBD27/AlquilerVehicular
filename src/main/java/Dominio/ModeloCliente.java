
package Dominio;

import AccesoDatos.ClienteDAO;
import java.util.ArrayList;
import java.util.Date;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDatosCliente(String dni, String nombre, Date fechaNacimiento){
        cliente.setDatos(dni, nombre, fechaNacimiento);
    }
    
    public void setDniValido(boolean dniValido) {
        this.dniValido = dniValido;
    }

    public boolean isDniValido() {
        return dniValido;
    }
    
    public boolean DniValido(){
        return dniValido;
    }
    
    public void setDni(String dni) {
        cliente.setDni(dni);
    }
    
    //agregar a BD
    public void registrarCliente(){
        ClienteDAO clienteDao = new ClienteDAO(){};
        clienteDao.create(cliente);
    }
    
    public void iniciarSesion(){
        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> listaClientes = clienteDao.listado();
        
        for (Cliente c : listaClientes){
            if (c.getDni().equals(cliente.getDni())){
                dniValido = true;
                setCliente(c);
                break;
            }
            else {
                dniValido = false;
            }
        }
    }
}
