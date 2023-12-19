import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        /*
         * Enunciado: Crea un programa que calcule quien gana más partidas al piedra,
         * papel, tijera.
         * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
         * - La función recibe un listado que contiene pares, representando cada jugada.
         * - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S"
         * (tijera).
         * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
         */

        Scanner entrada = new Scanner(System.in);
        //jugando
        String jugador1;
        String jugador2;

        System.out.println("Juego del Piedra, Papel, Tijeras");
        System.out.println("Jugador 1:");
        jugador1 = entrada.next();
        System.out.println("Jugador 1:");
        jugador2 = entrada.next();

        //quien gano?


        entrada.close();
    }

    //ganador en la ronda
    private static String ganador(String jug1, String jug2){
        if (jug1.equals("piedra") && jug2.equals("tijeras")){
            System.out.println("gano piedra");
        }
        return "";
    }

}