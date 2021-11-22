package Beta;
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("¿Cuantos números de la secuencia de desea que escriba?");
        int cant = in.nextInt();
        
        int ant = 1;
        int actual;
        int antant = 1;
        System.out.println(ant + "\n"
                + antant);
        
        for (int i = 3; i <= cant; i++){
            actual = ant + antant;
            
            System.out.println(actual);
            antant = ant;
            ant = actual;
            
        }
    }
}