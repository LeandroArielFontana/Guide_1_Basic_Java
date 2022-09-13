package ejercicio_veintiseis;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
 * que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
 * cambiada de signo. Es decir, A es anti simétrica si A = -AT.
 * La matriz traspuesta de
 * una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
 * viceversa).
 * Ejemplo:
 * <p>
 * [ 0 ] [ -2 ] [ 4 ]                 [ 0 ] [ 2 ] [ -4 ]
 * [ 2 ]  [ 0 ]  [ 2 ]                  [ -2 ] [ 0 ] [ -2 ]
 * [ -4 ] [ -2 ] [ 0 ]                [ 4  ] [ 2 ] [  0 ]
 * <p>
 * En este caso la matriz es anti simétrica.
 */

import java.util.Scanner;

public class Ejercicio026 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int[][] matrix = new int[3][3];
        int[][] matrixTrans = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite un numero para la posicion " + i + " , " + j);
                number = read.nextInt();
                matrix[i][j] = number;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixTrans[j][i] = matrix[i][j];
            }
        }

        showMatrix(matrix);
        System.out.println(" ");
        showMatrix(matrixTrans);
        verificate(matrix, matrixTrans);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }

    public static void verificate(int[][] matrix, int[][] matrixTrans) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == (matrixTrans[i][j] * -1)) count++;
            }
        }

        if (count == 9) {
            System.out.println("La matriz es anti simetrica");
        } else {
            System.out.println("La matriz no es anti simetrica");
        }
    }
}
