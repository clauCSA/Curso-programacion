/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejerciciosTeoria;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Guia3Ejercicio10Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        for (int i = 1; i <= 4; i++) {
            do {
                System.out.print("Ingrese un número (entre 1 y 20) para el " + i + "° número: ");
                numero = scanner.nextInt();
            } while (numero < 1 || numero > 20);
            System.out.print(numero + " ");
            for (int j = 1; j <= numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
