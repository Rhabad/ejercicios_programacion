package repasandoMaterias;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//declaracion de las excepciones de un metodo
public class PruebaExcepciones {
    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("C:\\Users\\nicol\\Desktop\\Programacion\\hola.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws FileNotFoundException {
        leerArchivo();
    }

    public static void main(String[] args) {
        //Excepciones verificadas(IOException)

    }
}
