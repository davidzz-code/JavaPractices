package Herencia.Empleados;

public class Operario extends Empleado {

    // Constructor con parámetro
    public Operario(String nombre) {
        super(nombre);
    }

    // Constructor por defecto
    public Operario() {
    }

    // Extensión método toString()
    public String toString() {
        return super.toString() + " -> Operario";

    }
}
