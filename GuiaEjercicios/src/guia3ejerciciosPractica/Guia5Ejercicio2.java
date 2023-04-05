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
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

        */      
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = sc.nextInt();
        int vector[]=null;
        vector=new int[n];
            for (int i = 0; i < n; i++) {
        
            vector[i]=(int) (Math.random() * 10);
             
   
}
         System.out.println("Ingrese numero para ver si se encuentra en vector");
         int numero = sc.nextInt();
         int C = 0;
       for (int i = 0; i < n; i++) {
        if (numero==vector[i]) {
            C = C+1;
            System.out.println("El vector con esa informacion se encuentra en la posicion " + i );
        }         	 
        }
       if (C >=2){
           System.out.println( "El numero se repite en el vector: " + C + " veces");
       }
       if (C==0) {
            System.out.println( "El numero no se encuentra en el vector");
       }
        for (int i = 0; i < n; i++) {
        
           	 
        System.out.println("[" + vector[i] + "]");  
        }
    }
}  
