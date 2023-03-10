package Practica_1;
import java.util.*;

public class Metodos {
        // Imprime números en orden de inserción
    public static void leerNumeros() {
        // Crea una array y determina la longitud
        Scanner scan = new Scanner(System.in);
        int arrayNumeros[] = new int[5];
        System.out.println("Dime 5 números y los mostraré por pantalla:");

        // Pide números al usuario y los añade a la array
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º número: ");
            int numeroUsuario = scan.nextInt();
            arrayNumeros[i] = numeroUsuario;
        }
        System.out.println("Tu lista de números es: " + Arrays.toString(arrayNumeros));
    }
    

    // Imprime números en orden inverso
    public static void ordenInverso() {
        // Crea una array y determina la longitud
        // Crea una segunda array que almacenará los números invertidos
        Scanner scan = new Scanner(System.in);
        int arrayNumeros[] = new int[5];
        int[] reverse = new int[arrayNumeros.length];
        int count = 0;
        System.out.println("Dime 5 números y los mostraré por pantalla en orden inverso.");

        // Pide números al usuario y los añade a la array
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º número: ");
            int numeroUsuario = scan.nextInt();
            arrayNumeros[i] = numeroUsuario;
        }

        // Añade los números a la segunda array en orden inverso
        for (int i = 1; i <= arrayNumeros.length; i++) {
            reverse[count++] = arrayNumeros[arrayNumeros.length - i];
        }
        System.out.println("Tu lista de números en orden inverso es: " + Arrays.toString(reverse));
    }


    // Calcula la media de números positivos y negativos.
    // Imprime número de 'ceros' utilizados
    public static void hacerMedia() {
        // Crea una array y determina la longitud
        // Inicializa varias variables a 0 en las que se almacenarán los datos para hacer la media
        Scanner scan = new Scanner(System.in);
        int arrayNumeros[] = new int[5];
        int contCeros = 0;

        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int mediaPositivos = 0;

        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        int mediaNegativos = 0;

        System.out.println("Dime 5 números y haré la media de los números negativos, los positivos y te diré cuántos ceros has añadido.");

        // Pide números al usuario y los añade a la array
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print((i + 1) + "º número: ");
            int numeroUsuario = scan.nextInt();
            arrayNumeros[i] = numeroUsuario;

            // Valora si el número es positivo
            // Añade el número a la variable reservada para sumar números positivos y a la variable reservada para la cantidad de números
            if (numeroUsuario > 0) {
                sumaPositivos += numeroUsuario;
                cantidadPositivos += 1;
            
            // Valora si el número es negativo
            // Añade el número a la variable reservada para sumar números negativos y a la variable reservada para la cantidad de números
            } else if (numeroUsuario < 0) {
                sumaNegativos += numeroUsuario;
                cantidadNegativos += 1;
            }
            
            // Contador de 'ceros' introducidos por el usuario
            if (numeroUsuario == 0) {
                contCeros += 1;
            }
        }

        System.out.println("La lista de números completa es: " + Arrays.toString(arrayNumeros));
        System.out.println();

        // Condicional que valora si es posible hacer la media comprobando que el divisor sea distinto a 0
        if (cantidadPositivos == 0) {
            System.out.println("|..Error..| Imposible hacer la media de números (+)positivos(+), introduce más datos");
        } else {
            mediaPositivos = (sumaPositivos / cantidadPositivos);
            System.out.println("La media de los números (+)positivos(+) es: " + mediaPositivos);
        }

        if (cantidadNegativos == 0) {
            System.out.println("|..Error..| Imposible hacer la media de números (-)negativos(-), introduce más datos");
        } else {
            mediaNegativos = (sumaNegativos / cantidadNegativos);
            System.out.println("La media de los números (-)negativos(-) es: " + mediaNegativos);
        }

        System.out.println();
        System.out.println("Por último, el usuario a introducido " + contCeros + " ceros");
    }


    // Devuelve el número de carácteres del texto introducido por el usuario
    public static int contarLetras(String texto) {
        int longitud = texto.length();
        return longitud;
    }


    // Invierte el texto introducido por el usuario
    public static String textoInvertido(String texto) {
        int length = texto.length();
        String reverse = "";

        // Recorre el texto desde el final y añade cada carácter a la variable 'reverse'
        for (int i = length - 1; i >= 0; i--) {
            reverse += texto.charAt(i);
        }
        return reverse;
    }


    // Borra los espacios en blanco del texto introducido por el usuario
    public static String borrarEspacios(String texto) {

        // Reemplaza los espacios para juntar todas las palabras del texto
        String nuevoTexto = texto.replace(" ", "");
        return nuevoTexto;
    }


    // Concatena los dos textos introducidos por el usuario
    public static String unirTextos(String texto1, String texto2) {
        
        // Concatena los dos textos que llegan por parámetro al método
        String frasesUnidas = texto1 + texto2;
        return frasesUnidas;
    }
    

    // Intercambia las vocales de un texto introducido por el usuario por la vocal que elija
    public static void cambiarVocales(String texto, String vocalUsuario) {
        String vocales = "AEIOUaeiou";
        String fraseNueva = "";

        // Recorre la frase del usuario y compara cada carácter con la variable "Vocales" para decidir si cambiar la vocal o no.
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            if (vocales.indexOf(letra) != -1) {
                fraseNueva += vocalUsuario;
            } else {
                fraseNueva += letra;
            }
        }
        System.out.println("La frase con las vocales cambiadas es: '" + fraseNueva + "'");
    }

    
    // Devuelve el código ASCII de cada carácter del texto introducido por el usuario
    public static void códigoASCII(String texto) {
        int codigo;

        // Dos variables, una guarda los carácteres de la frase (letra). La otra guarda el número del código ASCII (codigo)
        // Recorre los carácteres de la frase del usuario y usa esa variable para sacar el código ASCII en cada iteración
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            codigo = (int) letra;
            System.out.println(letra + " = " + codigo);
        }   
    }
}
