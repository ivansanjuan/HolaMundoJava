package Beta;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca las notas: \n"
                + "Al acabar de introducir las notas introduzca un -1.");

        double num;
        double sum = 0;
        int hay = 0;

        for (int i = 1;; i++) {
            num = in.nextDouble();
            sum += num;

            if (num == 10) {
                hay += 1;
            }
            if (num == -1) {
                System.out.println("La suma total= " + sum + "\n"
                        + "La media= " + sum / (double) i + "\n"
                        + hay + " notas introducidas fueron 10 ");

            }

        }
    }
}
