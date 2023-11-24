public class ejercicio20 {
    public static void main(String[] args) {
        /*
         * Enunciado: Crea una función que sume 2 números y retorne su resultado pasados
         * unos segundos.
         * - Recibirá por parámetros los 2 números a sumar y los segundos que debe
         * tardar en finalizar su ejecución.
         * - Si el lenguaje lo soporta, deberá retornar el resultado de forma asíncrona,
         * es decir, sin detener la ejecución del programa principal. Se podría ejecutar
         * varias veces al mismo tiempo.
         */
        double result = sumarNumeros(3, 4, 3);
        System.out.println("El resultado es: " + result);
    }

    public static double sumarNumeros(double num1, double num2, int segundos) {

        try {
            for (int i = 0; i < segundos; i++) {
                Thread.sleep(1000);
                System.out.println((i + 1) + " Segundo.");
            }
            return num1 + num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num1 + num2;
    }
}
