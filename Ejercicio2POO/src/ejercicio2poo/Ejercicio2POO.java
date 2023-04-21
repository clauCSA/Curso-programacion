/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import Entidades.Circunferencia;



/**
 *
 * @author larry
 */
public class Ejercicio2POO {

    /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

     */
    public static void main(String[] args) {
       
     Circunferencia c2= new Circunferencia();
     c2.crearCircunferencia();
     c2.area();
        System.out.println("El area del objeto es: " + c2.area());
     c2.perimetro();
        System.out.println("El perimetro  del objetom es " + c2.perimetro());
    }
    
}
