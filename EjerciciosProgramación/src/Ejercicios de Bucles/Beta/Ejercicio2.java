package Beta;

public class Ejercicio2 {

    public static void main(String[] args) {

        int mult = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            mult *= i;
            sum += i;
        }
        System.out.println("La súma de los 10 primeros números naturales es= " + sum + "\n"
                + "El producto de los 10 primeros números naturales es= " + mult);
    }
}
