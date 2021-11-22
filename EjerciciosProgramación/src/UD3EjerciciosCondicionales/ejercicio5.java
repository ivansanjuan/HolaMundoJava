import java.util.Scanner;
public class ejercicio5{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println("Escriba dos números:");
        double num_1=in.nextDouble();
        double num_2=in.nextDouble();
        if (num_1>num_2){
            System.out.println("Los números ordenados son:" + num_2 + " --> "+num_1 );
        }
        else{
            System.out.println("Los números ordenados son: "+ num_1+ " --> " + num_2);
        }
    }
}