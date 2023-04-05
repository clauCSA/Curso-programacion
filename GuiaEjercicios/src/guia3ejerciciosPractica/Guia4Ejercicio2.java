/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejerciciosPractica;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñe una función que pida el nombre y la edad de N personas e 
        imprima los datos de las personas ingresadas por teclado e indique si
        son mayores o menores de edad. Después de cada persona, el programa debe
        preguntarle al usuario si quiere seguir mostrando personas y frenar 
        cuando el usuario ingrese la palabra “No”.
        */
        nombre();
    }
    
    public static void nombre() {
        Scanner leer=new Scanner(System.in);
        String nombre, respuesta;
        int edad;
        do {
            System.out.println("Ingrese su nombre.");
            nombre=leer.nextLine();
            System.out.println("Ingrese su edad.");
            edad=leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea
            
            if (edad<18) {
                System.out.println(nombre + " de " + edad + " años, es menor de edad");
            } else {
                System.out.println(nombre + " de " + edad + " años, es mayor de edad");
            }
            
            System.out.println("Si no quiere ingresar más personas escriba no.");
            respuesta=leer.nextLine();
        } while ( !respuesta.equalsIgnoreCase("no") );
        
        System.out.println("Programa finalizado");
    }
}