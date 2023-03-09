package Ejercicio_Internet.PersonaInternet;

public class Persona {
    // Constantes
    private final static String sexoDefault = "No especificado";
    public static final int bajoPeso = -1;
    public static final int pesoIdeal = 0;
    public static final int sobrepeso = 1;


    // Atributos
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;

    
    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = sexoDefault;
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con 3 parámetros
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) { // Construtor completo
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    private void comprobarSexo() {
        if (sexo != "H" && sexo != "M") {
            this.sexo = sexoDefault;
        }
    }


    // Métodos públicos
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual < 20) {
            return bajoPeso;
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else {
            return sobrepeso;
        }
    }

    // MAYOR DE EDAD
    public boolean esDeMayorEdad() {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    // TO STRING
    public String toString() {
        if (this.sexo == "H") {
            sexo = "Hombre";
        }
        else if (this.sexo == "M") {
            sexo = "Mujer";
        }
        return "Información de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + " Edad: " + edad + " años\n"
                + " DNI: " + dni + "\n"
                + " Sexo: " + sexo + "\n"
                + " Peso: " + peso + " kg\n"
                + " Altura: " + altura + " m";
    }



    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}