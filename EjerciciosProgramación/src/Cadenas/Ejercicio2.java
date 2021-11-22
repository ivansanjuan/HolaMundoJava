/*
 * Proyecto Cadenas - Archivo Ejercicio2.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package cadenas;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:10:47
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriba el texto 1: ");
        String texto1 = in.nextLine();
        
        System.out.println("Escriba el texto 2: ");
        String texto2 = in.nextLine();
        
        String resp1= "Son iguales diferenciando entre mayúsculas y minusculas";
        if (texto1.equals(texto2)){
            System.out.println(resp1);
        }
        else{
            System.out.println("No " + resp1);
        }
        
        String resp2 ="Son iguales sin diferenciar entre mayúsculas y minusculas";
        if (texto1.equalsIgnoreCase(texto2)){
            System.out.println(resp2);
        }
        else{
            System.out.println("No " + resp2);
        }
    }

}
