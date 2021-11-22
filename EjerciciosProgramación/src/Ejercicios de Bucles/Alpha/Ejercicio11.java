package Alpha;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el precio de sus productos:\n"
                + "Para mostrar el total introduzca un número negativo.");

        double núm = 0;
        double total = 0;
        do {
            núm = in.nextDouble();

            if (núm >= 0) {
                total += núm;
            }
        } while (núm > 0);

        System.out.println("El total es= " + total);
    }
}
