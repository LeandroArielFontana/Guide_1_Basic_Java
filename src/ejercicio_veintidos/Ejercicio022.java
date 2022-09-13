package ejercicio_veintidos;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
 * los muestre por pantalla en orden descendente.
 */

public class Ejercicio022 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        int k = 0;
        for (int i = 99; i >= 0; i--) {
            vector[k] = i;
            System.out.println(vector[k]);
            k++;
        }
    }
}
