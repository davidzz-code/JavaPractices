package ExamenBarcos;

public class Crucero implements Barcos {
    private double metros;

    public String alarma() {
        return "Alarma desde crucero";
    }

    public String mensajeSocorro() {
        return alarma() + " ayuda rápido";
    }

    public String toString() {
        return "Crucero:\n"
                + "Eslora: " + metros + "m\n";
    }
    
}
