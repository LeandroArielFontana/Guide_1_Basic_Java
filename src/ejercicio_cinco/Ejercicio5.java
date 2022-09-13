package ejercicio_cinco;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio5 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Por favor digite los grados celsius para poder pasarlos a fahrenheit");
        int fahrenheit = 32 + (9 *  read.nextInt() / 5);

        LOGGER.log(Level.INFO, () -> "La cantidad de °C ingresada es equivalente a : " + fahrenheit + "°F");
    }
}
