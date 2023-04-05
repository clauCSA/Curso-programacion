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
public class Guia5EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        double alu[][] = new double[10][5];

         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {

              // System.out.println("ingrese la nota " + (j + 1) + " del alumno" + (i + 1));
                alu[i][j] = (int)(Math. random()*10+1);
            }

        }
   
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            suma = 0;
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    suma = (suma + (double) (alu[i][j] * 0.10));
                }
                if (j == 1) {
                    suma = (suma + (double) (alu[i][j] * 0.15));
                }
                if (j == 2) {
                    suma = (suma + (double) (alu[i][j] * 0.25));
                }
                if (j == 3) {
                    suma = suma + (double) (alu[i][j] * 0.50);
                }
                if (j == 4) {
                    alu[i][j] = suma;
                }
            }
        }
      
        int aludesp = 0, aluaprob = 0;

        for (int i = 0; i < 10; i++) {
            if (alu[i][4] < 7) {
                aludesp++;
            } else {
                aluaprob++;
            }

        }
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + alu[i][j] + "]");
            }
            System.out.println(" ");
        }
          
        System.out.println("los alumnos desaprobados son: " + aludesp);
        System.out.println("los alumnos aprobados son: " + aluaprob);
    }

}
    
    

