 /*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio7.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0 
 * @date 27 oct. 2021 16:39:19
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int horas = 0;
        int min = 0;
        int seg = 0;
        
        
        for (int i = horas; i <= 23; i++){
            
            
            for (int j = min; j <= 59; j++){
                
                
                for (int k = seg; k <= 59; k++){
                    
                    System.out.println( i + " : " + j + " : " + k);
                }
            }
        }
    }
}
