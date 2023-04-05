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
public class Guia3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos por lado: ");
        int n = leer.nextInt();
        
        // Dibujar la primera fila del cuadrado
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Saltar a una nueva línea
        
        // Dibujar las filas intermedias del cuadrado
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* "); // Dibujar el primer asterisco de la fila
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  "); // Dibujar los espacios intermedios
            }
            System.out.println("*"); // Dibujar el último asterisco de la fila y saltar a una nueva línea
        }
        
        // Dibujar la última fila del cuadrado
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
    
}
