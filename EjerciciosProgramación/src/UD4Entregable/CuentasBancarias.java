package UD4Entregable;

import java.util.Scanner;


public class CuentasBancarias {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean salir = false;
        String[] nombres = new String[100];
        double[] saldos = new double[100];
        
        double cantidad = 0;
        int cuantos = 0;
        int borrar;
        int cuenta = 0;
        

        do {

            System.out.println("Menú: \n"
                    + "1. Ver cuentas.\n"
                    + "2. Ingresar dinero.\n"
                    + "3. Retirar dinero.\n"
                    + "4. Agregar cuenta.\n"
                    + "5. Eliminar cuenta.\n"
                    + "6. Buscar cuenta.\n"
                    + "7. Mostrar morosos.\n"
                    + "8. Salir");
            System.out.print("Escoja la opción que desea: ");

            int resp = in.nextInt();

            switch (resp) {

                //Caso mostrar cuentas
                case 1:
                    if (cuantos >= 1) {
                        for (int i = 0; i < cuantos; i++) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                        }
                    } else {
                        System.out.println("Vaya !!!!!No hay cuentas.");
                    }
                    break;

                //Caso ingresar dinero
                case 2:
                    System.out.println("Introduzca la cuenta: ");
                    cuenta = in.nextInt();
                    System.out.println("Introduzca la cantidad: ");
                    cantidad = in.nextDouble();
                    saldos[cuenta] += cantidad;
                    break;
                    
                //Caso retirar dinero
                case 3:
                    System.out.println("Introduzca la cuenta :");
                    cuenta = in.nextInt();
                    System.out.println("Introduzca la cantidad :");
                    cantidad = in.nextDouble();
                    saldos[cuenta] -= cantidad;
                    break;
                
                //Caso agregar cuenta
                case 4:
                    if (cuantos < nombres.length) {
                        in.nextLine();
                        System.out.print("Introduzca el nombre: ");
                        nombres[cuantos] = in.nextLine();
                        System.out.print("Introduzca el saldo: ");
                        saldos[cuantos] = in.nextDouble();
                        cuantos++;
                    } else {
                        System.out.println("La lista esta llena.");
                    }
                    break;
                    
                //Caso eliminar cuenta
                case 5:
                    System.out.print("Introduzca el número de cuenta que desea eliminar:");
                    borrar = in.nextInt();

                    for (int i = borrar + 1; i < cuantos; i++) {
                        nombres[i - 1] = nombres[i];
                        saldos[i - 1] = saldos[i];
                    }
                    cuantos --;
                    break;

                //Caso mostrar cuenta
                case 6:
                    in.nextLine();
                    System.out.println("Introduzca el nombre: ");
                    String busqueda = in.nextLine();
                    int buscar = 0;

                    for (int i = 0; i < cuantos; i++) {
                        if (nombres[i].toUpperCase().indexOf(busqueda.toUpperCase()) >= 0) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                            buscar++;
                        }
                    }
                    if (buscar == 0) {
                        System.out.println("Vaya!!! No se han encontrado.");
                    }

                    break;
                
                //Caso mostrar morosos
                case 7:
                    for (int i = 0; i < cuantos; i++) {
                        if (saldos[i] < 0) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                        }
                    }

                    break;
                
                //Caso salir
                case 8:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
