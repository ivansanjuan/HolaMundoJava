import java.util.Scanner;
public class ejercicio8{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println("Escriba dos números enteros: ");
        int numA=in.nextInt();
        int numB=in.nextInt();
        if(numA%numB==0){
            System.out.println(numA + " Es multiplo de " + numB);}
        else{
            System.out.println(numA + " No es multiplo de " + numB);}
    }
}