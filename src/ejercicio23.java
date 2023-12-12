public class ejercicio23 {
    public static void main(String[] args) {
        /*
         * Enunciado: Crea dos funciones, una que calcule el máximo común divisor (MCD)
         * y otra que calcule el mínimo común múltiplo (mcm) de dos números enteros.
         * - No se pueden utilizar operaciones del lenguaje que lo resuelvan
         * directamente.
         */
        int numero1 = 24;
        int numero2 = 36;

        int mcd = maximoComunDivisor(numero1, numero2);
        int mcm = minimoComunMultiplo(numero1, numero2);

        System.out.println("MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
        System.out.println("MCM de " + numero1 + " y " + numero2 + " es: " + mcm);

    }

    private static int maximoComunDivisor(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return maximoComunDivisor(num2, num1 % num2);
        }
    }

    private static int minimoComunMultiplo(int num1, int num2) {
        return (num1 * num2) / maximoComunDivisor(num1, num2);
    }
}
