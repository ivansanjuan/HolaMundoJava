import java.util.Scanner;
public class ejercicio6{
    public static void main (String[]args){
    Scanner in=new Scanner (System.in);
        System.out.println("Escriba dos números enteros:");
        int num1=in.nextInt();
        int num2=in.nextInt();
        if (num1>num2){
            System.out.println("El número mayor es: "+num1);
        }
        else if(num2>num1){
            System.out.println("El número mayor es: "+num2);
        }
        else{
            System.out.println("Los números son iguales");
        }
    }
}    
