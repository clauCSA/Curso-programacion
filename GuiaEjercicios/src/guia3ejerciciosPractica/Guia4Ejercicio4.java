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
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**
     Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
     * para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
     Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
     * ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

     */
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es primo o no");
        num = leer.nextInt();
        /*boolean retorno = esPrimo(num); */
        System.out.println(""+esPrimo(num));
    }
    
    public static boolean esPrimo(int num){
        int cont = 0;
          if (num <= 1) {
        return false;
    }
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            cont++;
        }
    }
        if (cont > 2) {
            return false;
        }
        else{
            return true;
        }
    }
    
}
