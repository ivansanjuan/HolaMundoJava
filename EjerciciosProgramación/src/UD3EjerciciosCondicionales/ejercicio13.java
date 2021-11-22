import java.util.Scanner;
public class ejercicio13{
    public static void main (String[]args){
    Scanner in=new Scanner (System.in);
        System.out.println("Escriba la temperatura: ");
        double temp=in.nextDouble();
        
        String temperatura;
        if (temp<10){
            temperatura = "frío";  
        }    
        else if (temp<=19){
            temperatura = "templado";
        }
        else if (temp<=29){
            temperatura = "caluroso";
        }
        else{
            temperatura = "tropical";
        }
        System.out.println("El tiempo esta " + temperatura);
    }
}