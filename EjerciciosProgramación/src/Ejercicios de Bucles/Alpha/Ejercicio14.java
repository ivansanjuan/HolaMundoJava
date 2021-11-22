package Alpha;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int con = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Escriba cinco números: ");
            num = in.nextInt();

            if (num % 10 == 0) {

                con++;
            }

        }
        System.out.println("Hay " + con + " números múltiplos de 10");
    }
}
