package Abstractas.Clase;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanTitle = new Scanner(System.in);
        String tituloUsuario = scanTitle.nextLine();

        MyBook new_novel = new MyBook();
        new_novel.setTitle(tituloUsuario);

        System.out.println("The title is: " + new_novel.getTitle());

    }
}
