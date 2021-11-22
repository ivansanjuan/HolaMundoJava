import java.util.Scanner;
public class ejercicio4{
    public static void main (String[]args){
    Scanner in=new Scanner (System.in);
        System.out.print("Escriba un número:");
        double num=in.nextDouble();
        if (num>=0){
            System.out.println("El número es positivo");}
        else{
            System.out.println("El número es negativo");}

    }
}
