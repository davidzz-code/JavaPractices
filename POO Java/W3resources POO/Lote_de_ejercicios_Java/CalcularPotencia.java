package Lote_de_ejercicios_Java;
import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {
        Scanner scanBase = new Scanner(System.in);
        int base = scanBase.nextInt();

        Scanner scanPotencia = new Scanner(System.in);
        int potencia = scanPotencia.nextInt();

        System.out.println("El resultado de " + base + " elevado a "
                + potencia + " es: " + CalcularPotencia.metodoCalcualrPotencia(base, potencia));

    }

    public static double metodoCalcualrPotencia(int base, int potencia) {
        double resultado = Math.pow(base, potencia);
        return resultado;

    }
}
