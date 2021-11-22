import java.util.Scanner;
public class ejercicio22{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println ("Introduzca el precio de los tres productos: ");
        double pre1 = in.nextDouble();
        double pre2 = in.nextDouble();
        double pre3 = in.nextDouble();
        System.out.println("Introduzca el % de IVA a aplicar: ");
        double iva = in.nextDouble();
        
        double precio_sin_Iva = pre1 + pre2 + pre3;
        System.out.println("El precio total sin iva es= " + precio_sin_Iva);
        double Iva = (precio_sin_Iva * iva)/100;
        System.out.println("El precio del iva es= " + Iva);
        double precio_iva=precio_sin_Iva + Iva;
        
        
        if (precio_iva>50){
            precio_iva=precio_iva * 0.95;
        }
        else{
            
        }
        System.out.println("El precio total con iva es= " + precio_iva);
        
    }
}