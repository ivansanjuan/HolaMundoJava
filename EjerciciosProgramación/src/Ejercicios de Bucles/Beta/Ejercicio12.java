package Beta;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("Escriba un un número del 1-100");
        int adiv = in.nextInt();
        double max = 100;
        double min = 1;
        double anterior = 0;

        double num;
        while (seguir = true) {

            num = (double) (max + min) / 02;

            if (num == anterior) {
                num = num + 1;
            }
            System.out.println("El número es " + num + "? (=,<,>)");
            String res = in.nextLine();

            if (res.equals("menor")) {
                max = num;
                anterior = num;

            } else if (res.equals("igual")) {
                seguir = false;
            } else if (res.equals("mayor")) {
                min = num;
                anterior = num;
            }

            
        }
        System.out.println("Lo acerte");
    }
}
