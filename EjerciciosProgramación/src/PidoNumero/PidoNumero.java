/*
 * Proyecto PidoNumero - Archivo PidoNumero.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package pidonumero;

import javax.swing.JOptionPane;

/**
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 16:59:01
 */
public class PidoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean res = false;

        while (res == false) {
            JOptionPane.showMessageDialog(null, "Escriba un número entre 1 y 10");
            String texto = JOptionPane.showInputDialog("texto");
            int numero = Integer.parseInt(texto);

            if (numero >= 0 && numero <= 10) {
                JOptionPane.showMessageDialog(null, "El número introducido es " + texto);
                res = true;
            }

        }

    }
}