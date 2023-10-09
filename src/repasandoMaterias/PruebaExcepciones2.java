package repasandoMaterias;

import java.io.*;

public class PruebaExcepciones2 {
    //try catch para excepciones verificadas

    private void leerArchivos() throws IOException {
        File archivo = new File("C:\\Users\\nicol\\Desktop\\Programacion\\hola.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }
    private void leerArchivo2(){
        try {
            leerArchivos();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Ha ocurrido una excepcion verificada");
        }

        System.out.println("Terminado");
    }

    public static void main(String[] args){
        PruebaExcepciones2 pru = new PruebaExcepciones2();
        pru.leerArchivo2();
    }

}
