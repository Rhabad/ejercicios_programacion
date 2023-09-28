public class ejercicio11 {
    public static void main (String[] args){
        /* Enunciado: Crea una función que reciba dos cadenas como parámetro
        * (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
        * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
        * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
        */
        String str1 = "parafraseo";
        String str2 = "sensacion";

        System.out.println(cadenas(str1, str2));

    }

    public static String cadenas(String str1, String str2){
        String str1Guardar = "";
        String str2Guardar = "";

        int largo1 = str1.length();
        int largo2 = str2.length();

        //construccion del primer string
        boolean isPresent = false;
        for (int i = 0; i < largo1; i++){
            char carac1 = str1.charAt(i);

            for (int k = 0; k < largo2; k++){
                char carac2 = str2.charAt(k);

                if (carac1 == carac2){
                    isPresent = true;
                }
            }

            if (isPresent == false){
                str1Guardar += carac1;
            }
            isPresent = false;
        }

        //construccion del segundo string
        for (int i = 0; i < largo2; i++){
            char carac2 = str2.charAt(i);

            for (int k = 0; k < largo1; k++){
                char carac1 = str1.charAt(k);

                if (carac2 == carac1){
                    isPresent = true;
                }
            }

            if (isPresent == false){
                str2Guardar += carac2;
            }
            isPresent = false;
        }

        return "Primer String: "+str1Guardar+"" +
                "\nSegundo String: "+str2Guardar;
    }
}
