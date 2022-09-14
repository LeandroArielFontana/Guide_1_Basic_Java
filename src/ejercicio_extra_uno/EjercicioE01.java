package ejercicio_extra_uno;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
 * el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
 * horas.
 */

import java.util.Scanner;

public class EjercicioE01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int days = 0;
        int hours;

        System.out.println("Digite un tiempo en minutos para pasar a dias y horas");
        hours = read.nextInt() / 60;

        do {
            if (hours > 24) {
                hours -= 24;
                days++;
            }
        } while (hours > 24);

        System.out.println("El tiempo ingresado seria: " + days + " dias y " + hours + " horas");
    }
}
