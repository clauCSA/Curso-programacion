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
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
    String opcion;
  Scanner nombre=new Scanner(System.in);
  do{
      System.out.println("|---Menu---|");  
      System.out.println("[1]-Suma");
      System.out.println("[2]-Resta");
      System.out.println("[3]-Multiplicacion");
      System.out.println("[4]-Division");
      System.out.println("[5]-Salir"); 
      System.out.println("**Elija una opcion**");
      numero1=nombre.nextInt();
      nombre.nextLine();
      switch(numero1){
                case 1:
                    System.out.println("sumar");
                    continue;
                case 2:
                    System.out.println("resta");
                    continue;
                case 3:
                    System.out.println("3-multiplicacion");
                    continue;
                case 4:
                    System.out.println("4-division");
                    continue;
                case 5:
                    System.out.println("quieres salir s/n");
                    opcion=nombre.nextLine().toLowerCase();
                    if (opcion.equalsIgnoreCase("s")){  
                      numero1=6;
                  }
                    
            }
  }while(numero1<6);
    }
    
}
