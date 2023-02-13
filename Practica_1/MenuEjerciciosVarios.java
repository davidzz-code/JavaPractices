// David Ramírez - Menú con ejercicios varios
package Practica_1;
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
                Metodos.leerNumeros();
                break;

            case 2:
                Metodos.ordenInverso();
                break;

            case 3:
                Metodos.hacerMedia();
                break;

            case 4:
                System.out.print("Escribe una frase y contaré los carácteres: ");

                // Crea input para guardar la frase
                Scanner scanLetras = new Scanner(System.in);
                String fraseUsuario = scanLetras.nextLine();

                // Guarda el retorno del método en una variable
                int caracteres = Metodos.contarLetras(fraseUsuario);
                System.out.println("En esta frase hay " + caracteres + " carácteres.");
                break;
                
            case 5:
                System.out.print("Escribe una frase y le daré la vuelta: ");
                
                // Crea input para guardar la frase                
                Scanner scanReverse = new Scanner(System.in);
                String textoUsuario = scanReverse.nextLine();

                // Guarda el retorno del método en una variable
                String reverse = Metodos.textoInvertido(textoUsuario);
                System.out.println("El texto '" + textoUsuario + "' invertido es: '" + reverse + "'");
                break;

            case 6:
                System.out.print("Escribe una frase y le quitaré los espacios en blanco: ");

                // Crea input para guardar la frase  
                Scanner scanSpace = new Scanner(System.in);
                String textoString = scanSpace.nextLine();

                // Guarda el retorno del método en una variable
                String nuevoTexto = Metodos.borrarEspacios(textoString);
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
                String frasesUnidas = Metodos.unirTextos(frase1, frase2);
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

                Metodos.cambiarVocales(fraseUser, vocalUser);
                break;

            case 9:
                // Crea inputs para guardar la frase
                System.out.print("Dime una frase y te diré el código ASCII de cada carácter: ");
                Scanner scanASCII = new Scanner(System.in);
                String fraseASCII = scanASCII.nextLine();
                
                Metodos.códigoASCII(fraseASCII);
                break;
        }
    }
}