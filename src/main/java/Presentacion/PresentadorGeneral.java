/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

/**
 *
 * @author USER
 */
public class PresentadorGeneral {

    private PresentadorLogin pLogin;
    private PresentadorAlquiler pAlquiler;
    private PresentadorVehiculo pVehiculo;
    private static PresentadorGeneral pGeneral;

    public PresentadorGeneral() {
        pLogin = new PresentadorLogin();
        pAlquiler = new PresentadorAlquiler();
        pVehiculo = new PresentadorVehiculo();
    }

    public static PresentadorGeneral getInstancia() {
        if (pGeneral == null) {
            return pGeneral = new PresentadorGeneral();
        } else {
            return pGeneral;
        }
    }

    public PresentadorLogin getpLogin() {
        return pLogin;
    }

    public PresentadorAlquiler getpAlquiler() {
        return pAlquiler;
    }

    public PresentadorVehiculo getpVehiculo() {
        return pVehiculo;
    }

    public static PresentadorGeneral getpGeneral() {
        return pGeneral;
    }

}
