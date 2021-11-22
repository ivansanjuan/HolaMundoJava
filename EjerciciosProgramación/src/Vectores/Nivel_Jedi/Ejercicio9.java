/*
 * Proyecto Vectores - Archivo Ejercicio9.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Nivel_Jedi;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:28:31
 */
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (10 - 1 + 1) + 1);

        }
        System.out.println("Escriba el número que desea buscar: ");
        int N = in.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            if ( num[i] == N){
                System.out.println(i);
            }
        }

    }

}
