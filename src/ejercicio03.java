public class ejercicio03 {
    public static void main (String[] args){
        /*
        * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
        * Hecho esto, imprime los números primos entre 1 y 100.
        */
        for (int i = 2; i <= 100; i++){
            if (esPrimo(i)){
                System.out.println(i+" es primo");
            }
        }


    }

    public static boolean esPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        if (numero <= 3){
            return true;
        }
        if (numero%2 == 0 || numero%3 == 0){
            return false;
        }

        for (int i = 5; i*i <= numero; i = i + 6){
            if (numero%i == 0 || numero%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
