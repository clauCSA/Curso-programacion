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
public class Guia5EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.*/
        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void llenarVector(int[] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() *100); // Genera números aleatorios entre 0 y 99
        }
    }
    
    public static void imprimirVector(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
}
