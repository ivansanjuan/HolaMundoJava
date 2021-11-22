import java.util.Scanner;
public class ejercicio11{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
        int dia;
        System.out.print("Escriba un numero de la semana entre el 1 y 7: ");
        dia =in.nextInt();
        
        String dias;
        switch (dia){
            case 1:
                dias="Lunes";
                break;
            case 2:
                dias="Martes";
                break;
            case 3:
                dias="Miercoles";
                break;
            case 4:
                dias="Jueves";
                break;
            case 5:
                dias="Viernes";
                break;
            case 6:
                dias="Sabado";
                break;
            case 7:
                dias="Domingo";
                break;
            default:
                dias="no existe";
        }
         System.out.println("El dia de la semana que corresponde es el " + dias);
    }
}
