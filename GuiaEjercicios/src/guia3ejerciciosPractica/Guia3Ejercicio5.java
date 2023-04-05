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
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, 
        y a continuación solicite números al usuario hasta que la suma de 
        los números introducidos supere el límite inicial.

        */
        int numero, valorTotal;
        int suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor limite,");
        valorTotal=leer.nextInt();
        while (valorTotal>suma){
            System.out.println("Ingrese un numero");
            numero=leer.nextInt();
            suma=suma+numero;
        }
    }
    
}
