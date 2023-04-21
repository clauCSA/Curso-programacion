/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolibro.Atributos;

import java.util.Scanner;

/**
 *
 * @author larry
 */
public class Libro {
    /*Crear una clase llamada Libro que contenga los siguientes atributos: 
        ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
        atributos pasados por parámetro y un constructor vacío. Crear un método
        para cargar un libro pidiendo los datos al usuario y luego informar mediante
        otro método el número de ISBN, el título, el autor del libro y el número de páginas.*/
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro(int ISBN, String Titulo, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }
    public void cargarDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro:");
        ISBN = leer.nextInt();
        System.out.println("Ingrese titulo del libro:");
        Titulo = leer.next();
        System.out.println("Ingrese el autor del libro:");
        Autor = leer.next();
        System.out.println("Ingrese el numero de paginas del libro:");
        numeroPaginas = leer.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("El ISBN del libro es: -------------[" + ISBN + "]");
        System.out.println("El titulo del libro es: -----------[" + Titulo + "]");
        System.out.println("El autor del libro es: ------------[" + Autor + "]");
        System.out.println("El numero de paginas del libro es:-[" + numeroPaginas + "]");
    }
}
