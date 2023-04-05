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
public class Guia4Ejercicio12Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = input.nextInt();
        esMultiplo(numero1, numero2);
    }

    public static void esMultiplo(int numero1, int numero2) {
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2);
        }
    }
    
}
