package Alpha;
import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int mayor = 0;
        int negativo = 0;
        for (int i = 1; i <=5 ; i++ ){
            System.out.println("Escriba un número: ");
            int num = in.nextInt();
            
            if (num > 99){
                mayor ++;
            }
            if (num < 0){
                negativo ++;
            }
        }
        System.out.println("Hay " + mayor + " números mayores que 99\n"
                + "Hay " + negativo + " números negativos");
        
    }
}