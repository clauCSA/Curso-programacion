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
public class Guia4Ejercicio11Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una secuencia de caracteres terminada en punto: ");
        String palabra = input.nextLine();
        String conversor = conversor(palabra);
        System.out.println("Secuencia codificada: " + conversor);

    public static String conversor(String sequence) {
        String conversor = "";
        for (int i = 0; i < sequence.length() - 1; i++) {
            char letra = sequence.charAt(i);
            switch (letra) {
                case 'a':
                    conversor += '@';
                    break;
                case 'e':
                    conversor += '#';
                    break;
                case 'i':
                    conversor += '$';
                    break;
                case 'o':
                    conversor += '%';
                    break;
                case 'u':
                    conversor += '*';
                    break;
                case 'A':
                    conversor += '@';
                    break;
                case 'E':
                    conversor += '#';
                    break;
                case 'I':
                    conversor += '$';
                    break;
                case 'O':
                    conversor += '%';
                    break;
                case 'U':
                    conversor += '*';
                    break;
                default:
                    conversor += letra;
                    break;
            }
        }
        conversor += '.';
        return conversor;
      
            
        }
    }
