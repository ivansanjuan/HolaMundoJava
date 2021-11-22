import java.util.Scanner;
public class ejercicio23{
    public static void main(String []args){
    Scanner in = new Scanner (System.in);
        double cuota=200;
        System.out.println("Introduzca su edad: ");
        int edad=in.nextInt();
        
        in.nextLine();
        
        if (edad>65){
            cuota= cuota * 0.5;
        }
        else if (edad<18){
            System.out.println("Escriba si sus padres son socios: ");
            System.out.println("En el caso de que si introduzca s y si no n");
            char respuesta = in.nextLine().charAt(0);
            
            if (respuesta == 's'){
                cuota = cuota * 0.65;
            }
            else{
                cuota = cuota * 0.75;
            }
        }
        else{
            
        }
        System.out.println("La cuota que  debe de pagar es= " + cuota +" €");
    }
}