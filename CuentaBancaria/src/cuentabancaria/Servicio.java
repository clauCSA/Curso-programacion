/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Scanner;

/**
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.

 */
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cuenta cuenta1 = new Cuenta();
    
    public Cuenta crearObjeto (){
        
        System.out.println("Ingrese el DNI:");
        
        cuenta1.setDniCliente(leer.nextInt());
        leer.next();
        System.out.println("Ingrese el numero de cuenta.");
        
        cuenta1.setDniCliente(leer.nextLong());
        leer.next();
        System.out.println("Ingrese el saldo.");
        
        cuenta1.setSaldoActual(leer.nextInt());
        leer.next();
        return cuenta1;
             
    }
    
    public void ingresarDinero (Cuenta cuenta1){
        
        System.out.println("Digite el monto a ingresar.");
        
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+leer.nextInt());
        
        System.out.println("El saldo actual despues del inmgreso de dinero es:" + cuenta1.getSaldoActual());
        
        
    }
    public int retirarDinero(Cuenta cuenta1){
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar.");
        
        int extra = leer.nextInt();
        
        if (extra>cuenta1.getSaldoActual()){
            
            System.out.println("El valor a extraer sobrepasa su saldo, se reitrara lo q hay en la cuenta " + cuenta1.getSaldoActual());
            
            System.out.println("Su saldo quedo en 0.");
                      
        }else{
            
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-extra);
            
            System.out.println("Retiro valido. Saldo actual: " + cuenta1.getSaldoActual());
            
        }
        return 0;
        
    }
    public void extraccionRapida(Cuenta cuenta1){
        
        System.out.println("Extraccion rapida. Cuanto desea retirar?");
        
        int retiro = leer.nextInt();
        
        if (retiro>cuenta1.getSaldoActual()*0.20){
            
            System.out.println("El monto ingresado supera el 20% de su saldo actual.");
            
        }else{
            
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retiro);
            
            System.out.println("Su saldo actual es de: " + cuenta1.getSaldoActual());
            
        }
            
    }
    public void consultarSaldo(Cuenta cuenta1){
        System.out.println("Desea consultar el saldo? S/N");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("s")){
            System.out.println("Su saldo es de: " + cuenta1.getSaldoActual());
        }else{
            System.out.println("Siguiente operacion.");
        }
    }
    public void consultarDatos(Cuenta cuenta1){
        System.out.println("Datos del usuario: "+cuenta1.toString());
        System.out.println("DNI : " + cuenta1.getDniCliente());
        System.out.println("Num,ero cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta1.getSaldoActual());
    }
}
