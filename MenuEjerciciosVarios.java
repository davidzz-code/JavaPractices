// David Ramírez - Menú con ejercicios varios
import java.util.*;

public class MenuEjerciciosVarios {
    // Menú principal
    public static void main(String[] args) {
        // Borra la terminal para que quede más legible
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Elige una opción del 1-9:");
        System.out.println("1) Números en orden \n2) Números en orden inverso \n3) Hacer media de números \n4) Contar carácteres \n5) Invertir texto \n6) Borrar espacios \n7) Unir frases \n8) Cambiar vocales \n9) Encontrar código ASCII");
        System.out.print("Elijo la opción: ");

        // Crea input para guardar la opcion    
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        // Borra la terminal 
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        // Menú SWITCH con los diferentes casos para llamar a los distintos métodos
        switch (opcion) {
            case 1:
                leerNumeros();
                break;

            case 2:
                ordenInverso();
                break;

            case 3:
                hacerMedia();
                break;

            case 4:
                System.out.print("Escribe una frase y contaré los carácteres: ");

                // Crea input para guardar la frase
                Scanner scanLetras = new Scanner(System.in);
                String fraseUsuario = scanLetras.nextLine();

                // Guarda el retorno del método en una variable
                int caracteres = contarLetras(fraseUsuario);
                System.out.println("En esta frase hay " + caracteres + " carácteres.");
                break;
                
            case 5:
                System.out.print("Escribe una frase y le daré la vuelta: ");
                
                // Crea input para guardar la frase                
                Scanner scanReverse = new Scanner(System.in);
                String textoUsuario = scanReverse.nextLine();

                // Guarda el retorno del método en una variable
                String reverse = textoInvertido(textoUsuario);
                System.out.println("El texto '" + textoUsuario + "' invertido es: '" + reverse + "'");
                break;

            case 6:
                System.out.print("Escribe una frase y le quitaré los espacios en blanco: ");

                // Crea input para guardar la frase  
                Scanner scanSpace = new Scanner(System.in);
                String textoString = scanSpace.nextLine();

                // Guarda el retorno del método en una variable
                String nuevoTexto = borrarEspacios(textoString);
                System.out.println("El texto '" + textoString + "' sin espacios es: '" + nuevoTexto + "'");
                break;

            case 7:
                System.out.println("Escribe dos frases y las juntaré");

                // Crea inputs para guardar las dos frases
                System.out.print("Primera frase: ");
                Scanner scanFrase1 = new Scanner(System.in);
                String frase1 = scanFrase1.nextLine();

                System.out.print("Segunda frase: ");
                Scanner scanFrase2 = new Scanner(System.in);
                String frase2 = scanFrase2.nextLine();

                // Guarda el retorno del método en una variable
                String frasesUnidas = unirTextos(frase1, frase2);
                System.out.println("Las dos frases concatenadas son: '" + frasesUnidas + "'");
                break;
            case 8:
                System.out.println("Dime una frase y una vocal, cambiaré todas las vocales por la que me digas.");
                
                // Crea input para guardar la frase
                System.out.print("Escribe una frase: ");
                Scanner scanFraseUser = new Scanner(System.in);
                String fraseUser = scanFraseUser.nextLine();

                // Crea input para guardar la vocal
                System.out.print("Escribe una vocal: ");
                Scanner scanVocal = new Scanner(System.in);
                String vocalUser = scanVocal.nextLine();

                cambiarVocales(fraseUser, vocalUser);
                break;

            case 9:
                // Crea inputs para guardar la frase
                System.out.print("Dime una frase y te diré el código ASCII de cada carácter: ");
                Scanner scanASCII = new Scanner(System.in);
                String fraseASCII = scanASCII.nextLine();
                
                códigoASCII(fraseASCII);
                break;
        }
    }

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


