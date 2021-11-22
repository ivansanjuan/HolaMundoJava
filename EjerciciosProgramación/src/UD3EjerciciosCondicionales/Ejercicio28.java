import java.util.Scanner;
public class Ejercicio28{
    public static void main (String []args){
    Scanner in = new Scanner (System.in);
        System.out.println("Escriba una fecha para comprobar si existe: \n"
                + "Día: ");
        int d = in.nextInt();
                
        System.out.println("Mes: ");
        int m = in.nextInt();
        System.out.println("Año: ");
        int a = in.nextInt();
        
        String resp;
        switch (m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (d <= 31){
                    resp = "valida";
                } 
                else{
                    resp = "no valida";
                    
                }
                break;
            
            case 2:
                if (d <= 28){
                    resp = "valida";
                }
                else{
                    resp = "no valida";
                }
                break;
            case 4: case 6: case 9: case 11:
                if (d <= 30){
                    resp = "valida";
                }
                else{
                    resp = "no valida";
                }
                break;
            default:
                resp = "no valida";
        }
        System.out.println("La fecha introducida es " + resp);
                    
    }
}