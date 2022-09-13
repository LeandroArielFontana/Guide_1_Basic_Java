package ejercicio_siete;

import static java.lang.Math.max;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementar un programa que dado dos números enteros determine cuál es el
 * mayor y lo muestre por pantalla
 */

public class Ejercicio7 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite el 1er Numero para la comparacion de cual es mayor");
        int numberOne = read.nextInt();

        LOGGER.log(Level.INFO, () -> "Digite el 2do Numero para la comparacion de cual es mayor");
        LOGGER.log(Level.INFO, () -> "El numero mayor es: " + max(numberOne, read.nextInt()));
    }
}
