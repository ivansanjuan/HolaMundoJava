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

public class Ejercicio10 {

    public static void main(String[] args) {

        //Variables
        double suma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int mayor, menor;
        mayor = menor = 0;

        //Creamos el escaner
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el número de alturas que desea almacenar: ");
        int cantidad = in.nextInt();

        //Creamos el array
        double[] alturas = new double[cantidad];

        //Creamos el bucle para introducir todas las alturas en el array
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduzca la altura " + (i + 1));
            alturas[i] = in.nextDouble();

        }
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
            max = Math.max(alturas[i], max);
            min = Math.min(alturas[i], min);

        }

        //Calculamos la media
        double media = suma / alturas.length;

        //Calcular cuantos por encima y por debajo de la media
        for (int i = 0; i < alturas.length; i++) {

            if (alturas[i] > media) {
                mayor++;
            }

            if (alturas[i] < media) {
                menor++;
            }
        }

        System.out.println("La media es = " + media + "\n"
                + "La altura minima introducida es = " + min + "\n"
                + "La altura máxima introducida es = " + max + "\n"
                + "Personas por encima de la media = " + mayor + "\n"
                + "Personas por debajo de la media = " + menor);
    }

}
