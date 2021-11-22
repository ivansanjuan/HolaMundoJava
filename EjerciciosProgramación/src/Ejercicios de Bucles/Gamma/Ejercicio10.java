/*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio10.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:26:19
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escriba el número de altura que desea tener la piramide: ");

        int alt = in.nextInt();
        int esp = alt - 1;

        for (int i = 1; i <= alt; i++) {
            for (int j = esp; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2)-1; k++) {
                System.out.print("*");
            }

            System.out.println("");
            esp--;
        }
    }

}
