package Alpha;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba dos números: ");

        int a = 0;
        int b = 0;

        a = in.nextInt();
        b = in.nextInt();

        while (a < b) {
            a++;
            System.out.println(a);
        }

    }
}
