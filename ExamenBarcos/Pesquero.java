package ExamenBarcos;

public class Pesquero implements Barcos {
    private double metros;
    private double potencia;
    private int numPescadores;
    
    public String alarma() {
        return "Alarma desde pesquero";
    }

    public String mensajeSocorro() {
        return alarma() + ", dale caña vamos";
    }

    public String toString() {
        return "Datos pesquero:\n"
                + "Eslora: " + metros + "m\n"
                + "Potencia: " + potencia + "j\n"
                + "Num. pescadores: " + numPescadores;

    }
}
