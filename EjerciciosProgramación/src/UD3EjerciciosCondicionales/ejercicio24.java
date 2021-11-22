import java.util.Scanner;
public class ejercicio24{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println("Introduzca el valor de la compra: ");
        double valor = in.nextDouble();
        in.nextLine();
        
        System.out.println("Contesta a la siguientes pregunta con s o n");
        System.out.println("¿Se trata de un pago al contado?");
        char con = in.nextLine().charAt(0);
        if (con=='s'){
            double descuento = (valor * 5)/100;
            System.out.println("El descuento aplicado es= " + descuento);
            double precio_d= valor - descuento;
            System.out.println("El precio al pagar al contado es= " + precio_d);
        }
        else if (con=='n'){
            double incremento = (valor * 3)/100;
            System.out.println("El incremento aplicado es= " + incremento);
            double precio_a = valor + incremento;
            System.out.println("El precio al pagar en targeta es= " + precio_a);
        }
        else{
            System.out.println("ERROR! Respuesta no reconocida");
        }
    }
}