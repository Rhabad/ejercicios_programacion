import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args){
        /*
        * Enunciado: Crea una función que analice una matriz 3x3 compuesta por "X" y "O" y retorne lo siguiente:
        * - "X" si han ganado las "X"
        * - "O" si han ganado los "O"
        * - "Empate" si ha habido un empate
        * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta. O si han ganado los 2.
        * Nota: La matriz puede no estar totalmente cubierta. Se podría representar con un vacío "", por ejemplo.
        */
        Scanner entrada = new Scanner(System.in);

        String[][] tresEnRaya = new String[3][3];
        for (int i=0;i<3;i++){
            for (int k=0;k<3;k++){
                tresEnRaya[i][k] = "";
            }
        }

        //juega
        String ganador = "";
        boolean turno = true; //por defecto empieza x
        do {
            System.out.println("Introdusca la posiciones (vertical, horizontal)");
            int posX = entrada.nextInt();
            int posY = entrada.nextInt();

            if (turno){
                tresEnRaya[posX][posY] = "X";
                turno = false;
            } else {
                tresEnRaya[posX][posY] = "O";
                turno = true;
            }
            for (int i=0;i<3;i++){
                for (int k=0;k<3;k++){
                    System.out.print(tresEnRaya[i][k]+" ");
                }
                System.out.println();
            }
            ganador = ganador(tresEnRaya);

        }while (ganador.equals(""));


    }

    public static String ganador(String[][] tresEnRaya){
        //gana X, horizontal
        String ganador = "";
        if (tresEnRaya[0][0].equals("X") && tresEnRaya[0][1].equals("X") && tresEnRaya[0][2].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        if (tresEnRaya[1][0].equals("X") && tresEnRaya[1][1].equals("X") && tresEnRaya[1][2].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        if (tresEnRaya[2][0].equals("X") && tresEnRaya[2][1].equals("X") && tresEnRaya[2][2].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        //gano x, vertical
        if (tresEnRaya[0][0].equals("X") && tresEnRaya[1][0].equals("X") && tresEnRaya[2][0].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        if (tresEnRaya[0][1].equals("X") && tresEnRaya[1][1].equals("X") && tresEnRaya[2][1].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        if (tresEnRaya[0][2].equals("X") && tresEnRaya[1][2].equals("X") && tresEnRaya[2][2].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        //gano x, diagonal
        if (tresEnRaya[0][0].equals("X") && tresEnRaya[1][1].equals("X") && tresEnRaya[2][2].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }
        if (tresEnRaya[0][2].equals("X") && tresEnRaya[1][1].equals("X") && tresEnRaya[2][0].equals("X")){
            System.out.println("Gano X");
            ganador = "Gano X";
        }

        //gano O, horizontal
        if (tresEnRaya[0][0].equals("O") && tresEnRaya[0][1].equals("O") && tresEnRaya[0][2].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        if (tresEnRaya[1][0].equals("O") && tresEnRaya[1][1].equals("O") && tresEnRaya[1][2].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        if (tresEnRaya[2][0].equals("O") && tresEnRaya[2][1].equals("O") && tresEnRaya[2][2].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        //gano o, vertical
        if (tresEnRaya[0][0].equals("O") && tresEnRaya[1][0].equals("O") && tresEnRaya[2][0].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        if (tresEnRaya[0][1].equals("O") && tresEnRaya[1][1].equals("O") && tresEnRaya[2][1].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        if (tresEnRaya[0][2].equals("O") && tresEnRaya[1][2].equals("O") && tresEnRaya[2][2].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        //gano o, diagonal
        if (tresEnRaya[0][0].equals("O") && tresEnRaya[1][1].equals("O") && tresEnRaya[2][2].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        if (tresEnRaya[0][2].equals("O") && tresEnRaya[1][1].equals("O") && tresEnRaya[2][0].equals("O")){
            System.out.println("Gano O");
            ganador = "Gano O";
        }
        return ganador;
    }
}
