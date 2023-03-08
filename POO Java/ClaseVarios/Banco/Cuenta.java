package ClaseVarios.Banco;

/**
 * Clase Cuenta que permite almacenar información de una cuenta bancaria
 */

public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private static int contador = 0; // Atributo común a todas las instancias de la clase (static)


    public Cuenta() { // Constructor de la clase, inicializa los atributos
        this.numeroCuenta = "";
        this.saldo = 0;
    }

    public Cuenta(String numeroCuenta, double saldo) { // Constructor con dos parámetros
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public abstract void pagarIntereses();


    public void setNumercoCuenta(String numeroCuenta) {     // SETTERS
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNumeroCuenta() {     // GETTERS
        return numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
