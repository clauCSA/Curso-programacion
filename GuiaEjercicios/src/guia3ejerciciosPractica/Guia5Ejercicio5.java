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
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
        de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        int verificador = 0;
        System.out.println("Rellenando matriz....");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        System.out.println("Mostrando matriz original...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("Mostrando matriz transpuesta cambiada de signo...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = (matriz[j][i]) * (-1);
                System.out.print("[ " + matrizT[i][j] + " ]");

            }
            System.out.println("");
        }
        boolean esAntisimetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matrizT[i][j]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

// mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
