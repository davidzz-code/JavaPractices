public class Amarre {
    private int id = 0;
    private float tamaño;
    private boolean ocupado;
    private Barco barco;

    // Constructores
    public Amarre() {
    }

    public Amarre(float tamaño, boolean ocupado, Barco barco) {
        this.setId();
        this.tamaño = tamaño;
        this.ocupado = ocupado;
        this.barco = barco;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId() {
        int incremento = id++;
        this.id = incremento;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Amarre [id=" + id + ", tamaño=" + tamaño + ", ocupado=" + ocupado + ", barco=" + barco + "]";
    }
}
