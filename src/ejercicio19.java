public class ejercicio19 {
    public static void main (String[] args){
        /*
        * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros)
        * y retorne su resultado en milisegundos.
        */
        int dias = 2;
        int horas = 12;
        int minutos = 30;
        int segundos = 45;

        long milisegundos = convertirTiempoAMilisegundos(dias, horas, minutos, segundos);

        System.out.println("El tiempo en milisegundos es: " + milisegundos);
    }

        public static long convertirTiempoAMilisegundos(int dias, int horas, int minutos, int segundos) {
            long milisegundosPorDia = 24 * 60 * 60 * 1000; // Milisegundos en un día
            long milisegundosPorHora = 60 * 60 * 1000; // Milisegundos en una hora
            long milisegundosPorMinuto = 60 * 1000; // Milisegundos en un minuto
            long milisegundosPorSegundo = 1000; // Milisegundos en un segundo

            long totalMilisegundos = dias * milisegundosPorDia
                    + horas * milisegundosPorHora
                    + minutos * milisegundosPorMinuto
                    + segundos * milisegundosPorSegundo;

            return totalMilisegundos;
        }
}
