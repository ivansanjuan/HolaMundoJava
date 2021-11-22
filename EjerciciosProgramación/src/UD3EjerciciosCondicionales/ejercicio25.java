import java.util.Scanner;
public class ejercicio25{
    public static void main (String [] args){
    Scanner in = new Scanner (System.in);
        System.out.println("Introduzca la cantidad de minutos de la llamada: ");
        int min = in.nextInt();
        double cobro;
        
        if (min<=5){
            cobro = 1;
        }
        else if (min<=8){
            cobro = 1.80;
        }
        else if (min<=10){
            cobro = 2.5; 
        }
        else{
            cobro = 2.5 + (0.5 * (min-10));
        }
        System.out.println("Cantidad a cobrar: " + cobro + "€");
    }
}