public class ejercicio13 {
    public static void main (String[] arg){
         /* Enunciado: Escribe una función que calcule y
         retorne el factorial de un número dado de forma recursiva.
          */

        int factorial = 5;
        System.out.println(factorialNumero(factorial));
    }

    public static int factorialNumero(int factorial){
        int resultFactorial = factorial;
        for (int i = factorial; i > 1; i--){
            int numero = i;
            resultFactorial = resultFactorial * (numero-1);
        }
        return  resultFactorial;
    }
}
