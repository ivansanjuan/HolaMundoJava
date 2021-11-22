package Beta;

public class Ejercicio9 {

    public static void main(String[] args) {

        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
        for (int i = 1; i <= 100; i++) {
            int cub = (int) (Math.random() * (6 - 1 + 1) + 1);
            System.out.println(cub);

            switch (cub) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }
        System.out.println("Veces que a salido cada número: \n"
                + "número 1: " + uno + "\n"
                + "número 2: " + dos + "\n"
                + "número 3: " + tres + "\n"
                + "número 4: " + cuatro + "\n"
                + "número 5: " + cinco + "\n"
                + "número 6: " + seis);
    }
}
