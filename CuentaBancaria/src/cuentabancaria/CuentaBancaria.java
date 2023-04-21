/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author larry
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta();
        Servicio s1 = new Servicio();
        c1 = s1.crearObjeto();
        s1.ingresarDinero(c1);
        s1.retirarDinero(c1);
        s1.extraccionRapida(c1);
        s1.consultarSaldo(c1);
        s1.consultarDatos(c1);
    }
    
}
