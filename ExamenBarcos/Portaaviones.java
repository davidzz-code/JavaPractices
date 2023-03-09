package ExamenBarcos;

public class Portaaviones implements Barcos {
    private int numAviones;
    private int numMarinos;

    // Setters
    public void setNumAviones(int numAviones) {
        this.numAviones = numAviones;
    }

    public void setNumMarinos(int numMarinos) {
        this.numMarinos = numMarinos;
    }

    // Getters
    public int getNumAviones() {
        return numAviones;
    }

    public int getuNmMarinos() {
        return numMarinos;
    }

    public String alarma() {
        return "Alarma desde portaaviones";
    }

    public String mensajeSocorro() {
        return alarma() + " ayuda por favor";
    }

    public String toString() {
        return "Datos portaaviones:\n"
                + "Num. aviones: " + getNumAviones() + "\n"
                + "Num. marineros " + getuNmMarinos();
    }

    
}
