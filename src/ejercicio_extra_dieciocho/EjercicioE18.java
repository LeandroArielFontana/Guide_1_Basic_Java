package ejercicio_extra_dieciocho;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */

import java.util.Scanner;

public class EjercicioE18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite la dimension de los vectores");
        int dimension = read.nextInt();

        int[] vectorOne = new int[dimension];
        int[] vectorTwo = new int[dimension];

        int count = 0;
        int i = 0;
        int countNumbers = 0;

        do {

            System.out.println("Digite un numero para la ubicacion " + i + " del 1er vector");
            vectorOne[i] = read.nextInt();

            System.out.println("Digite un numero para la ubicacion " + i + " del 2do vector");
            vectorTwo[i] = read.nextInt();

            if (vectorOne[i] == vectorTwo[i]) {
                count++;
            } else {
                countNumbers++;
            }

            i++;
        } while (i < dimension && countNumbers < 1);

        if (count + countNumbers == (dimension)) {
            System.out.println("Ambos vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}
