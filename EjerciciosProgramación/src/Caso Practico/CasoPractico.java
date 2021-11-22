/*
 * Proyecto Caso_Practico - Archivo CasoPractico.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package caso.practico;

/**
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:27:28
 */
import java.util.Scanner;

public class CasoPractico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cuantos = 0;
        boolean salir = false;
        int MAX = 100;
        String[] nombre = new String[MAX];
        String[] telefono = new String[MAX];
        String[] mail = new String[MAX];

        while (salir == false) {

            System.out.println("Introduzca el número de lo que desee: \n"
                    + "1. Ver contactos. \n"
                    + "2. Agregar contacto. \n"
                    + "3. Eliminar contacto. \n"
                    + "4. Buscar contacto. \n"
                    + "5. Salir.");

            int respuesta = in.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Agenda de contactos: ");
                    for (int i = 0; i < cuantos; i++) {
                        System.out.println((i + 1) + ". Nombre: " + nombre[i] + " Telf: " + telefono[i] + " Mail: " + mail[i]);
                    }
                    break;

                case 2:
                    in.nextLine();

                    System.out.println("Escriba el nombre de el contacto: ");
                    nombre[cuantos] = in.nextLine();

                    System.out.println("El número de telefono: ");
                    telefono[cuantos] = in.nextLine();

                    System.out.println("El correo: ");
                    mail[cuantos] = in.nextLine();

                    cuantos++;

                    break;

                case 3:
                    in.nextLine();
                    System.out.println("Escriba el nombre del contacto que desea eliminar: ");
                    String resp = in.nextLine();

                    for (int i = 0; i < cuantos + 1; i++) {

                        if (resp.equalsIgnoreCase(nombre[i])) {
                            for (int j = 0; j < cuantos; j++) {
                                nombre[j] = nombre[j + 1];
                                telefono[j] = telefono[j + 1];
                                mail[j] = mail[j + 1];
                            }

                        }

                    }
                    cuantos--;
                    break;

                case 4:
                    break;

                case 5:
                    salir = true;
                    break;
            }
        }
    }

}
