package Beta;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba 10 números del 1-100: ");

        for (int i = 1; i <= 10; i++) {
            int num = in.nextInt();

            switch (num) {
                case 2:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                case 17:
                case 19:
                case 23:
                case 29:
                case 31:
                case 37:
                case 41:
                case 43:
                case 47:
                case 53:
                case 59:
                case 61:
                case 67:
                case 71:
                case 73:
                case 79:
                case 83:
                case 89:
                case 97:
                    System.out.println("Es primo");
                    break;
                default:
                    System.out.println("No es primo");
            }
        }
    }
}
