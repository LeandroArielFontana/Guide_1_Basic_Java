package ejercicio_extra_diecisiete;

/**
 * Reealizar un algoritmo que calcule la suma de todos los elementos de un vector de
 * tamaño N, con los valores ingresados por el usuario.
 */

import java.util.Scanner;

public class EjercicioE17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector a llenar");
        int[] vector = new int[read.nextInt()];
        int add = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite un numero para la posicion " + i + " del vector ");
            vector[i] = read.nextInt();
            add += vector[i];
        }

        System.out.println("La sumatoria de todos los numeros del vector es de : " + add);
    }
}
