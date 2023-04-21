/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3poo;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Juego {
    private int num1;
    private int num2;
    private int numeIntentos;
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int num1, int num2, int numeIntentos) {
        this.num1 = num1;
        this.num2 = num2;
        this.numeIntentos = numeIntentos;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNumeIntentos() {
        return numeIntentos;
    }

    public void setNumeIntentos(int numeIntentos) {
        this.numeIntentos = numeIntentos;
    }

    public void crearJuego() {
        System.out.println("Escribe el numero secreto");
        this.num1 = leer.nextInt();
        System.out.println("Ingresa el limite de intentos.");
        this.numeIntentos = leer.nextInt();
    }

    public void inicioJuego() {
        int cont=0;
        while (cont<this.numeIntentos) {            
            System.out.println("Ingrese un numero para adivinar el numero secreto");
        this.num2 = leer.nextInt();
        if (num2 == num1) {
            System.out.println("Ganaste! Felicitaciones!");
        } else if (num2 > num1) {
            System.out.println("El numero ingresado es mayor");
        }else if (num2 <num1) {
            System.out.println("El numero ingresado es menor");
        }
        cont++;
        }
        if(cont>numeIntentos){
        System.out.println("Se acabaron los intentos.");
        }else{
            System.out.println("Juego finalizado.");
        }
    }
}
