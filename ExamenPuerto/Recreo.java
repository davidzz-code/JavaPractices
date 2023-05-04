public class Recreo extends Barco {
    private String permiso;

    // Constructores
    public Recreo() {
    }

    public Recreo(String matricula, String nombre, float tamaño, String permiso) {
        super(matricula, nombre, tamaño);
        this.permiso = permiso;
    }

    // Getters y Setters
    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "Recreo [permiso=" + permiso + "]";
    }


    // Métodos abstractos de la clase padre
    public boolean encajaTipo(Pantalan pantalan) {
        if (pantalan.getTipo().equals("Recreo")) {
            return true;
        }
        return false;
    }

    public float encajaTamaño(Amarre amarre) {
        float diferencia = amarre.getTamaño() - this.getTamaño();
        return diferencia;
    }

    
    
}
