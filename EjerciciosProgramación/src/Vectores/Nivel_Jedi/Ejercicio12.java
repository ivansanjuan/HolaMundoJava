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
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        double valores[] = new double [10];

        Scanner in = new Scanner(System.in);

        System.out.println("Menú: \n"
                + "a. Mostrar valores. \n"
                + "b. Introducir valor. \n"
                + "c: Salir.");

        boolean resp = false;
        while (resp == false) {

            System.out.print("Escoja la opción que desea:");
            char respuesta = in.nextLine().charAt(0);


            if (respuesta == 'b') {
           
                System.out.println("Introduzca el valor: ");
                double num = in.nextDouble();
                
                System.out.println("Introduzca la posición que desea entre 0 y 9: ");
                int pos = in.nextInt();
                valores [pos] = num;
                in.nextLine();
            }
            if (respuesta == 'a') {

                for (int i = 0; i < valores.length; i++) {
                    System.out.print("Los valores introducidos son: " + valores[i]);
                    System.out.println("");
                  
                }
            }
            if (respuesta == 'c') {
                resp = true;
            }
            else{
                System.out.println("Letra introducida incorrecta");
            }

        }
    }
}
