import java.util.Scanner;
public class ejercicio21{
    public static void main(String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println("Escriba su peso: ");
        double peso = in.nextDouble();
        System.out.println("Escriba su altura: ");
        double altura = in.nextDouble();
        double imc=peso/(altura*altura);
        
        if (imc<16){
            System.out.println("Diagnóstico: Criterio de ingreso en hospital");
        }
        else if (imc<17){
            System.out.println("Diagnóstico: Infrapeso");
        }
        else if (imc<18){
            System.out.println("Diagnóstico: Bajo peso");
        }
        else if (imc<25){
            System.out.println("Diagnóstico:peso normal");
        }
        else if (imc<30){
            System.out.println("Diagnóstico: sobrepeso");
        }
        else if (imc<35){
            System.out.println("Diagnóstico: sobrepeso crónico");
        }
        else if (imc<40){
            System.out.println("Diagnóstico:obesidad premórdiba");
        }
        else{
            System.out.println("Diagnóstico: obesidad mórdida");
        }
        
    }
}