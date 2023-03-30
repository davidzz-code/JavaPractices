package NewDawnBank;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class NewDawnBank {
    public static void main(String[] args) {
        // Borra la terminal para que quede más legible
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Mensaje de bienvenida y de introducción de datos
        System.out.println("Bienvenido a 'New Dawn Bank'");
        System.out.println("Para acceder a tu cuenta escribe el nombre del titular y el IBAN de la cuenta");

        CuentaBancaria usuario;


        do {
            System.out.println();
            System.out.print("Titular: ");
            Scanner scanTitular = new Scanner(System.in);
            String titular = scanTitular.nextLine();
    
            System.out.print("IBAN: ");
            Scanner scanIban = new Scanner(System.in);
            String iban = scanIban.nextLine();

            usuario = new CuentaBancaria(titular, iban);
        } while (!usuario.isValida());


        // Borra la terminal para que quede más legible
        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean isActive = true; // Inicializamos la variable boolean a 'true'

        while (isActive) {
            // Borra la terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprime el menú de opciones
            System.out.println("Elige una opción del 1-8:");
            System.out.print("1) Mostrar datos de la cuenta\n"
                    + "2) Mostrar IBAN\n"
                    + "3) Mostrar titular\n"
                    + "4) Mostrar saldo \n"
                    + "5) Ingresar dinero\n"
                    + "6) Retirar dinero\n"
                    + "7) Mostrar movimientos\n"
                    + "8) Salir\n"
                    + "Elige una opción: ");

            Scanner scanOpcion = new Scanner(System.in);
            int opcion = scanOpcion.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    usuario.datosCuenta();
                    break;

                case 2:
                    usuario.mostrarIban();
                    break;

                case 3:
                    usuario.mostrarTitular();
                    break;

                case 4:
                    usuario.mostrarSaldo();
                    break;

                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    Scanner scanIngreso = new Scanner(System.in);
                    int ingreso = scanIngreso.nextInt();

                    usuario.ingresarDinero(ingreso);
                    break;

                case 6:
                    System.out.print("Cantidad a retirar: ");
                    Scanner scanRetirar = new Scanner(System.in);
                    int retirada = scanRetirar.nextInt();

                    usuario.retirarDinero(retirada);
                    break;

                case 7:
                    usuario.mostrarMovimientos();
                    break;

                case 8:
                    System.out.println("Gracias por usar tu banco de confianza");
                    isActive = false;
                    break;
                default:
                    System.out.println("Por favor elige una opción entre 1 y 8");
            }

            try { // Crea un control de excepciónes para configurar la espera de la terminal
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}