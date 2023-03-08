package ClaseVarios.Banco;

public final class CuentaJoven extends Cuenta { // Una clase marcada como "final" NO PUEDE tener clases hijas.

    // Implementación del método "pagarIntereses".
    // Si no la implementamos la clase Cuenta 
    public void pagarIntereses() {
        this.setSaldo(this.getSaldo() * 0.05);
    }
    
}
