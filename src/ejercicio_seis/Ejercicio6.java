package ejercicio_seis;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
 * el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt().
 */

public class Ejercicio6 {
    private static final Logger LOGGER = Logger.getLogger("");
    private static final String CONST = " es : ";

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        LOGGER.log(Level.INFO, () -> "Por favor digite un numero");
        int number = read.nextInt();

        LOGGER.log(Level.INFO, () -> "El numero digitado fue: " + number);
        int doubleOfTheNumber = number * 2;
        int tripleOfTheNumber = number * 3;
        double sqrt = Math.sqrt(number);

        LOGGER.log(Level.INFO, () -> "El doble de " + number + CONST + doubleOfTheNumber);
        LOGGER.log(Level.INFO, () -> "El triple de " + number + CONST + tripleOfTheNumber);
        LOGGER.log(Level.INFO, () -> "La raiz cuadrada de " + number + CONST + sqrt);
    }
}
