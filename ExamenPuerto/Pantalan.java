import java.util.ArrayList;

public class Pantalan {
    private int id = 0;
    private ArrayList<Amarre> listaAmarre;
    private String tipo;

    // Constructores
    public Pantalan() {
    }

    public Pantalan(ArrayList<Amarre> listaAmarre, String tipo) {
        setId();
        this.listaAmarre = listaAmarre;
        this.setTipo(tipo);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId() {
        int incremento = id++;
        this.id = incremento;
    }

    public ArrayList<Amarre> getListaAmarre() {
        return listaAmarre;
    }

    public void setListaAmarre(ArrayList<Amarre> listaAmarre) {
        this.listaAmarre = listaAmarre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == "Comercial") {
            this.tipo = tipo;
        } else if (tipo == "Recreo") {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo de barco incorrecto");
        }
    }

    @Override
    public String toString() {
        return "Pantalan [id=" + id + ", tipo=" + tipo;
    }
}
