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
public class Guia5Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        int[] vector = new int[5];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
       for (int i = 0; i < 5; i++) {
           vector[i] = (int) (Math.random() * 99999);
           System.out.println("[" + vector[i] + "]");
           String num = Integer.toString(vector[i]);
           int valor;
           valor = num.length();
           if (valor==1){
           a=a+1;
           }else if (valor==2){
               b=b+1;
           }else if (valor==3){
               c=c+1;
           }else if (valor==4){
               d=d+1;
           }else if (valor==5){
               e=e+1;
           }
       }
        System.out.println(" Numeros de 1 digito: " + a + " Numeros de 2 digito: " + b );
        System.out.println(" Numeros de 3 digito: " + c + " Numeros de 4 digito: " + d );
        System.out.println(" Numeros de 5 digito: " + e);
       }
        }
    
    

