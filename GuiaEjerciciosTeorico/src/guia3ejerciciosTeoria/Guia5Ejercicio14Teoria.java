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
public class Guia5Ejercicio14Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
        */
        
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[11];
        for (int i=0; i < 11; i++) {
            System.out.println("Ingrese el nombre del compañero de equipo " + (i+1));
            Equipo[i] = leer.nextLine();
        }
        for (int j = 0; j < 11; j++) {
            System.out.println("Nombre compañero: " + Equipo[j]);
        }
    }
}
