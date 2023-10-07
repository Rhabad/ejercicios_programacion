import java.util.Random;
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args){
        /*
        * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
        * carrera de obstáculos.
        * - La función recibirá dos parámetros:
        *      - Un array que sólo puede contener String con las palabras "run" o "jump"
        *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
        * - La función imprimirá cómo ha finalizado la carrera:
        *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
        *        variará el símbolo de esa parte de la pista.
        *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
        *      - Si hace "run" en "|" (valla), se variará la pista por "/".
        * - La función retornará un Boolean que indique si ha superado la carrera.
        * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
        */
        Scanner entrada = new Scanner(System.in);

        String[] atleta = {"run", "jump"};
        String[] pista = {"_", "|"};


        System.out.println("De cuanto sera los metros de la pista?");
        int largoPista = entrada.nextInt();

        System.out.println("Eres el atleta, elige correr(run) o saltar(jump)");
        for (int i = 0; i < largoPista; i++){
            String eleccionAtleta = "";

            System.out.print("Pista: ");
            String lapista = pistaRandom(pista);
            System.out.print("Atleta: ");
            String elige = entrada.next();
            switch (elige){
                case "run":
                    eleccionAtleta = atleta[0];
                    break;
                case "jump":
                    eleccionAtleta = atleta[1];
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            System.out.println(finalizarCarrera(eleccionAtleta, lapista));
        }

    }

    public static boolean finalizarCarrera(String atleta, String pista){
        boolean superarCarrera = false;
        if (pista.equals("_")){
            if (atleta.equals("run")){
                System.out.println("Superado; piso");
                superarCarrera = true;
            } else {
                System.out.println("X");
                System.out.println("No superado");
                superarCarrera = false;
            }
        }
        if (pista.equals("|")){
            if (atleta.equals("jump")){
                System.out.println("Superado; obstaculo");
                superarCarrera = true;
            } else {
                System.out.println("/");
                System.out.println("No superado");
                superarCarrera = false;
            }
        }
        return superarCarrera;
    }

    public static String pistaRandom(String[] pista){
        Random ran = new Random();
        int indice = ran.nextInt(pista.length);

        String pistaAleatoria = pista[indice];
        System.out.println(pistaAleatoria);
        return pistaAleatoria;
    }
}
