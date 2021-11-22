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

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Escriba su nombre: ");
        String nombre = in.nextLine();
        
        System.out.println("Escriba su primer apellido: ");
        String apellido1 = in.nextLine();
        
        System.out.println("Escriba su segundo apellido: ");
        String apellido2 = in.nextLine();
        
        String cod1 = nombre.substring(0,3);
        String cod2 = apellido1.substring(0,3);
        String cod3 = apellido2.substring(0,3);
        
        String codigo = cod1 + cod2 + cod3;
        
        System.out.println(codigo.toUpperCase());
        
    }

}
