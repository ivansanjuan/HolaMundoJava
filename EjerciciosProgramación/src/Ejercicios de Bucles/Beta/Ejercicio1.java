package Beta;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba el número de la tabla de múltiplica que desea: ");
        int num = in.nextInt();

        int mult;
        for (int i = 1; i <= 10; i++) {
            mult = i * num;
            System.out.println(i + " * " + num + " = " + mult);
        }
    }
}
