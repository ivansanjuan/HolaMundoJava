/*
 * Proyecto Caso_Practico - Archivo EjercicioEntregable.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package caso.practico;

import java.util.Scanner;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:22:27
 */
public class EjercicioEntregable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] cuadrado = new int[3][3];
        int suma[] = new int[((3 * 2) + 2)];
        int cuantos = 0;

        System.out.println("Escriba los valores del cuadrado");
        for (int i = 0; i < cuadrado.length; i++) {

            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("Valor " + i + "." + j + ": ");
                cuadrado[i][j] = in.nextInt();

            }
        }
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("   " + cuadrado[i][j] + "   ");
            }
            System.out.println("\n"
                    + " ");

        }
        //Bucle de linia
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma[cuantos] += cuadrado[i][j];

            }
            cuantos++;
        }

        //Bucle columna
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma[cuantos] += cuadrado[j][i];

            }
            cuantos++;
        }
        
        //Bucle diagonal 1
        for (int i = 0; i < cuadrado.length; i++) {
            suma[cuantos] += cuadrado[i][i];

            
        }
        cuantos++;
        
        //Bucle diagonal 2
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = cuadrado[i].length; j >= 0; j--) {

                if (i + j == 3) {
                    suma[cuantos] += cuadrado[i][j];
                }
            }
           
        }
        cuantos++;
        
        

    }
}
