import java.util.Scanner;
public class ejercicio9{
    public static void main (String[]args){
    Scanner in=new Scanner (System.in);
        System.out.println("Escriba dos números enteros: ");
        int numA=in.nextInt();
        int numB=in.nextInt();
        
        if (numA%numB==0){
            System.out.println(numA +" es múltiplo de " + numB);}
        
        else if (numB%numA==0){
            System.out.println(numB + " es múltiplo de " + numA);}
        
        else{
            System.out.println("No son múltiplos");}
    }
}