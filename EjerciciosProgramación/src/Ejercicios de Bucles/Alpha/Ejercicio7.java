package Alpha;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba dos números: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        double sum = 0;
        for (double i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
