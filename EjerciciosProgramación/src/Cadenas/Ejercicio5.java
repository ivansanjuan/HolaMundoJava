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

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca el texto que desee: ");
        String texto = in.nextLine();

        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        int contador[] = new int [5];

        for (int i = 0; i < vocales.length; i++) {
            for (int j = 0; j < texto.length(); j++) {
                if (texto.charAt(j) == vocales[i]) {
                    contador[i]++;
                }
            }
            System.out.println(contador[i]);
        }
    }
}
