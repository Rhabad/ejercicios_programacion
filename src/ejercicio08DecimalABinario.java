import java.util.Scanner;

public class ejercicio08DecimalABinario {
    public static void main (String[] args){
        /*
        * Enunciado: Crea un programa se encargue de transformar un
        * número decimal a binario sin utilizar funciones propias
        * del lenguaje que lo hagan directamente.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese nuero decimal: ");
        int numeroDecimal = entrada.nextInt();

        boolean esNegativo = false;
        if (numeroDecimal < 0){
            esNegativo = true;
            numeroDecimal = Math.abs(numeroDecimal);
        }

        StringBuilder binario = new StringBuilder();

        if (numeroDecimal == 0){
            binario.append("0");
        } else {
            while (numeroDecimal > 0){
                int residuo = numeroDecimal % 2;
                binario.insert(0, residuo);
                numeroDecimal = numeroDecimal/2;
            }
        }

        if (esNegativo){
            binario.insert(0, "-");
        }

        System.out.println("numero binario: "+binario.toString());

    }
}
