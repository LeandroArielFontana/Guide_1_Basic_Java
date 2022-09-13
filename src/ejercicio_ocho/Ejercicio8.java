package ejercicio_ocho;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio8 {
    private static final Logger LOGGER = Logger.getLogger("");
    private static final String CONST = "El numero es";

    public static void main(String[] args) {
        /* Crear un programa que dado un numero determine si es par o impar */

        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite el numero para ver si este es par o impar");

        if (read.nextInt() % 2 == 0) {
            LOGGER.log(Level.INFO, () -> CONST + "PAR");
        } else {
            LOGGER.log(Level.INFO, () -> CONST + "IMPAR");
        }
    }
}
