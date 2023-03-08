package Herencia.Empleados;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }
    
    public Directivo() {
    }

    public String toString() {
        return super.toString() + " -> Directivo";
    }

}
