public class ejercicio16 {
    public static void main(String[] args){
        String texto = "¡¿hola, como estas?!";

        System.out.println(primeraLetraMayuscula(texto));

    }

    public static String primeraLetraMayuscula(String texto){
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                // Encontramos la primera letra alfabética, la convertimos a mayúscula y la reemplazamos
                return texto.substring(0, i) + Character.toUpperCase(caracter) + texto.substring(i + 1);
            }
        }

        // Si no se encontraron letras alfabéticas, devolvemos el texto original sin cambios
        return texto;
    }
}
