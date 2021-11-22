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

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] num = new double[10];

        System.out.println("Escriba diez números reales: ");
        
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextDouble();
        }
        double mayor, menor;
        mayor = menor = num [0];

        for (int j = 0; j < num.length; j++) {
            if (num[j] > mayor) {
                mayor = num[j] ;
            } 
            
            if (num[j] <=  menor) {
                 menor = num[j];
            }
        }
        System.out.println("El número menor es= " + menor + "\n"
                + "El número mayor es= " + mayor);
    }

}
