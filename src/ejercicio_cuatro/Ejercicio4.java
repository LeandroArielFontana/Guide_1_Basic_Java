package ejercicio_cuatro;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 */

public class Ejercicio4 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        LOGGER.log(Level.INFO, () -> "Por favor digite una frase para ser pasada a minusculas y luego a mayusculas");
        String word = read.nextLine();

        LOGGER.log(Level.INFO, () -> "lower case -> " + word.toLowerCase());
        LOGGER.log(Level.INFO, () -> "upper case -> " + word.toUpperCase());
    }
}
