/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_Padawan;

/**
 *
 * @author Ivan Sanjuan Silvestre
 * @version 1.0 + @date
 */
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Escriba el número entero de inicio: ");
        int inicio = in.nextInt();
        
        System.out.print("Escriba el número entero de fin: ");
        int fin = in.nextInt();
        
        int [] num = new int[fin+1];
        
        for (int i = inicio; i < num.length; i++){
            num [i] = i; 
        }
        for ( int j = inicio; j < num.length; j++){
            System.out.println(num [j]);
        }
    }

}
