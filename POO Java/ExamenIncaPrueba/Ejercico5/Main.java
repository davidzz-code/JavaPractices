package ExamenIncaPrueba.Ejercico5;
public class Main {
    public static void main(String[] args) {
        ArrayComputers computersArray = new ArrayComputers();

        Computers pc1 = new Computers("01a", "C12", 16, 1920, 2);
        Computers pc2 = new Computers("01b", "C12", 16, 1920, 2);
        Computers pc3 = new Computers("01c", "C12", 16, 1920, 2);
        Computers pc4 = new Computers("02a", "D35", 64, 1920, 2);

        // Crear la ARRAY computers
        computersArray.addComputer(pc1);
        computersArray.addComputer(pc2);
        computersArray.addComputer(pc3);
        computersArray.addComputer(pc4);
        computersArray.addComputer(pc4);
        
        // System.out.println("El ordenador " + pc1.getId() + " es: " + pc1.clasifica());

        System.out.println("La media del aula " + pc1.getAula() + " es: " + computersArray.calculaMediaRamAula("C12"));


    }
}
