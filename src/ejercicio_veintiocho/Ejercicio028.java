package ejercicio_veintiocho;

import java.util.Scanner;

/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
 * P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
 * contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
 * submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
 * columnas, existe al menos una que coincida con la matriz P. En ese caso, el
 * programa debe indicar la fila y la columna de la matriz M en la cual empieza el
 * primer elemento de la submatriz P.
 */
public class Ejercicio028 {

    public static void main(String[] args) {
        int[][] bigMatrix = new int[10][10];
        int[][] littleMatrix = new int[3][3];

        autoFillBigMatrix(bigMatrix);
        showBigMatrix(bigMatrix);
        littleMatrixFillManually(littleMatrix);
        searchLittleMatrixInBigMatrix(bigMatrix, littleMatrix);
    }

    public static void autoFillBigMatrix(int[][] bigMatrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bigMatrix[i][j] = (int) Math.floor(Math.random() * 99);
            }
        }
    }

    public static void showBigMatrix(int[][] bigMatrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" [ " + bigMatrix[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

    public static void littleMatrixFillManually(int[][] littleMatrix) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite un numero para la posicion " + i + " , " + j);
                littleMatrix[i][j] = read.nextInt();
            }
        }
    }

    public static void searchLittleMatrixInBigMatrix(int[][] bigMatrix, int[][] littleMatrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (bigMatrix[i][j] == littleMatrix[0][0]) {
                    verificationOfMatrix(bigMatrix, littleMatrix, i, j);
                }
            }
        }
    }

    public static void verificationOfMatrix(int[][] bigMatrix, int[][] littleMatrix, int i, int j) {
        int k = 0;
        int l;
        int count = 0;

        if (i < 8 && j < 8) {
            for (int a = i; a <= (i + 2); a++) {
                l = 0;

                for (int b = j; b <= (j + 2); b++) {
                    if (bigMatrix[a][b] == littleMatrix[k][l]) {
                        count++;
//                    System.out.println("el contador: " + Count);
                    }
                    l++;
                }
                k++;
            }

            if (count == 9) {
                System.out.println("La Matriz de 3x3 se encuentra en la de 10x10, en la posicion " + i + " , " + j);
            } else {
                System.out.println("La Matriz de 3x3 no se encuentra en la de 10x10");
            }
        }
    }
}
