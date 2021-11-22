/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_Jedi;

/**
 *
 * @author Ivan Sanjuan Silvestre
 * @version 1.0 + @date
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.out.print("Array 1 = ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.print(array1[i] + ", ");
        }
        
        System.out.print("Array 2 = ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1 [9-i];

            System.out.print(array2[i] + ", ");
        }

    }

}
