public class ejercicio14 {
    public static void main(String[] args){
        /*
        * Enunciado: Escribe una función que calcule si un número dado
        * es un número de Amstrong (o también llamado narcisista).
        * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
        */
        long numero = 407;

        System.out.println(isAmstrong(numero));

    }

    public static boolean isAmstrong(long numero){
        String elNumero = String.valueOf(numero);
        int digitos = elNumero.length();

        long result = 0;
        for (int i = 0; i<digitos; i++){
            long n = Long.parseLong(String.valueOf(elNumero.charAt(i)));
            result += (long) Math.pow(n, digitos);
        }
        if (result == numero){
            System.out.println(result+"\n"+numero);
            return true;
        }else {
            System.out.println(result+"\n"+numero);
            return false;
        }

    }
}
