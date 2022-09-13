package ejercicio_quince;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado
 * muestre por pantalla el siguiente menú:
 * <p>
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * <p>
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
 * pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
 * del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio015 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        LOGGER.log(Level.INFO, () -> "Digite el 1er Numero");
        int numberOne = read.nextInt();
        LOGGER.log(Level.INFO, () -> "Digite el 2do Numero");
        int numberTwo = read.nextInt();

        int option = 0;
        String exit = "N";

        do {
            LOGGER.log(Level.INFO, () -> "MENU");
            LOGGER.log(Level.INFO, () -> "1. Sumar");
            LOGGER.log(Level.INFO, () -> "2. Restar");
            LOGGER.log(Level.INFO, () -> "3. Multiplicar");
            LOGGER.log(Level.INFO, () -> "4. Dividir");
            LOGGER.log(Level.INFO, () -> "5. Salir");
            LOGGER.log(Level.INFO, () -> "Elija opcion:");
            option = read.nextInt();

            switch (option) {
                case 1: LOGGER.log(Level.INFO, () -> "La SUMA es: " + (numberOne + numberTwo)); continue;
                case 2: LOGGER.log(Level.INFO, () -> "La RESTA es: " + (numberOne - numberTwo)); continue;
                case 3: LOGGER.log(Level.INFO, () -> "La MULTIPLICACION es: " + (numberOne * numberTwo)); continue;
                case 4: LOGGER.log(Level.INFO, () -> "La DIVISION es: " + (numberOne / numberTwo)); continue;
                case 5:
                    do {
                        LOGGER.log(Level.INFO, () -> "¿Esta seguro que desea salir? ( S / N )");
                        exit = read.next();
                    } while (exit.equals("S") && exit.equals("N"));
                default:
                    LOGGER.log(Level.INFO, () -> "Por Favor indique una de las opciones validas");
            }
        } while (exit.equals("N"));
    }
}