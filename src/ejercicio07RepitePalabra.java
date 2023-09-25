public class ejercicio07RepitePalabra {
    public static void main (String[] args){
        /* Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra
        * y que muestre el recuento final de todas ellas.
        * - Los signos de puntuación no forman parte de la palabra.
        * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
        * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
        */

        String texto = "Hola, este es un ejemplo de cómo contar la palabra hola en un texto. Hola mundo!, hola hola";
        String palabraBuscar = "hola";

        String[] palabrasTexto = texto.split("\\s+");

        int cont = 0;
        for (String palabra: palabrasTexto){
            palabra = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (palabra.equals(palabraBuscar.toLowerCase())){
                cont++;
            }
        }

        System.out.println("la palabra "+palabraBuscar+" aparece: "+cont);
    }
}
