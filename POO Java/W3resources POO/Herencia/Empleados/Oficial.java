package Herencia.Empleados;

public class Oficial extends Operario {
    public Oficial(String nombre) {
        super(nombre);
    }

    public Oficial() {
    }
    
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
