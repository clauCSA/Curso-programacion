/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejerciciosPractica;

/**
 *
 * @author larry
 */
public class Guia5EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

         */
        int[][] matriz = new int[4][4];
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                suma = suma + matriz[i][j];
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
            int sumaf = 0, sumac = 0;
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                sumaf = 0;
                sumac = 0;
                for (int k = 0; k < 4; k++) {
                    sumaf = sumaf + matriz[j][k];
                    sumac = sumac + matriz[k][j];
                }
                System.out.println("La suma de las filas" + (j + 1) + " es " + sumaf);
                System.out.println("La suma de las columnas" + (j + 1) + " es " + sumac);
            }
            
        }
        
    }


