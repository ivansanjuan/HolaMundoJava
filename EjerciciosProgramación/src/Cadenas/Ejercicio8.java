/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author Ivan Sanjuan Silvestre
 * @version 1.0 + @date
 */
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca la frase que desee: ");
        String frase = in.nextLine();

        System.out.println("Escriba la palabra que desee saber cuantas veces aparece: ");
        String palabra = in.nextLine();

        int pos = frase.indexOf(palabra);
        int cont = 0;

        while (pos != -1) {
            pos = frase.indexOf(palabra, pos + 1);
            cont++;

        }
        System.out.println("la palabra aparece " + cont + " veces");

    }
}
