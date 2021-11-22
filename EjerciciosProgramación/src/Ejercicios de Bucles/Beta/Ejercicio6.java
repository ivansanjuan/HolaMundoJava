package Beta;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el número: ");
        int num = in.nextInt();

        System.out.println("Escriba el número del exponente: ");
        int exp = in.nextInt();

        int mult = 1;
        for (int i = 1; i <= exp; i++) {

            mult *= num;
        }
        System.out.println("Resultado= " + mult);
    }
}
