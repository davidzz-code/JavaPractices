package NewDawnBank;

import java.util.ArrayList;

public class CuentaBancaria {
    private ArrayList<Character> iban;
    private String titular;
    private double saldo = 0;
    public static ArrayList<Integer> movimientos;

    // Constructor para determinar el tamaño de las arrays
    public CuentaBancaria() {
        movimientos = new ArrayList<>(100);
        iban = new ArrayList<>(22);
    }

    // Caso 1: Mostrar los datos de la cuenta
    public String datosCuenta() {
        return "Titular: " + titular + "\n"
                + "IBAN: " + iban + "\n"
                + "Saldo: " + saldo + " euros\n";
    }

    // Caso 2: Mostrar el IBAN
    public String mostrarIban() {
        return "IBAN: " + iban;
    }

    // Caso 3: Mostrar el titular
    public String mostrarTitular() {
        return "Titular: " + titular;
    }

    // Caso 4: Mostrar el saldo disponible
    public String mostrarSaldo() {
        return "Saldo disponible: " + saldo;
    }

    // Caso 5: Ingresar dinero
    public void ingreso(int cantidad) { // Imprimir si se ha hecho correctamente
        saldo += cantidad;
        movimientos.add(cantidad);     // Imprimir también si hay algún error por la cantidad de ingereso o movimientos
    }

    // Caso 6: Retirada de dinero


}
