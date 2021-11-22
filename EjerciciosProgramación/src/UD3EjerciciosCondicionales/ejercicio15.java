import java.util.Scanner;
public class ejercicio15{
    public static void main(String[]args){
    Scanner in=new Scanner (System.in);
    System.out.println ("Escriba las tres notas en números enteros: ");
    int not1=in.nextInt();
    int not2=in.nextInt();
    int not3=in.nextInt();
    
    double media=((double)not1+(double)not2+(double)not3)/3;
    
    
    if ((not1<5||not2<5||not3<5)&&media>4){
        media=4;
    }
    else{
        
    }
    System.out.println("La nota media es= " + Math.round(media));
    }
}