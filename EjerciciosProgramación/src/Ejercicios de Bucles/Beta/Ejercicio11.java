package Beta;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de dinero que desea retirar: ");
        int dinero = in.nextInt();

        int cant500 = 0;
        while (dinero >= 500) {
            dinero -= 500;
            cant500++;
        }

        int cant200 = 0;
        while (dinero >= 200) {
            dinero -= 200;
            cant200++;
        }

        int cant100 = 0;
        while (dinero >= 100) {
            dinero -= 100;
            cant100++;
        }
        int cant50 = 0;
        while (dinero >= 50) {
            dinero -= 50;
            cant50++;
        }

        int cant20 = 0;
        while (dinero >= 20) {
            dinero -= 20;
            cant20++;
        }

        int cant10 = 0;
        while (dinero >= 10) {
            dinero -= 10;
            cant10++;
        }

        int cant5 = 0;
        while (dinero >= 5) {
            dinero -= 5;
            cant5++;
        }

        System.out.println("Billetes de 500= " + cant500 + "\n"
                + "Billetes de 200= " + cant200 + "\n"
                + "Billetes de 100= " + cant100 + "\n"
                + "Billetes de 50= " + cant50 + "\n"
                + "Billetes de 20= " + cant20 + "\n"
                + "Billetes de 10= " + cant10 + "\n"
                + "Billetes de 5= " + cant5);
    }
}
