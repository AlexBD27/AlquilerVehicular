package Dominio;

import AccesoDatos.ClienteDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private Date fechaNacimiento;
    private boolean dniValido = false;
    
    public Cliente() {}

    public Cliente(int id, String nombre, String dni, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean DniValido(){
        return dniValido;
    }
    
    public void iniciarSesion(){
        ClienteDAO clienteDao = new ClienteDAO();
        List<Cliente> listaClientes = new ArrayList<>();
        
        for (Cliente c : listaClientes){
            if (c.getDni().equals(this.getDni())){
                dniValido = true;
            }
            else {
                dniValido = false;
            }
        }
    }
}
