import java.util.Scanner;
public class Ejercicio27{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println("Escriba la fecha actual:  \n"
                + "Día :" );
        int da = in.nextInt();
        
        System.out.println("Mes: ");
        int ma = in.nextInt();
        
        System.out.println("Año: ");
        int aa = in.nextInt();
        
        
        System.out.println("Escriba la fecha de su cumpleaños: \n"
                + "Día");
        int dc = in.nextInt();
        
        System.out.println("Mes: ");
        int mc = in.nextInt();
        
        System.out.println("Año: ");
        int ac = in.nextInt();
        
        int años;
        if (ma < mc || (ma == mc && da < dc)){
            años= aa - ac -1;
        }
        
        else{
            años = aa-ac;
        }
        System.out.println("Tienes " + años + " años");
        
        
    }
}