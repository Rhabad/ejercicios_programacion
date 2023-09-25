public class ejercicio01 {
    public static void main (String[] args){
        /*Enunciado: Escribe una función que reciba dos palabras (String)
        * y retorne verdadero o falso (Boolean) según sean o no anagramas.
        * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
        * NO hace falta comprobar que ambas palabras existan.
        * Dos palabras exactamente iguales no son anagrama.
        */

        String palabra1 = "hola";
        String palabra2 = "alo";

        anagrama(palabra1, palabra2);


    }


    public static boolean anagrama(String palabra1, String palabra2){
        int largo = palabra1.length() - 1;
        char caracter;
        String invertido = "";

        for (int i = largo; i >= 0; i--){
            caracter = palabra1.charAt(i);
            invertido = invertido + caracter;
        }
        if (invertido.equals(palabra2)){
            System.out.println("es anagrama");
            return true;
        }else {
            System.out.println("no es anagrama");
            return false;
        }
    }

}
