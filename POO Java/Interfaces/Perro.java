package Interfaces;

public class Perro implements Animal{
    public void tipoDeAnimal() {
        System.out.println("Soy un mamífero");
    }

    public String mostrarNombre() {
        return "Perro";
    }
    
}
