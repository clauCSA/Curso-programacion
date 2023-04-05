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
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

        */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = input.nextDouble();
        
        System.out.print("Introduce la moneda a la que se quiere convertir (libras, dólares o yenes): ");
        String moneda = input.next().toLowerCase();
        
        convertirMoneda(euros, moneda);
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        double conversion = 0.0;
        String nombreMoneda = "";
        
        switch (moneda) {
            case "libras":
                conversion = euros * 0.86;
                nombreMoneda = "libras";
                break;
            case "dolares":
                conversion = euros * 1.28611;
                nombreMoneda = "dolares";
                break;
            case "yenes":
                conversion = euros * 129.852;
                nombreMoneda = "yenes";
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }
        
        System.out.println(euros + " euros son " + conversion + " " + nombreMoneda + ".");
    }
    
}
