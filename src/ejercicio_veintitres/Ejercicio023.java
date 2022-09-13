package ejercicio_veintitres;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
 * pida al usuario un numero a buscar en el vector. El programa mostrará donde se
 * encuentra el numero y si se encuentra repetido
 */

public class Ejercicio023 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Indique la cantidad de valores aleatorios que desea que tenga el vector");
        int size = read.nextInt();
        int[] array = new int[size];

        System.out.println("Digite cual seria el valor maximo del numero random");
        int maxNumber = read.nextInt();

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random() * maxNumber);
        }

        int count = 0;

        System.out.println("Digite el numero que desea buscar en el vector ya antes creado");
        int searchNumber = read.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == searchNumber) {
                System.out.println("El numero se encontro en la posicion " + i);
                count = count + 1;
            }
        }

        if (count > 0) {
            System.out.println("El numero " + searchNumber + " se encontro" + count + " vez / veces.");
        } else {
            System.out.println("El numero ingresado no se ha encontrado");
        }
    }
}
