package ejercicio_extra_dieciseis;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se lo
 * pasamos por parámetro para que nos indique si es o no un número primo, debe
 * devolver true si es primo, sino false.
 * Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
 * no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */

import java.util.Scanner;

public class EjercicoE16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int number;

        System.out.println("Digite un numero para ver si es primo o no");
        number = read.nextInt();

        if (verificate(number) == true) {
            System.out.println("El numero " + number + " es primo");
        } else {
            System.out.println("El numero " + number + " no es primo");
        }
    }

    public static boolean verificate(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) count++;
        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
