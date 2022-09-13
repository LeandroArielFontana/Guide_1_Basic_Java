package ejercicio_once;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
 * frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

public class Ejercicio011 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite por favor una palabra");

        if (read.nextLine().substring(0, 1).equals("A")) {
            LOGGER.log(Level.INFO, () -> "CORRECTO");
        } else {
            LOGGER.log(Level.INFO, () -> "INCORRECTO");
        }
    }
}
