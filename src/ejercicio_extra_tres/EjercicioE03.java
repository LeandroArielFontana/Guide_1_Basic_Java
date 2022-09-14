package ejercicio_extra_tres;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
 * vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
 * clase String.
 */

import java.util.Scanner;

public class EjercicioE03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite una vocal");
        String letter = read.nextLine();

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
