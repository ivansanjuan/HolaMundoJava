import java.util.Scanner;
public class ejercicio18{
    public static void main(String[]args){
    Scanner in=new Scanner (System.in);
        System.out.println("Introduzca una letra mayuscula o minuscula: ");
        char letra=in.nextLine().charAt(0);
        
        String pantalla;
        if (letra >='A' && letra <= 'Z'){
            pantalla= "mayuscula";}
        
        else{
            pantalla= "minuscula";}
        
        System.out.println("La letra introducida es " + pantalla);
    }
}