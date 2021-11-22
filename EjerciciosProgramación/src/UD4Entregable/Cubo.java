package UD4Entregable;

import java.util.Scanner;

public class Cubo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Que tamaño del cuadrado desea: ");
        int n = in.nextInt();
        int[][] cuadrado = new int[n][n];
        int max = (n*2)+2;
        int suma[] = new int[max];
        int cuantos = 0;

        System.out.println("Escriba los valores del cuadrado");
        for (int i = 0; i < cuadrado.length; i++) {

            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("Valor " + i + "." + j + ": ");
                cuadrado[i][j] = in.nextInt();

            }
        }
        
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("   " + cuadrado[i][j] + "   ");
            }
            System.out.println("\n"
                    + " ");

        }
        //Suma de cada linia
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma[cuantos] += cuadrado[i][j];

            }
            cuantos++;
        }

        //Suma de cada columna
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                suma[cuantos] += cuadrado[j][i];

            }
            cuantos++;
        }

        //Suma diagonal 1
        for (int i = 0; i < cuadrado.length; i++) {
            suma[cuantos] += cuadrado[i][i];

        }
        cuantos++;

        //Suma diagonal 2
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = cuadrado[i].length; j >= 0; j--) {

                if (i + j == (n-1)) {
                    suma[cuantos] += cuadrado[i][j];
                }
            }
            
        }
        cuantos++;
        
        //Recorre todo el array y comprueba si se trata de un cuadrado magico
        int cont = 0;
        for (int i = 0; i < cuantos; i++) {
            System.out.println(suma[i]);
            if (suma[i] == suma[0]){
                cont ++;
                
            }
            if (cont == max){
                System.out.println("Se trata de un cubo magico");
            }
        }

    }
}
