import java.util.Scanner;
public class Ejercicio1{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println("Conteste a las siguientes preguntas: ");
        int riesgo = 5;
        String p = "s/n";
        int fact = 0;
        char c;
        
        System.out.println("¿Tiene la presión arterial alta? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 15;
            fact += 1;
        }
        
        System.out.println("¿Tiene el colesterol elevado? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's' ){
            riesgo += 15;
            fact += 1;
        }
        
        System.out.println("¿Tiene diabetes? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 10;
            fact += 1;
        }
        
        System.out.println("¿Tiene obesidad? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 10;
            fact += 1;
        }
        
        System.out.println("¿Tiene tabaquismo? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 10;
            fact += 1;
        }
        
        System.out.println("¿Tiene inactividad física? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 10;
            fact +=1;
        }
        
        System.out.println("¿Pertenece al sexo masculino? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 5;
            fact += 1;
        }
        
        System.out.println("¿Tiene familiares con enfermedades del corazon? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 5;
            fact += 1; 
        }
        
        System.out.println("¿Tiene una edad mayor a 55 años? " + p);
        c = in.nextLine().charAt(0);
        if (c == 's'){
            riesgo += 5;
            fact += 1;
        }
        String num;
        double m;
        
        if (fact == 1){
            m = (double)riesgo * 1;
            num = "1";
        }
        
        else if (fact == 2){
            m = (double)riesgo * 1.25;
            num = "1.25";
        }
        
        else if (fact <= 4){
            m = (double)riesgo * 1.5;
            num = "1.5";
        }
        
        else if (fact <= 6 ){
            m = (double) riesgo * 1.75;
            num = "1.75";
        }
       
        else if (fact <= 8){
            m = (double) riesgo * 2;
            num = "2";
        }
        
        else{
            m = (double) riesgo * 2.5;
            num = "2.5";
        }
        
        System.out.println("Riesgo inicial: " + riesgo);
        System.out.println("El efecto multiplicador: " + num);
        System.out.println("El riesgo final: " + m);
        
    }
}