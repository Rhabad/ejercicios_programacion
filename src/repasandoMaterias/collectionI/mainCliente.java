package repasandoMaterias.collectionI;

import java.util.HashSet;
import java.util.Set;

public class mainCliente {
    public static void main (String[] args){
        Cliente clie1 = new Cliente("Nico", "0001", 4567);
        Cliente clie2 = new Cliente("paco", "0002", 2000);
        Cliente clie3 = new Cliente("victor", "0003", 4000);
        Cliente clie4 = new Cliente("javiera", "0004", 1000);
        Cliente clie5 = new Cliente("javiera", "0004", 1000);

        Set<Cliente> clientesBanco = new HashSet<>();

        clientesBanco.add(clie1);
        clientesBanco.add(clie2);
        clientesBanco.add(clie3);
        clientesBanco.add(clie4);
        clientesBanco.add(clie5);

        for (Cliente clieBanco: clientesBanco) {
            System.out.println(clieBanco.getNombre()+ " "+clieBanco.getNumeroCuenta()+" "+clieBanco.getSaldo());
        }

    }
}
