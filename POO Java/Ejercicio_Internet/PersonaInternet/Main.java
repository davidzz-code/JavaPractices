package Ejercicio_Internet.PersonaInternet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Dime tu nombre: ");
        Scanner scanNombre = new Scanner(System.in);
        String nombre = scanNombre.nextLine();

        System.out.print("Dime tu edad: ");
        Scanner scanEdad = new Scanner(System.in);
        int edad = scanEdad.nextInt();

        System.out.print("Dime tu sexo: ");
        Scanner scanSexo = new Scanner(System.in);
        String sexo = scanSexo.nextLine();

        System.out.print("Dime tu peso: ");
        Scanner scanPeso = new Scanner(System.in);
        double peso = scanPeso.nextDouble();

        System.out.print("Dime tu altura: ");
        Scanner scanAltura = new Scanner(System.in);
        double altura = scanAltura.nextDouble();

        Persona p1 = new Persona(nombre, edad, "43215543M", sexo, peso, altura);
        Persona p2 = new Persona("Eva", 18, "M");
        Persona p3 = new Persona();

        System.out.println();
        System.out.println(p1.toString());
        System.out.println(p1.esDeMayorEdad());
        if (p1.calcularIMC() == -1) {
            String IMC = "bajo de peso";
            System.out.println("Estás en: " + IMC);
        } else if (p1.calcularIMC() == 0) {
            String IMC = "peso ideal";
            System.out.println("Estás en: " + IMC);
        } else if (p1.calcularIMC() == 1) {
            String IMC = "sobrepeso";
            System.out.println("Estás en: " + IMC);
        }
        


        System.out.println();
        System.out.println(p2.toString());
        System.out.println();


        p3.setNombre("Antonio");
        p3.setEdad(50);
        p3.setPeso(70);
        p3.setAltura(1.68);
        System.out.println(p3.toString());
        System.out.println();


    }
    
}
