/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Rectangulo {
    private int base;
    private int altura;

    

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la base del rectangulo:");
        this.base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura=leer.nextInt();
    }
    public void superficie(){
        int superficie;
        superficie = this.altura * this.base;
        System.out.println("la superficie es: "+ superficie);
    }
    public void perimetro(){
        int perimetro;
        perimetro=(this.base+this.altura)*2;
        System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    
    public void dibujo(){
        for (int i = 0; i< this.base; i++){
            System.out.print(" * ");
            
        }
        System.out.println();
        for (int i = 0; i < this.altura-2; i++) {
            System.out.print(" * ");
            for (int j = 0; j < this.altura-2; j++) {
                System.out.print("  ");
                
            }
            System.out.println("*");
        }
        for (int i = 0; i < this.base; i++) {
            System.out.print(" * ");
            
        }System.out.println("");
    }
    /*


    public void dibujo(){
        
        for (double fila=0;fila<this.altura;fila++){
            for (double columna=0;columna<this.base;columna++){
                if (fila==0 || fila==this.altura-1 ||columna==0 ||columna==this.base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
              
            }
             System.out.println(""); 
        }
           
    
    
           
    }

    }
    */
}

