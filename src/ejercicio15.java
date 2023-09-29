import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ejercicio15 {
    public static void main(String[] args){
        /*
        * Enunciado: Crea una función que calcule y retorne cuántos días hay
        * entre dos cadenas de texto que representen fechas.
        * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
        * - La función recibirá dos String y retornará un Int.
        * - La diferencia en días será absoluta (no importa el orden de las fechas).
        * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
        */
        String fechaInicio = "2009/05/15";
        String fechaTermino = "2010/05/15";

        System.out.println(diasCant(fechaInicio, fechaTermino));


    }

    public static int diasCant(String fechaInicio, String fechaTermino){
        String fecIniMod = fechaInicio.replaceAll("/", " ");
        String fecTerMod = fechaTermino.replaceAll("/", " ");

        String[] iniPalabras = fecIniMod.split(" ");
        String[] terPalabras = fecTerMod.split(" ");

        int anioIni = Integer.parseInt(iniPalabras[0]);
        int mesIni = Integer.parseInt(iniPalabras[1]);
        int diaIni = Integer.parseInt(iniPalabras[2]);

        int anioTer = Integer.parseInt(terPalabras[0]);
        int mesTer = Integer.parseInt(terPalabras[1]);
        int diaTer = Integer.parseInt(terPalabras[2]);

        LocalDate fechaIni = LocalDate.of(anioIni, mesIni, diaIni);
        LocalDate fechaTer = LocalDate.of(anioTer, mesTer, diaTer);
        int dias = (int)ChronoUnit.DAYS.between(fechaIni, fechaTer);

        return dias;
    }


}
