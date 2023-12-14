import java.util.stream.IntStream;

public class ejercicio24 {
    public static void main(String[] args) {
        /*
         * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
         * ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de
         * ellas.
         */

        System.out.println("Usando for");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("Usando while");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        i = 1;
        System.out.println("Usando do-while");
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

        System.out.println("Usando IntStreamy expresiones lambda");
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }

}
