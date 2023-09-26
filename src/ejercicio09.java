import java.util.HashMap;
import java.util.Scanner;

public class ejercicio09 {
    public static void main (String[] args){
        /* Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
        * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
        * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos
        *  y dos espacios entre palabras "  ".
        * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
        */
        Scanner entrada = new Scanner(System.in);


        String texto = "El alfabeto morse, se puede traducir en java. 123";
        String textoMorse = ". .-..    .- .-.. ..-. .- -... . - ---    -- --- .-. ... . .-..-.    ... .    .--. ..- . -.. .    - .-. .- -.. ..- -.-. .. .-.    . -.    .--- .- .- .-.-.-    .---- ..--- ...--";

        System.out.println("elije: " +
                "\n1. texto a morse." +
                "\n2. morse a texto.");
        int elige = entrada.nextInt();
        switch (elige){
            case 1:
                System.out.println(traducir(texto, elige));
                break;
            case 2:
                System.out.println(traducir(textoMorse, elige));
                break;
            default:
                System.out.println("malito");
                break;
        }




    }

    public static String traducir(String texto, int elige){
        HashMap<String, String> abecedario = new HashMap<>(){{
            put("1", ".----");
            put("2", "..---");
            put("3", "...--");
            put("4", "....-");
            put("5", ".....");
            put("6", "-....");
            put("7", "--...");
            put("8", "---..");
            put("9", "----.");
            put("0", "-----");
            put("A", ".-");
            put("B", "-...");
            put("C", "-.-.");
            put("D", "-..");
            put("E", ".");
            put("F", "..-.");
            put("G", "--.");
            put("H", "....");
            put("I", "..");
            put("J", ".---");
            put("K", "-.-");
            put("L", ".-..");
            put("M", "--");
            put("N", "-.");
            put("O", "---");
            put("P", ".--.");
            put("Q", ".-.");
            put("R", ".-.");
            put("S", "...");
            put("T", "-");
            put("U", "..-");
            put("V", "...-");
            put("W", ".--");
            put("X", "-..-");
            put("Y", "-.--");
            put("Z", "--..");
            put(" ", "  ");
            put(".", ".-.-.-");
            put(",", "--..--");
            put("?", "..--..");
            put("\"", ".-..-.");
            put("/", "-..-.");
        }};
        //HashMap invertido
        HashMap<String, String> abecedarioInvertido = new HashMap<>();
        for (String clave : abecedario.keySet()) {
            String valor = abecedario.get(clave);
            abecedarioInvertido.put(valor, clave);
        }


        if (elige == 1){
            String textoMayuscula = texto.toUpperCase();

            String textoEnMorse = "";
            int largo = textoMayuscula.length();

            for (int i = 0; i < largo; i++){
                String letra = String.valueOf(textoMayuscula.charAt(i));

                if (abecedario.containsKey(letra)){
                    textoEnMorse = textoEnMorse + abecedario.get(letra) + " ";
                }
            }
            return textoEnMorse;
        } else {
            String textoNatural = "";
            String[] codigoMorse = texto.trim().split("\\s+");

            int largo = codigoMorse.length;

            for (int i = 0; i<largo; i++){
                String palabraMorse = codigoMorse[i];

                if (abecedarioInvertido.containsKey(palabraMorse)){
                    textoNatural = textoNatural + abecedarioInvertido.get(palabraMorse) + " ";
                }
            }
            return textoNatural;
        }
    }
}

