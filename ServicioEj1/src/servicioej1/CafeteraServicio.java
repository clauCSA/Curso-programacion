/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioej1;

import java.util.Scanner;

/**
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada
 */
public class CafeteraServicio {
    Cafetera c1 = new Cafetera ();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        
        System.out.println("Ingrese la capacidad maxima de la cafetera.");
        
        c1.setCapacidadMaxima(leer.nextInt());
        
        System.out.println("Ingrese la cantidad actual de cafe.");
        
        c1.setCantidadActual(leer.nextInt());
        
        return c1;
        
    }
    public void llenarCafetera(Cafetera c1){
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
        System.out.println("Se lleno la cafetera. ["+c1.getCantidadActual()+" L]");
        
    }
    public int servirTaza(Cafetera c1){
        
        System.out.println("Seleccione el tamaño de la taza.");
        int taza1=leer.nextInt();
        
        if (taza1>c1.getCantidadActual()){
            
            System.out.println("No alcanza para llenar la taza.");
            System.out.println("Se cargo en la taza " + c1.getCantidadActual());
            c1.setCantidadActual(0);
            
            
        }else{
            c1.setCantidadActual(c1.getCantidadActual()-taza1);
            System.out.println("Se completo la taza");
            c1.setCantidadActual(c1.getCantidadActual());
            System.out.println("La cafetera quedo con " + c1.getCantidadActual() + " de cafe.");
        }
        
        return 0;
        
    }
    public void vaciarCafetera(Cafetera c1){
        
        System.out.println("Vaciando cafetera y limpiando.");
        
        c1.setCantidadActual(0);
        
    }
    public int agregarCafe(Cafetera c1){
        
        System.out.println("Ingrese la cantidad de cafe que quiere agregar a la cafetera");
        
        int agregar = leer.nextInt();
        
        if (c1.getCapacidadMaxima()<c1.getCantidadActual()+agregar){
            
            System.out.println("Se pasa de la capacidad. Se llenara al maximo permitido.");
            
            
        } else {
            
            System.out.println("Se agregaron " + agregar + " de cafe");
            
            System.out.println("La cantidad actual es de: " + (c1.getCantidadActual()+agregar) );
            
        }
        return 0;
        
        
    }
}
