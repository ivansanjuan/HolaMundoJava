import java.util.Scanner;
public  class Ejercicio26{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
        System.out.println("Introduzca el nombre de usuario: ");
        String usuario = in.nextLine();
        System.out.println("Introduzca la contraseña: ");
        String contra = in.nextLine();
        
        String resp1;
        if (usuario.equals("alumno")){
            resp1 = "correcta";
        }
        else{
            resp1 = "incorrecta";
        }
        System.out.println("La respuesta es " + resp1);
        
        String resp2;
        if (contra.equals("123456")){
            resp2 = "correcta";
        }
        else{
            resp2 = "incorrecta";
        }
        System.out.println("La contraseña es " + resp2);
    }
}