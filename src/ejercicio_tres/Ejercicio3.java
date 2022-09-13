package ejercicio_tres;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio3 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        /*  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
            por pantalla.*/

        LOGGER.log(Level.INFO, () -> "Ingrese su nombre por favor");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        LOGGER.log(Level.INFO, () -> "Hola " + name);
    }
}
