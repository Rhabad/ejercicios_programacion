import java.util.Stack;

public class ejercicio10 {
    public static void main (String[] args){
        /* Enunciado: Crea un programa que comprueba si los paréntesis, llaves y
        * corchetes de una expresión están equilibrados.
        * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
        * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
        * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
        * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
        */
        String expresionBalanceada = "{ [ a * ( c + d ) ] - 5 }";
        String expresionNoBalanceada = "{ a * ( c + d ) ] - 5 }";

        boolean esBalanceada1 = verificarEquilibrio(expresionBalanceada);
        boolean esBalanceada2 = verificarEquilibrio(expresionNoBalanceada);

        System.out.println("La expresión 1 está balanceada: " + esBalanceada1);
        System.out.println("La expresión 2 está balanceada: " + esBalanceada2);


    }
    public static boolean verificarEquilibrio(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (esDelimitadorApertura(caracter)) {
                pila.push(caracter);
            } else if (esDelimitadorCierre(caracter)) {
                if (pila.isEmpty() || !esParValido(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static boolean esDelimitadorApertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    public static boolean esDelimitadorCierre(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    public static boolean esParValido(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']') ||
                (apertura == '{' && cierre == '}');
    }
}
