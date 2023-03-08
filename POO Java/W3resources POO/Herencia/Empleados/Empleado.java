package Herencia.Empleados;

public class Empleado {
    private String nombre;

    public Empleado() {
        nombre = "";
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Método to String
    public String toString() {
        return "Empleado: " + nombre;
    }

    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
}

