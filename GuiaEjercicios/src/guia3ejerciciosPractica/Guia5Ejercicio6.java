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
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y determine
        si este cuadrado es mágico o no. El programa deberá comprobar que los números 
        introducidos son correctos, es decir, están entre el 1 y el 9.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
            }*/

        int k = 0;
        int suma = 0;
        int suma2 = 0;
        int diag = 0;
        System.out.println("Ingrese numeros desde 1 hasta 9 (Inclusive 1 y 9).");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                do {
                    System.out.println("Ingrese un numero para la posicion de la matriz [" + a + "][" + b + "]");
                    matriz[a][b] = leer.nextInt();
                    if (matriz[a][b] < 1 || matriz[a][b] > 9) {
                        System.out.println("El numero no cumple con los requisitos");
                        System.out.println("Ingrese un numero desde 1 hasta 9 (Inclusive 1 y 9).");
                    }
                } while (matriz[a][b] < 1 || matriz[a][b] >= 10);
            }
            diag = diag + matriz[a][a];
        }

        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                suma = suma + matriz[c][d];
                suma2 = suma2 + matriz[c][d];
                if (d == 2 && diag == suma2 && diag == suma) {
                    k = k + 1;
                    suma = 0;
                    suma2 = 0;
                }
            }
        }
        if (k == 3) {
            System.out.println("       .-°-. LA MATRIZ ES MAGICA!! .-°-.");
            System.out.println(" --------||Columnas >>>>>>>>>>>>>>>>>>>>>");
            for (int e = 0; e < 3; e++) {
                System.out.print(" Fila-> " + e);
                for (int f = 0; f < 3; f++) {
                    System.out.print("||   [" + matriz[e][f] + "]   ||+");
                }
                System.out.println("=[15]");
            }
            System.out.println("***********************************************************");
            System.out.println(" --------||Filas >>>>>>>>>>>>>>>>>>>>>>>>>");
            for (int g = 0; g < 3; g++) {
                System.out.print(" COLUM-> " + g);
                for (int h = 0; h < 3; h++) {
                    System.out.print("||   [" + matriz[g][h] + "]   ||+");
                }
                System.out.println("=[15]");
            }
            System.out.print("DIAGONAL>");
            for (int r = 0; r < 3; r++) {
                for (int l = 0; l < 3; l++) {
                    if (r == l) {
                        System.out.print("||   [" + matriz[r][l] + "]   ||+");
                    }
                }
            }
            System.out.println("=[15]");
        } else {
            System.out.println("La matriz no es magica. Te perdiste la magia.");
        }
    }

}
