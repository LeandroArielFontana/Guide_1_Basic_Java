package ejercicio_dieciocho;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
 * por una E. Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * .
 * .
 * 0-1-2
 * 0-1-E
 * Nota: investigar función equals() y como convertir números a String.
 */

public class Ejercicio018 {

    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        String count1;
        String count2;
        String count3;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    count1 = (i == 3) ? "E" : Integer.toString(i);
                    count2 = (j == 3) ? "E" : Integer.toString(j);
                    count3 = (k == 3) ? "E" : Integer.toString(k);

                    String finalCount = count1;
                    String finalCount1 = count2;
                    String finalCount2 = count3;

                    LOGGER.log(Level.INFO, () -> finalCount + " - " + finalCount1 + " - " + finalCount2);
                }
            }
        }
    }
}

