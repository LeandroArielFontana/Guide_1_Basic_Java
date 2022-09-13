package ejercicio_diecinueve;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
 * si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 *      * * * *
 *      *     *
 *      *     *
 *      * * * *
 */

import java.util.Scanner;

public class Ejercicio019 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Digite el caracter que desea");
        String character = read.nextLine();

        System.out.println("Digite el tamaño del cuadrado a dibujar");
        int size = read.nextInt();

        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                if (j == 0 || i == 0 || (j == size - 1) || (i == size - 1)) {
                    System.out.print(" " + character + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
