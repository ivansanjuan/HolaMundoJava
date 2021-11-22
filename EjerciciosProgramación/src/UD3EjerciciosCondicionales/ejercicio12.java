import java.util.Scanner;
public class ejercicio12{
    public static void main (String[]args){
    Scanner in=new Scanner (System.in);
        System.out.println("Introduzca el número del mes que desee: ");
        int num=in.nextInt();
        int dias;
        switch (num){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias=31;
                break;
            
            case 2:
                dias=28;
                break;
                
            case 4: case 6: case 9: case 11:
                dias=30;
                break;
            default:
                dias=0;
        }
        System.out.println("El mes introducido tiene " + dias + " dias");
    }
}