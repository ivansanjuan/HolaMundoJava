/*
 * Proyecto Star_Wars_C_digos_Secretos - Archivo StarWarsCódigosSecretos.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package star.wars.códigos.secretos;

/**
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 19:12:55
 */
import java.util.Scanner;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Portada
        System.out.println("    8888888888  888    88888       \n"
               	  + "   88     88   88 88   88  88      \n"
                	  + "    8888  88  88   88  88888       \n"
                	  + "       88 88 888888888 88   88     \n"
                	  + "88888888  88 88     88 88    888888\n"
                	  + " \n"
                	  + " \n"
                	  + "88  88  88   888    88888    888888\n"
                	  + "88  88  88  88 88   88  88  88     \n"
                	  + "88 8888 88 88   88  88888    8888  \n"
               	   + " 888  888 888888888 88   88     88 \n"
                	  + "  88  88  88     88 88    8888888  \n"
               	  + "\n"
                	  + "(Presiona Intro para continuar)");
        //
        //                          / \"
        //                         |OO )"
        //                         _\=/_  "
        //      ___               /     \ "
        //     /() \             //|/.\|\\ "
        //   _|_____|_           \\ \_/  || "
        //  | | === | |           \|\ /| || "
        //  |_|  0  |_|           #_ _/  "
        //   ||  0  ||            | | |  "
        //   ||__* __||           | | | "
        //  |_ \___/ _|           []|[] "
        //  /=\ /=\ /=\           | | | "
        //__[_]_[_]_[_]__________/_]_[_\____ "

        in.nextLine();

// Inicio
        System.out.println("=== STAR WARS CÓDIGOS SEGRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana... La princesa\n"
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                + "en otra estrella de la muerte que el imperio está construyendo\n"
                + "para destruirla. (Presiona Intro para continuar)");

        in.nextLine();

        int nivel = 1;

        while (nivel <= 6 && nivel != 0) {

            boolean respuesta = false;
            int calculo = 1;
            int contestacion = 0;

            switch (nivel) {

                //Inicio nivel 1
                case 1:

                    int S1 = (int) (Math.random() * (10 - 1 + 1) + 1);
                    int S2 = (int) (Math.random() * (30 - 20 + 1) + 20);

                    System.out.println("\n"
                            + "Los problemas empiezan cuando deben realizar un salto\n"
                            + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + ", pero el\n"
                            + "control de navegación está estropeado y el computador tiene\n"
                            + "problemas para calcular parte de las coordenadas de salto.\n"
                            + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                            + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                            + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                            + "nº del sistema y el nº del sector (ambos inclusive). ¿Qué debe\n"
                            + "introducir?");

                    for (int i = S1; i <= S2; i++) {
                        calculo += i;
                    }
                    calculo--;
                    contestacion = in.nextInt();
                    if (calculo == contestacion) {
                        respuesta = true;
                    } else {
                        respuesta = false;
                    }
                    break;

                //Inicio nivel 2
                case 2:

                    int P1 = (int) (Math.random() * (7 - 1 + 1) + 1);
                    int P2 = (int) (Math.random() * (12 - 8 + 1) + 8);

                    System.out.println("\n"
                            + "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                            + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                            + "robada se aproximan lentamente con la intención de pasar\n"
                            + "desapercibidos. De repente suena el comunicador. “Aquí agente\n"
                            + "de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + " . No están\n"
                            + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                            + "comunicador e improvisa. “Eh… tenemos un fallo en el… eh…\n"
                            + "condensador de fluzo... Solicitamos permiso para atracar y\n"
                            + "reparar la nave”. El agente, que no se anda con tonterías,\n"
                            + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                            + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                            + "guantera y da con la página correcta. El código es el productorio\n"
                            + "entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                            + "¿Cuál es el código?\n"
                            + "");

                    for (int i = P1; i <= P2; i++) {
                        calculo *= i;
                    }

                    contestacion = in.nextInt();
                    if (calculo == contestacion) {
                        respuesta = true;
                    }

                    break;

                //Inicio nivel 3
                case 3:
                    int N = (int) (Math.random() * (100 - 50 + 1) + 50);

                    System.out.println("\n"
                            + "Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                            + "la muerte, se equipan con trajes de soldados imperiales que\n"
                            + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                            + "deben averiguar en qué nivel de los " + N + " existentes se encuentra el\n"
                            + "reactor principal. Se dirigen al primer panel computerizado que\n"
                            + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                            + "nave pero necesita introducir una clave de acceso. Entonces\n"
                            + "recuerda la información que le proporcionó Lando Calrissian “La\n"
                            + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                            + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                            + "¿Cual es el nivel correcto?");

                    int i = (int) Math.floor(N);

                    i /= 10;

                    for (; i > 0; i--) {
                        calculo *= i;

                    }
                    contestacion = in.nextInt();
                    if (calculo == contestacion) {
                        respuesta = true;
                    }

                    break;

                //Inicio nivel 4
                case 4:
                    boolean esPrimo = true;

                    int P = (int) (Math.random() * (100 - 10 + 1) + 10);

                    System.out.println("\n"
                            + "Gracias a la inteligencia de Leia llegan al nivel correcto y \n"
                            + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                            + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                            + "número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");

                    for (int j = 2; j <= 50; j++) {
                        if ((P % j) == 0) {
                            esPrimo = false;
                        }
                    }

                    contestacion = in.nextInt();

                    if (contestacion == 1 && esPrimo == true || contestacion == 0 && esPrimo == false) {
                        respuesta = true;
                    }

                    break;

                //Inicio nivel 5
                case 5:
                    int M = (int) (Math.random() * (10 - 5 + 1) + 5);
                    int S = (int) (Math.random() * (10 - 5 + 1) + 5);
                    int numM = 1;
                    int numS = 1;

                    System.out.println("\n"
                            + "Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                            + "coloque la bomba, programe el temporizador y salir de allí\n"
                            + "corriendo. Necesita programarlo para que explote en exactamente\n"
                            + " " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes\n"
                            + "de que explote pero sin que el sistema de seguridad anti-\n"
                            + "explosivos detecte y desactive la bomba. Pero el temporizador\n"
                            + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                            + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                            + "factorial de " + M + " y el factorial de " + S + " . ¿Qué valor debe introducir?");

                    for (int k = M; k > 0; k--) {
                        numM *= k;
                    }

                    for (int j = S; j > 0; j--) {
                        numS *= j;
                    }

                    calculo = numM + numS;

                    contestacion = in.nextInt();

                    if (calculo == contestacion) {
                        respuesta = true;
                    }

                    break;

                case 6:
                    System.out.println("\n"
                            + "Luke Skywalker introduce el tiempo correcto, activa el\n"
                            + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                            + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                            + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                            + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                            + "medida que se alejan observan por la ventana la imagen de la\n"
                            + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                            + "desapareciendo para siempre junto a los restos del malvado\n"
                            + "imperio.\n"
                            + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                            + "Enhorabuena ;D");
                    respuesta = true;

            }
            //Nivel perder
            if (respuesta == false) {
                nivel *= 0;
                System.out.println("\n"
                        + "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                        + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!\n"
                        + "");
            }
            //Cuando la respuesta que introduzca sea verdadera se pasara al siguiente nivel
            if (respuesta == true) {
                nivel++;
            }

        }
//Pantalla de final
        System.out.println("\n"
                + "Gracias por jugar :D");
    }

}
