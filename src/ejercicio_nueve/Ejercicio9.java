package ejercicio_nueve;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma
 * de los dos. El programa deberá después mostrar el resultado de la suma
 */

public class Ejercicio9 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite una contraseña");

        if (read.nextLine().equals("eureka")) {
            LOGGER.log(Level.INFO, () -> "Correcto");
        } else {
            LOGGER.log(Level.INFO, () -> "Incorrecto");
        }
    }
}
