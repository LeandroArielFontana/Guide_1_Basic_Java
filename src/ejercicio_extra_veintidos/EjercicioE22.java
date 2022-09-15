package ejercicio_extra_veintidos;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
 * medida que el usuario las va ingresando, construya una “sopa de letras para niños”
 * de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
 * horizontal en una fila que será seleccionada de manera aleatoria. Una vez
 * concluida la ubicación de las palabras, rellene los espacios no utilizados con un
 * número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
 * creada.
 */

import java.util.Scanner;

public class EjercicioE22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String word;

        String[][] matrix = new String[20][20];

        int rows;
        int columns;
        int k;
        int l;

        char Letter = ' ';
        String Letter2 = "";

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = Integer.toString((int) Math.floor(Math.random() * 9));
            }
        }

        for (int a = 0; a < 5; a++) {
            k = 0;

            System.out.println("Digite una palabra de 3 a 5 caracteres para colocar en la sopa de letras");
            word = read.next().toUpperCase();

            if (word.length() >= 3 && word.length() <= 5) {
                rows = (int) Math.floor(Math.random() * 19);
                columns = (int) Math.floor(Math.random() * 15);

                for (int i = rows; i <= rows; i++) {
                    l = columns;

                    do {
                        matrix[i][l] = Character.toString(word.charAt(k));
                        k++;
                        l++;
                    } while (k < word.length());
                }
            } else {
                System.out.println("No se tomara en cuenta esta palabra ya que no tiene entre 3 y 5 caracteres");
            }
        }

        showMatrix(matrix);
    }

    public static void showMatrix(String[][] matrix) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }

            System.out.println(" ");
        }
    }
}
