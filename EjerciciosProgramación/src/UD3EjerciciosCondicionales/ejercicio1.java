import java.util.Scanner;
public class ejercicio1{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Escriba su edad");
        int edad = in.nextInt();
        if (edad>=18){
            System.out.print("Eres mayor de edad");
        }
        
    }
}