/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author Ivan Sanjuan Silvestre
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el texto 1: ");
        String texto1 = in.nextLine();

        System.out.println("Escriba el texto 2: ");
        String texto2 = in.nextLine();

        int num = texto1.compareToIgnoreCase(texto2);

        System.out.println(num);
        System.out.println("Ordenador los texto alfabeticamente: ");
        if (num > 0) {
            System.out.println(texto2 + "\n"
                    + texto1);
        } else if (num < 0) {
            System.out.println(texto1 + "\n"
                    + texto2);
        } else {
            System.out.println("Son iguales");
        }
    }

}
