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

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] num = new double[20];

        System.out.println("Escriba 20 números reales : ");
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextDouble();
            sum += num[i];

        }

        System.out.println("La media= " + sum / 20);
    }

}
