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

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriba una frase: ");
        String frase = in.nextLine();
        
        System.out.println("Escriba una palabra: ");
        String palabra = in.nextLine();
        
        if ((frase.indexOf(palabra)) > 0){
            System.out.println("La frase contiene la palabra " + palabra);
        }
        
        if (frase.startsWith(palabra)){
            System.out.println("La frase empieza por " + palabra);
        }
        
        if (frase.endsWith(palabra)){
            System.out.println("La frase acaba por " + palabra);
        }
    }

}
