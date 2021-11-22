package Beta;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba los números que desee:\n"
                + "Para parer el programa introduzca un 0.");

        double par = 0;
        double impar = 0;
        double num;

        do {
            num = in.nextDouble();

            if (num % 2 == 0) {
                par += num;
            } else {
                impar += num;
            }

        } while (num != 0);
        System.out.println("La suma de los números pares= " + par + "\n"
                + "La suma de los números impares= " + impar);
    }

}
