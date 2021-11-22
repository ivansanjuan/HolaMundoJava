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

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba una cadena de texto");
        String texto = in.nextLine();

        int espacio = 0;
        int espacioAnt = 0;
        
        do {
            
            espacio = texto.indexOf(" ", espacio);
            if (espacio != -1){
            
            System.out.println(texto.substring(espacioAnt, espacio+1));
            espacioAnt = espacio + 1;
            espacio++;
            }
            else {
                System.out.println(texto.substring(espacioAnt, texto.length()));
            }
            
        } while (espacio != -1);
        
     

            
    }

}
