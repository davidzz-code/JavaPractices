package ClaseVarios.Persona;

public class Persona {

    // Estructura conocida como "propiedades" o "atributos"
    private String nombre;
    private String apellidos;
    private int edad;
    private int altura;
    private float peso;

    /**
     *  SETTERS
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }



    /**
     *  GETTERS
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    /**
     *  TO STRING
     */
    @Override
    public String toString() {
        return "Persona [nombre: " + nombre + ", apellidos: " + apellidos + ", edad: " + edad + ", altura: " + altura
                + ", peso: " + peso + "]";
    }


    /**
     *  CONSTRUCTORES
     */

    // Constructor vacío
    public Persona() {
        this.nombre = "desconocido";
        this.apellidos = "desconocido";
        this.edad = 0;
    }

    // Constructor con algunos parámetros
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this(nombre, apellidos);
        this.edad = edad;

    }
    

    /**
     *  METHODS
     */
    
    void caminar() {
        System.out.println("Estoy caminando");
    }

    void hablar() {
        System.out.println("Estoy hablando");
    }

    void nacer() {
        System.out.println("...|-|Acabo de nacer|-|...");
    }

    void morir() {
        System.out.println("...|-|Acabo de morir|-|...");
    }

    void presentación() {
        System.out.println(
                "Mi nombre es " + this.nombre + " " +
                        this.apellidos + ", y tengo " +
                        this.edad + " años.");
    }
}
