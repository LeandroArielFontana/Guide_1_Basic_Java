package ejercicio_dieciseis;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio016 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        /*  Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
            salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
            deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
            número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/

        Scanner read = new Scanner(System.in);
        int add = 0;

        for (int i = 0; i < 20; i++) {
            LOGGER.log(Level.INFO, () -> "Digite un numero");
            int number = read.nextInt();

            if (number == 0) {
                LOGGER.log(Level.INFO, () -> "Se capturo el numero cero");
                int finalAdd = add;
                LOGGER.log(Level.INFO, () -> "La suma es: " + finalAdd);
                break;
            } else if (number >= 0) {
                add += number;
                int finalAdd1 = add;
                LOGGER.log(Level.INFO, () -> "La suma es: " + finalAdd1);
            } else {
                int finalAdd2 = add;
                LOGGER.log(Level.INFO, () -> "Como el numero es negativo, no entra en la sumatoria total. La suma es: " + finalAdd2);
            }
        }
    }
}
