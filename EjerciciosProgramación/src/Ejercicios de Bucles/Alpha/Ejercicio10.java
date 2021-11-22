package Alpha;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Escriba el precio:");

            double precio = in.nextDouble();

            sum += precio;
        }
        System.out.println("Precio total= " + sum + " €");
    }
}
