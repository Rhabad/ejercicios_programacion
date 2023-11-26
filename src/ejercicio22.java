import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        /*
         * Enunciado: Crea una función que reciba dos array, un booleano y retorne un
         * array.
         * - Si el booleano es verdadero buscará y retornará los elementos comunes de
         * los dos array.
         * - Si el booleano es falso buscará y retornará los elementos no comunes de los
         * dos array.
         * - No se pueden utilizar operaciones del lenguaje que lo resuelvan
         * directamente.
         */
        Scanner entrada = new Scanner(System.in);

        int[] array1 = { 1, 2, 3, 4, 4, 2, 1, 3, 6, 7, 8 };
        int[] array2 = { 2, 3, 4, 3, 5, 2, 1, 1, 10, 11, 12 };
        boolean esComun = true;

        System.out.println("Buscar Elementos Comunes?" + ""
                + "\n(Si o no)");
        String eleccion = entrada.next();

        switch (eleccion.toLowerCase()) {
            case "si":
                System.out.println(elemento(array1, array2, esComun));
                break;
            case "no":
                esComun = false;
                System.out.println(elemento(array1, array2, esComun));
                break;
            default:
                System.out.println("Introduzca una cadena correcta");
                break;
        }
        entrada.close();

    }

    private static Set<Integer> elemento(int[] array1, int[] array2, boolean esComun) {
        Set<Integer> elementos = new HashSet<>();

        if (esComun) {
            for (int primerArray : array1) {
                for (int segundoArray : array2) {
                    if (primerArray == segundoArray) {
                        elementos.add(primerArray);
                    }
                }
            }
        } else {
            // primero comparamos el primer array con el segundo
            for (int primerArray : array1) {
                boolean estaEnAmbos = false;
                for (int segundoArray : array2) {
                    if (primerArray == segundoArray) {
                        estaEnAmbos = true;
                        break;
                    }
                }
                // si no esta en segundo array
                if (!estaEnAmbos) {
                    elementos.add(primerArray);
                }
            }

            // comparamos el segundo array con el primero
            for (int segundoArray : array2) {
                boolean estaEnAmbos = false;
                for (int primerArray : array1) {
                    if (segundoArray == primerArray) {
                        estaEnAmbos = true;
                        break;
                    }
                }
                // si no esta en segundo array
                if (!estaEnAmbos) {
                    elementos.add(segundoArray);
                }
            }
        }

        return elementos;
    }
}
