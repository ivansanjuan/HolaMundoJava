/*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio8.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:52:06
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int mes = 1;

        for (; mes <= 12; mes++) {
            int dia = 1;
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (; dia <= 31; dia++) {
                    System.out.println(dia + " / " + mes);
                    }
                    break;

                case 2:
                    for (; dia <= 28; dia++) {
                    System.out.println(dia + " / " + mes);
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    for (; dia <= 30; dia++) {
                    System.out.println(dia + " / " + mes);
                    }
                    break;

            }

            
        }
    }

}

