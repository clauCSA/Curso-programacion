/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está
 entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia3ejerciciosTeoria;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Guia3Ejercicio8Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nota;
        do{
        System.out.println("Escriba el valor de la nota");
        nota=leer.nextInt();
        if (nota<0 || nota>10){
            System.out.println("Ingreso un valor incorrecto.");
        }
        }while(nota<0 || nota>10);
        if (nota>=0 && nota<=10){
            System.out.println("La nota esta comprendida entre 0 y 10");
        }
    }
    
}
