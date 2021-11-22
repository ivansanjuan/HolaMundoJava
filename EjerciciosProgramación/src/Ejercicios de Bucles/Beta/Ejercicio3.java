package Beta;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca los números que desee.\n"
                + "Para parar el programa introduzca un 0.");

        int neg = 0;
        int pos = 0;
        double num;
        do {
            num = in.nextDouble();
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
        } while (num != 0);

        System.out.println("De los números introducidos hay " + neg + " negativos.\n"
                + "De los números introducidos hay " + pos + " Fpositivos.");
    }
}
