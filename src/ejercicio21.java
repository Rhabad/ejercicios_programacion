import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio21 {

    public static void main(String[] args) {
        /*
         * Enunciado: Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula
         * su resultado e imprímelo.
         * - El .txt se corresponde con las entradas de una calculadora.
         * - Cada línea tendrá un número o una operación representada por un símbolo
         * (alternando ambos).
         * - Soporta números enteros y decimales.
         * - Soporta las operaciones suma "+", resta "-", multiplicación "*" y división
         * "/".
         * - El resultado se muestra al finalizar la lectura de la última línea (si el
         * .txt es correcto).
         * - Si el formato del .txt no es correcto, se indicará que no se han podido
         * resolver las operaciones.
         */
        String archivo = "src//ejercicio21.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            double resultado = 0;

            while ((linea = br.readLine()) != null) {
                if (linea.matches("[0-9]+") || linea.matches("[0-9]+\\.[0-9]+")) {
                    resultado = Double.parseDouble(linea);
                } else {
                    resultado = calcular(resultado, linea.charAt(0), Double.parseDouble(br.readLine()));
                }
            }

            System.out.println("El resultado es: " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calcular(double num1, char operador, double num2) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    System.exit(1);
                }
            default:
                System.out.println("Error: Operador no válido.");
                System.exit(1);
                return 0;
        }
    }
}