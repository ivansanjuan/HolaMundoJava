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

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba diez números reales: ");
        double[] num = new double[10];

        for (int i = 0; i < num.length; i++) {
            num [i] = in.nextDouble();
        }
        
        for(int j = 0; j < num.length; j++){
            System.out.print(num[j] + ", ");
        }

    }

}
