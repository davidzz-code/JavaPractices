package ExamenIncaPrueba.Ejercico5;

public class ArrayComputers {
    private Computers[] computers;
    private int numComputers;
    private final int MAX_COMPUTERS = 100;

    public ArrayComputers() {
        computers = new Computers[MAX_COMPUTERS];
        numComputers = 0;
    }

    public boolean addComputer(Computers computer) {
        if (numComputers < MAX_COMPUTERS) {
            computers[numComputers++] = computer;
        }
        return (numComputers < MAX_COMPUTERS);
    }

    public double calculaMediaRamAula(String aula) {
        int sumaRam = 0;
        int numComputersAula = 0;

        for (int i = 0; i < numComputers; i++) {
            if (computers[i].getAula() == aula) {
                sumaRam += computers[i].getRam();
                numComputersAula++;
            }
        }
        
        double resultado = 0;
        if (numComputersAula > 0) {
            resultado = sumaRam / numComputersAula;
        }

        return resultado;
    }
}