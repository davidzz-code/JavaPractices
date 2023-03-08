package Interfaces;

public class Main {
    public static void main(String[] args) {
        Perro P1 = new Perro();
        Lagarto L1 = new Lagarto();

        String perrete = P1.mostrarNombre();
        String lagartija = L1.mostrarNombre();
        
        System.out.println(perrete);
        P1.tipoDeAnimal();

        System.out.println(lagartija);
        L1.tipoDeAnimal();


    }
}
