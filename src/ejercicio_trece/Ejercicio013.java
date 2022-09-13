package ejercicio_trece;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
 * la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

public class Ejercicio013 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int note;

        do {
            LOGGER.log(Level.INFO, () -> "Por favor digite una nota entre 0 y 10");
            note = read.nextInt();
        } while (note >= 10 || note <= 0);

        int finalNote = note;
        LOGGER.log(Level.INFO, () -> "Su nota es : " + finalNote);
    }
}
