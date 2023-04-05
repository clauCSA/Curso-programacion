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
public class Guia3Ejercicio6Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("Ambos numeros son mayores a 25");
        }else if(num1>25 && num2<=25){
            System.out.println("El primero numero es mayor a 25");
        }else if(num2>25 && num1<=25){
            System.out.println("El segundo numero es mayor 25");
        }else if(num1<26 && num2<26){
            System.out.println("Ambos numeros son menor o igual a 25");
        }
    }
    
}
