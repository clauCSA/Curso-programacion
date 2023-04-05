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
public class Guia3Ejercicio9Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        int contador = 0;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (numero > 0) {
                suma += numero;
            }
            contador++;
        } while (contador < 20);
        System.out.println("La suma de los números positivos es: " + suma);
    }
}