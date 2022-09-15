package ejercicio_extra_veintiuno;

/**
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
 * y muestre la suma de sus elementos.
 */

import java.util.Scanner;

public class EjercicioE21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int rows;
        int columns;
        int addition = 0;

        System.out.println("Digite la cantidad de filas que desea que tenga la matriz ");
        rows = read.nextInt();

        System.out.println("Digite la cantidad de columnas que desea que tenga la matriz");
        columns = read.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * 9);
                addition += matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }

            System.out.println("");
        }

        System.out.println("La suma de todos los elementos de la matriz es de : " + addition);
    }
}
