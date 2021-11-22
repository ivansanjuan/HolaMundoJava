package Alpha;
import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriba dos números: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        
        double mult = 1;
        for (double i = num1; i <= num2; i++){
        mult *= i;
    }
        System.out.println(mult);
    }
}