import java.util.Scanner;
public class ejercicio20{
    public static void main (String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println ("Escribe un número entre 0-10: ");
        double num=in.nextDouble();
        
        String pantalla;
        if (num<3){
            pantalla="Muy deficiente";
        }
        else if (num<5){
            pantalla="insuficiente";
        }
        else if (num<6){
            pantalla="bien";
        }
        else if (num<9){
            pantalla="notable";
        }
        else {
            pantalla="sobresaliente";
        }
        System.out.println("Tienes un " + pantalla);
    }
}