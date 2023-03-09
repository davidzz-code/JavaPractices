package Logica_Java.w3resources;

// Write a Java program to form the largest number from a given list of non negative integers
public class Arrays_71 {
    public static void main(String[] args) {
        // int arr[] = new int[6];

        int arr[] = { 5, 45, 2, 7, 1 };
        int mayor = 0;
        int posicion;

        int numMax[];

        for (int i = 0; i < arr.length; i++) {
            for (int j : arr) {
                if (j > mayor) {
                    mayor = j;
                    posicion = arr[i];
                }
            }
        }
    }
}
