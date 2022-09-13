package ejercicio_veintisiete;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
 * programa que permita introducir un cuadrado por teclado y determine si este
 * cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */

import java.util.Scanner;

public class Ejercicio027 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int count;
        int countRows = 0;
        int countColumn = 0;
        int countDiag = 0;

        fillMatrix(matrix);
        showMatrix(matrix);

        for (int i = 0; i < 3; i++) {
            count = 0;

            for (int j = 0; j < 3; j++) {
                count += matrix[i][j];
                if (count == 15) countRows++;
            }
        }

        for (int i = 0; i < 3; i++) {
            count = 0;

            for (int j = 0; j < 3; j++) {
                count += matrix[j][i];
                if (count == 15) countColumn++;
            }
        }

        count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) count += matrix[i][j];
                if (count == 15) countDiag++;
            }
        }

        if (countDiag == 1 && countRows == 3 && countColumn == 3) {
            System.out.println("La matriz SI es un cuadrado magico");
        } else {
            System.out.println("La matriz NO es un cuadrado magico");
        }
    }

    public static void fillMatrix(int[][] matrix) {
        Scanner read = new Scanner(System.in);
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite un numero para la posicion " + i + " , " + j);
                num = read.nextInt();
                matrix[i][j] = num;
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
}
