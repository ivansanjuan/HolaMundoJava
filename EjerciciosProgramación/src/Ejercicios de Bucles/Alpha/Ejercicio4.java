import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Escriba dos números: ");
        int a = in.nextInt();
        int b = in.nextInt();
        
        while (a<=b){
            System.out.println(b);
            b--;
            
        }
    }
}