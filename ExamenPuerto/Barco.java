import java.util.ArrayList;

public abstract class Barco {
    private String matricula;
    private String nombre;
    private float tamaño;

    // Constructores
    public Barco() {
    }
    
    public Barco(String matricula, String nombre, float tamaño) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }


    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Barco [matricula=" + matricula + ", nombre=" + nombre + ", tamaño=" + tamaño + "]";
    }

    public abstract boolean encajaTipo(Pantalan pantalan);
    
    public abstract float encajaTamaño(Amarre amarre);

    public static String mayorTamaño(ArrayList<Barco> barcosEntrantes) {
        Barco barcoMayor = null;

        for (Barco barcoActual : barcosEntrantes) {

            if (barcoMayor == null || barcoActual.getTamaño() > barcoMayor.getTamaño()) {
                barcoMayor = barcoActual;
            }
        }
        return barcoMayor.getMatricula();
    }

    public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes) {
        Comercial barcoComercial = new Comercial("1234", "Poseidón", 80, "Carga textil");
        Recreo barcoRecreo = new Recreo("2345", "Tritón", 6, "Permiso recreativo");

        barcosEntrantes.add(barcoComercial);
        barcosEntrantes.add(barcoRecreo);
    }
    
}