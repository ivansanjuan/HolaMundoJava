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
 + @date
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Escriba la frase que desee : ");
        String frase = in.nextLine();
        
        System.out.println("Escriba la palabra que desea cambiar : ");
        String palabra = in.nextLine();
        
        System.out.println("Escriba la palabra de cambio : ");
        String cambio = in.nextLine();
        
        System.out.println(frase.replaceAll(palabra, cambio));
    }

}
