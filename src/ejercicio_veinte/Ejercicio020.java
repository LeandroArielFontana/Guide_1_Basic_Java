package ejercicio_veinte;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */

public class Ejercicio020 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite la cantidad de arteriscos que desea poner");
            int number = read.nextInt();

            System.out.print(number + " : ");

            if (number >= 1 && number <= 20) {
                for (int j = 0; j <= number - 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
    }
}
