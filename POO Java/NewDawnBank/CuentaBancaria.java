package NewDawnBank;

import java.util.ArrayList;

public class CuentaBancaria {

    // Atributos constantes (usamos 'final')
    private final String titular;
    private final String iban;

    // Atributos variables
    private double saldo;
    public static ArrayList<Double> movimientos = new ArrayList<>(100);

    // Cuenta válida
    private boolean valida;

    public CuentaBancaria(String titular, String iban) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 0;

        // Comprobamos IBAN y registramos si es cuenta válida
        if(!iban.matches("^[A-Z]{2}\\d{22}")){
            System.err.println("ERROR: el formato del IBAN no es correcto");
            this.valida = false;
        }
        else{
            this.valida = true;
        }
    }

    // Caso 1: Mostrar los datos de la cuenta
    public void datosCuenta() {
        System.out.println("Titular: " + titular + "\n"
                + "IBAN: " + iban + "\n"
                + "Saldo: " + saldo + " euros\n");
    }

    // Caso 2: Mostrar el IBAN
    public void mostrarIban() {
        System.out.println("IBAN: " + iban);
    }

    // Caso 3: Mostrar el titular
    public void mostrarTitular() {
        System.out.println("Titular: " + titular);
    }

    // Caso 4: Mostrar el saldo disponible
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: " + saldo + " euros");
    }

    // Caso 5: Ingresar dinero
    public void ingresarDinero(double cantidad) { // Imprimir si se ha hecho correctamente
        if (movimientos.size() == 100) {
            System.out.println(".|Error, registro de movimientos máximos alcanzados|.");
        } else {
            saldo += cantidad;
            movimientos.add(cantidad); // Imprimir también si hay algún error por la cantidad de ingereso o movimientos
            System.out.println("Has ingresado " + cantidad + "€ correctamente");
        }
    }

    // Caso 6: Retirada de dinero
    public void retirarDinero(double cantidad) {
        saldo -= cantidad; // movimientos.
        movimientos.add(-cantidad);
        System.out.println("Has retirado " + cantidad + "€ correctamente");
        

    }

    // Caso 7: Mostrar movimientos
    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.print(movimientos.get(i) + ", ");
        }
    }


    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
}
