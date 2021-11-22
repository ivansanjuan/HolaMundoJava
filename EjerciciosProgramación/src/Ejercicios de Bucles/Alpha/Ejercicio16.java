package Alpha;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Escriba un número: ");
            int num = in.nextInt();

            if (num >= 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("De los números introducidos, " + neg + " son negativos y " + pos + " positivos");
    }
}
