
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escoja la operación que desee realizar:"
                + "1. Suma A + B\n"
                + "2. Resta A - B\n"
                + "3. Multiplicar A * B\n"
                + "4. Dividir A / B\n"
                + "5. Resto A % B\n"
                + "6. Exponencial A ^ B\n"
                + "7. Seno(X)\n"
                + "8. Coseno(X)\n"
                + "9. Tangente(X)\n"
                + "10. Salir");
        int num = in.nextInt();

        if (num <= 6) {
            System.out.println("Introduzca dos números para realizar la operación: ");
            System.out.println("A: ");
            double A = in.nextDouble();
            System.out.println("B: ");
            double B = in.nextDouble();
            double ops = 0;//Le doy un valor porque si no no me funciona, pero no lo entiendo.
            switch (num) {

                case 1:
                    ops = A + B;
                    break;

                case 2:
                    ops = A - B;
                    break;

                case 3:
                    ops = A * B;
                    break;

                case 4:
                    ops = A / B;
                    break;

                case 5:
                    ops = A % B;
                    break;

                case 6:
                    ops = Math.pow(A, B);
                    break;
            }

            System.out.println("El resultado es= " + ops);
        } else if (num <= 9) {
            System.out.println("Introduzca un número para realizar las operaciones en radianes: ");
            System.out.println("X= ");
            double X = in.nextDouble();
            System.out.println("A: ");
            System.out.println("B: ");
            double opt = 0;//Le doy un valor porque si no no me funciona, pero no lo entiendo.
            switch (num) {

                case 7:
                    opt = Math.sin(X);
                    break;

                case 8:
                    opt = Math.cos(X);
                    break;

                case 9:
                    opt = Math.tan(X);
                    break;

            }
            System.out.println("El resultado es= " + opt);
        } else {
            System.out.println("Se a salido del juego.");
        }

    }
}
