package ejercicio_doce;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Considera que estás desarrollando una web para una empresa que fabrica motores
 * (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
 * Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
 * El programa debe mostrar lo siguiente:
 * o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
 * o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
 * o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
 * o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
 * o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
 */

public class Ejercicio012 {
    private static final Logger LOGGER = Logger.getLogger("");
    private static final String CONST = "La bomba es una bomba de ";

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite el tipo de motor (Del 1 al 4)");

        switch (read.nextInt()) {
            case 1: LOGGER.log(Level.INFO, () -> CONST + " agua"); break;
            case 2: LOGGER.log(Level.INFO, () -> CONST + " gasolina"); break;
            case 3: LOGGER.log(Level.INFO, () -> CONST + " hormigón"); break;
            case 4: LOGGER.log(Level.INFO, () -> CONST + " alimenticia"); break;
            default: LOGGER.log(Level.INFO, () -> "No existe un valor válido para tipo de bomba"); break;
        }
    }
}
