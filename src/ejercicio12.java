public class ejercicio12 {
    public static void main (String[] args){
        /*
        * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean)
        * según sean o no palíndromos.
        * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
        * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
        * Ejemplo: Ana lleva al oso la avellana.
        */
        String palindromo = "ana lleva al oso la avellana";

        System.out.println(isPalindromo(palindromo));
    }

    public static boolean isPalindromo(String palindromo){
        String texto = palindromo.replaceAll("\\s", "");
        int largo = texto.length()-1;
        String invertido = "";

        for (int i = largo; i >= 0; i--){
            invertido += texto.charAt(i);
        }
        if (texto.equals(invertido)){
            System.out.println(texto);
            System.out.println(invertido);
            return true;
        } else {
            System.out.println(texto);
            System.out.println(invertido);
            return false;
        }
    }
}
