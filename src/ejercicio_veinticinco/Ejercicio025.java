package ejercicio_veinticinco;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
 * muestre ordenada por sus columnas
 */

public class Ejercicio025 {
    public static void main(String[] args) {
        int[][] Matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matrix[i][j] = (int) Math.floor(Math.random() * 11);
                System.out.print(" [ " + Matrix[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
}
