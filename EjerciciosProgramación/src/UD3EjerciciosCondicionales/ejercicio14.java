import java.util.Scanner;
public class ejercicio14{
    public static void main (String[]args){
    Scanner in=new Scanner(System.in);
        System.out.println ("Escriba el número de hombres que hay en el aula: ");
        int hom=in.nextInt();
        System.out.println ("Escriba el número de mujeres que hay en el aula");
        int muj=in.nextInt();
        
        int tot= hom+muj;
        double pH=(hom*100)/(double)tot;
        double pM=(muj*100)/(double)tot;
        System.out.println("El porcentaje de hombres es: " + pH + " %");
        System.out.println("El porcentaje de mujeres es: " + pM + " %");
        
        String mayor;
        if (hom>muj){
            mayor="más hombres";}
        else if (muj>hom){
            mayor="más mujeres";}
        else{
            mayor= "los mismos hombres que mujeres";}
        
        System.out.println("Hay " + mayor);
        
    }
}