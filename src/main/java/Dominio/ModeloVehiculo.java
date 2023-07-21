/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ANGIE
 */
public class ModeloVehiculo {

    private Vehiculo vehiculo;
    private Carro carroTmp;
    private Moto motoTmp;
    private Bicicleta bicicletatmp;
    private int idVehiculo;

    ModeloVehiculo() {

    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Carro getCarroTmp() {
        return carroTmp;
    }

    public void setCarroTmp(Carro carroTmp) {
        this.carroTmp = carroTmp;
    }

    public Moto getMotoTmp() {
        return motoTmp;
    }

    public void setMotoTmp(Moto motoTmp) {
        this.motoTmp = motoTmp;
    }

    public Bicicleta getBicicletatmp() {
        return bicicletatmp;
    }

    public void setBicicletatmp(Bicicleta bicicletatmp) {
        this.bicicletatmp = bicicletatmp;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

public void setTipoVehiculo(String tipoVehiculo, int identificacion, String descripcion) {
    switch (tipoVehiculo) {
        case "CARRO" -> this.vehiculo = new Carro(identificacion, descripcion);
        case "MOTO" -> this.vehiculo = new Moto(identificacion, descripcion);
        case "BICICLETA" -> this.vehiculo = new Bicicleta(identificacion, descripcion);
    }
}


    public void setDatosCarro(String descripcion, Categoria categoria) {
        if (vehiculo instanceof Carro) {
            Carro carro = (Carro) vehiculo;
            carro.setDescripcion(descripcion);
            carro.setCategoria(categoria);
        }
    }

    public void setDatosMoto(String descripcion) {
        if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.setDescripcion(descripcion);
        }
    }

    public void setDatosBicicleta(String descripcion) {
        if (vehiculo instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) vehiculo;
            bicicleta.setDescripcion(descripcion);
        }
    }

    public void getTipoVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            carroTmp = (Carro) vehiculo;
        } else if (vehiculo instanceof Moto) {
            motoTmp = (Moto) vehiculo;
        } else if (vehiculo instanceof Bicicleta) {
            bicicletatmp = (Bicicleta) vehiculo;
        }
    }
}
