public class ejercicio06 {
    public static void main (String[] args){
        /* Enunciado: Crea un programa que invierta el orden de una cadena de texto
        * sin usar funciones propias del lenguaje que lo hagan de forma automática.
        * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
        */
        String texto = "Hola mundo";
        System.out.println(invertido(texto));


    }

    public static String invertido(String texto){
        int largo = texto.length()-1;
        String textoInvertido = "";

        char caracter;
        for (int i = largo; i >= 0; i--){
            caracter = texto.charAt(i);
            textoInvertido = textoInvertido + caracter;
        }

        return textoInvertido;
    }
}
