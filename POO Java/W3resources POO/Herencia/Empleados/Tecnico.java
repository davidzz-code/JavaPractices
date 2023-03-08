package Herencia.Empleados;

public class Tecnico extends Operario {
    public Tecnico(String nombre) {
        super(nombre);
    }

    public Tecnico() {
    }

    public String toString() {
        return super.toString() + " -> Técnico";
    }
}
