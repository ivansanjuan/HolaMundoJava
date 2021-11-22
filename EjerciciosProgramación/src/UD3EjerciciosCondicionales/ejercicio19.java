import java.util.Scanner;
public class ejercicio19{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Introduzca un número entero: ");
        int x = in.nextInt();
        in.nextLine();
        System.out.println("Introduzca la letra segun lo que quieras calcular si: s=>Sin, c=>Cos, t=>Tan");
        char letra = in.nextLine().charAt(0);
        
        double operacion=0;
        boolean ok = true;
        
        switch (letra){
            case 's':
                operacion=Math.sin(x);
                break;
            case 'c':
                operacion=Math.cos(x);
                break;
            case 't':
                operacion=Math.tan(x);
                break;
            default:
                ok = false;
        }
        
        if (ok=true){
        System.out.println("El resultado es: " + operacion);
        }
        else{
            System.out.println("Error");
        }
        
    }
    
}