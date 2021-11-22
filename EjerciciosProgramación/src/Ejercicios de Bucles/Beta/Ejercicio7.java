package Beta;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba un número positivo: ");
        int num = in.nextInt();

        int fact = 1;
        for (int i = num; i > 1;) {

            fact *= i;
            i--;
        }
        System.out.println("El factorial es= " + fact);
    }
}
