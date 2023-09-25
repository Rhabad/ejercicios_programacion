import java.util.Scanner;

public class ejercicio04 {
    public static void main (String[] args){
        /*
        * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una)
        * que sea capaz de calcular y retornar el área de un polígono.
        * - La función recibirá por parámetro sólo UN polígono a la vez.
        * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
        * - Imprime el cálculo del área de un polígono de cada tipo.
        */
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite la base: ");
        float base = entrada.nextFloat();
        System.out.println("digite la altura: ");
        float altura = entrada.nextFloat();

        float resultCuadrado = areaCuadrado(base, altura);
        System.out.println(resultCuadrado);
        float resultRectangulo = areaRectangulo(base, altura);
        System.out.println(resultRectangulo);
        float resultTriangulo = areaTriangulo(base, altura);
        System.out.println(resultTriangulo);

    }

    public static float areaCuadrado(float base, float altura){
        float resultado = 0;
        System.out.println("cuadrado");
        return resultado = base * base;
    }
    public static float areaRectangulo(float base, float altura){
        System.out.println("rectangulo");
        float resultado = 0;
        return resultado = base * altura;
    }
    public static float areaTriangulo(float base, float altura){
        System.out.println("triangulo");
        float resultado = 0;
        return resultado = (base * altura) /2;
    }
}
