/*
 * Proyecto Cadenas - Archivo Ejercicio1.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package cadenas;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:02:24
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba un texto :");
        String texto = in.nextLine();

        System.out.println("El texto en mayúscula es : \n"
                + texto.toUpperCase());
        
        System.out.println("El texto en minusculas es : \n"
                + texto.toLowerCase());
    }

}