import java.util.Scanner;
public class ejercicio17{
    public static void main (String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println("Introduzca el precio del articulo sin IVA: ");
        double precio=in.nextDouble();
        System.out.println("Introduzca el % de IVA a aplicar: ");
        double iva=in.nextDouble();
        double precio_iva=(precio * iva)/100;
        double precio_tot= precio+precio_iva;
        
        if (precio<=0 ||iva<=0){
            System.out.println("Error");}
        else{
            System.out.println("El precio con IVA es= " + precio_tot + " €");
        }
        
    }
}