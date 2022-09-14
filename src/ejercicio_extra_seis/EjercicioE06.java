package ejercicio_extra_seis;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

import java.util.Scanner;

public class EjercicioE06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double count = 0.0;

        System.out.println("Digite la cantidad de personas que midio la altura");
        int amount = read.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.println("Digite la medida de la persona " + (i + 1));
            count += read.nextDouble();
        }

        System.out.println("El promedio de las medidas ingresadas es de: " + (count / amount));
    }
}
