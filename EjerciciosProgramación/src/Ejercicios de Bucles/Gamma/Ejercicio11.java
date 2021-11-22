/*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio11.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 21:00:03
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("De cuantos asteriscos desea el cuadrado: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
            }

            
            else{
                System.out.print("*");
                for (int k = num + 2; k > 0; k--){
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
