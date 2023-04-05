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
public class Guia5EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[10];
        int suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese los numeros:");
            vector[i] = leer.nextInt();
            suma= suma+vector[i];
            
          
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("["+vector[i]+"]" +" ");
            
        }
        
        System.out.print("la suma total es: "+ suma);
        System.out.println(" ");
    }
    
}
    
    

