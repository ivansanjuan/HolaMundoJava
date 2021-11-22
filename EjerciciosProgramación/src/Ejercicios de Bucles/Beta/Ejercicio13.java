package Beta;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba un número entero: ");
        int num = in.nextInt();
        int rest;
        int sum = 0;

        do {
            rest = num % 10;
            num /= 10;
            sum += rest;
        } while (num != 0);
        System.out.println("La suma de los números es = " + sum);
    }
}
