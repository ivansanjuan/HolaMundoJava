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

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] num = new int[20];

        System.out.println("Escriba 20 números enteros= ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int pos, neg;
        pos = neg = 0;
        for (int j = 0; j < num.length; j++) {

            if (num[j] < 0) {
                neg += num[j];
            } else {
                pos += num[j];
            }
        }
        System.out.println("La suma de todos los positivos es= " + pos + "\n"
                + "La suma de todos los negativos es= " + neg);

    }

}
