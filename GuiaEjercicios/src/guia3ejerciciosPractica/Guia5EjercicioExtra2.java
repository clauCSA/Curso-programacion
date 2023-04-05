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
public class Guia5EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un valor para el vector1 en la posicion " + i + "]");
            vector1[i]=leer.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Ingrese un valor para el vector2 en la posicion " + j + "]");
            vector2[j]=leer.nextInt();
        }
        System.out.println("COMPARANDO VECTORES......");
        for (int i = 0; i < 5; i++) {
            if (vector1[i] != vector2[i]){
                System.out.println("DIFERENCIA DETECTADA. FIN");
                break;
            }else if (i==4){
                System.out.println("LOS VECTORES SON IGUALES.");
            }
        }
    }
    
}
