import java.util.Scanner;
public class ejercicio16{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivina el número del dado");
        System.out.println("Introduzca un número del 1-6: ");
        int num=in.nextInt();
        
        int ran=(int) (Math.random()*6+1);
        System.out.println("El número del dado es= " + ran );
        
        String res;
        if (num==ran){
            res="Has";
        }
        else{
            res="No has";
        }
        System.out.println(res + " acertado");
    } 
}