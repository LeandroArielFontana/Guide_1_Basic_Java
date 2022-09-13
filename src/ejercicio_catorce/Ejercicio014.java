package ejercicio_catorce;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio014 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        //  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        //  solicite números al usuario hasta que la suma de los números introducidos supere
        //  el límite inicial.

        Scanner read = new Scanner(System.in);
        int add = 0;

        LOGGER.log(Level.INFO, () -> "Digite un valor limite positivo");
        int limit = read.nextInt();

        do {
            LOGGER.log(Level.INFO, () -> "Digite un numero para sumarlo");
            add += read.nextInt();

            int finalAdd = add;
            LOGGER.log(Level.INFO, () -> "La suma es: " + finalAdd);
        } while (add <= limit);
    }
}
