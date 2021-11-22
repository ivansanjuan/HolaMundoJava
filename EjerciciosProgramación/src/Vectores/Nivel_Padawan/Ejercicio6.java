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

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Escriba el el valor del tamaño del array: ");
        int N = in.nextInt();
        
        System.out.print("Escriba el número que desea que aparezca en cada una de las posiciones: ");
        int M = in.nextInt();
        
        int [] num = new int [N];
        for ( int i = 0; i < num.length; i++){
            num [i] = M;
        }
        for ( int j = 0; j < num.length; j++){
            System.out.println(num[j]);
        }
    }

}
