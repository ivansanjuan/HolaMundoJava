package Alpha;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba dos números: ");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; a >= b; a --) {

            if (a >= 0) {
                System.out.println(a);
            }
        }
    }
}
