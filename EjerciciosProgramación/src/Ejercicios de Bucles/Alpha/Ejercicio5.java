package Alpha;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a;
        int b;
        System.out.println("Escriba dos números: ");
        a = in.nextInt();
        b = in.nextInt();

        while (a <= b) {
            System.out.println(b);
            b = b - 2;
        }

    }

}
