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

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba una cadena de texto: ");
        String texto = in.nextLine();

        int corte = texto.indexOf(" ");

        System.out.println(texto.substring(0, corte) + "\n"
                + texto.substring(corte + 1, texto.length()));

    }

}
