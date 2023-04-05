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
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Realizar un programa que simule el funcionamiento de un dispositivo RS232,
        este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
        deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
        de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la 
        secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
        y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de 
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java 
        Substring(), Length(), equals().
        */
        Scanner leer = new Scanner(System.in);
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        String cadena;
        
        do {
            System.out.print("Ingrese una cadena (&&&&& para finalizar): ");
            cadena = leer.nextLine().toUpperCase();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        } while (true);
        
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
    
}
