/*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio9.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:26:32
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escriba un número entero: ");
        int x = in.nextInt();
        int esp = x;

        for (int i = 1; i <= x; i++) {

            for (int k = esp - 1; k > 0; k--) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println("");
            esp--;
        }
    }
}
