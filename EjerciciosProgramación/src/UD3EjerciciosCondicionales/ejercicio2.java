import java.util.Scanner;
public class ejercicio2{
    public static void main (String[]args){
    Scanner in=new Scanner(System.in);
    System.out.print("Escrida su edad:");
    int edad=in.nextInt();
    if (edad>=18){
        System.out.println("Eres mayor de edad");
    }
    else{
        System.out.println("Eres menor de edad");
    }
    
   
    }
}