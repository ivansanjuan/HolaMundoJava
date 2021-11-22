/*
 * Proyecto Vectores - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Nivel_Jedi;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:09:41
 */
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        double [] num = new double[100];
        
        for (int i = 0; i < num.length; i++) {
            num [i] = Math.random();
        }
        
        System.out.println("Escriba un número real entre 0,0 y 1,0: ");
        double R = in.nextDouble();
        
        double mayor, igual;
        mayor = igual = 0;
        for (int i = 0; i < num.length; i++) {
            if( num[i] == R){
                igual++;
               
            }
            if ( num [i] > R){
                mayor ++;
            }
        }
        System.out.println("Igual:" + igual + "veces");
        System.out.println("Mayor:" + mayor + "veces");
    }

}
