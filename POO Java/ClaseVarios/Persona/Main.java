package ClaseVarios.Persona;

public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.presentación();

        Persona kratos = new Persona("Kratos", "Zeuson");
        kratos.presentación();

        Persona thor = new Persona("Thor", "Oddinson", 34);
        thor.presentación();
    
        
        // Ejemplo setters y getters
        Persona p = new Persona();
        
        p.setNombre("Andrés");
        p.setApellidos("Alguacil");
        p.setEdad(28);
        p.setAltura(180);
        p.setPeso(80);

        System.out.println();
        System.out.println(p);

    }
}