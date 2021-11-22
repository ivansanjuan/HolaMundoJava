import java.util.Scanner;
public class ejercicio10{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println("Escriba dis números decimales: ");
        double num1=in.nextDouble();
        double num2=in.nextDouble();
        
        double sum=num1+num2;
        double res= num1-num2;
        double pro=num1*num2;
        
        System.out.println("Suma= " + sum);
        System.out.println("Resta= " + res);
        System.out.println("Producto= " + pro);
        
        if (num2==0){
          }
        else if (num2!=0){
            double div= num1/num2;
            System.out.println("División= " + div);}
    }
}