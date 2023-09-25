public class ejercicio02 {
    public static void main (String[] args){
        /* Enunciado: Escribe un programa que imprima
        * los 50 primeros números de la sucesión de Fibonacci empezando en 0.
        * La serie Fibonacci se compone por una sucesión de números en la que
        * el siguiente siempre es la suma de los dos anteriores.
        * 0, 1, 1, 2, 3, 5, 8, 13...
        */
        long cont = 1, num1 = 0, num2 = 1;

        System.out.println(num1);
        System.out.println(num2);
        while (cont <= 50){
            long result = num1 + num2;
            System.out.println(result);
            num1 = num2;
            num2 = result;

            cont++;
        }


    }
}
