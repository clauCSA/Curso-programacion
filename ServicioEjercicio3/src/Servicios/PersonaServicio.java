/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. b) Metodo crearPersona(): el método crear persona, le
 * pide los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje 3 c) Método calcularIMC(): calculara si la persona
 * está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por
 * resultado un valor menor que 20, significa que la persona está por debajo de
 * su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un
 * número entre 20 y 25 (incluidos), significa que la persona está en su peso
 * ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula
 * es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 * función devuelve un 1. A continuación, en la clase main hacer lo siguiente: ●
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. ● Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables(arrays), para después calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores. Para esto, podemos crear unos métodos
 * adicionales.
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona persona1 = new Persona();

    public boolean esMayorDeEdad() {

        boolean esMayor = false;

        if (persona1.getEdad() > 21) {

            esMayor = true;
        }

        return esMayor;

    }

    public void crearPersona() {

        System.out.println("Ingrese su nombre: ");

        persona1.setNombre(leer.nextLine());

        System.out.println("Ingrese su edad: ");

        persona1.setEdad(leer.nextInt());

        System.out.println("Ingrese su peso: ");

        persona1.setPeso(leer.nextInt());

        System.out.println("Ingrese su altura: ");

        persona1.setAltura(leer.nextInt());
        leer.nextLine();
        do {
            

            System.out.println("Ingrese su sexo: [ H ] Hombre. [ M ] Mujer. [ O ] Otro genero.   ");

            persona1.setSexo(leer.nextLine());

            if (!persona1.getSexo().equalsIgnoreCase("h") && !persona1.getSexo().equalsIgnoreCase("m") && !persona1.getSexo().equalsIgnoreCase("o")) {
                System.out.println("Ingresaste una opcion incorrecta");
            } else {
                break;
            }
        } while (!persona1.getSexo().equalsIgnoreCase("h") && !persona1.getSexo().equalsIgnoreCase("m") && !persona1.getSexo().equalsIgnoreCase("o"));

    }
    public int calcularImc(){
        double imc = persona1.getPeso()/Math.pow(persona1.getAltura(),2);
        if (imc<20){
            
        }
        return 0;
        
    }
}
