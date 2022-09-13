package ejercicio_diez;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio10 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        /*  Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
            largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
            un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
            imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. */

        Scanner read = new Scanner(System.in);
        LOGGER.log(Level.INFO, () -> "Digite una palabra o frase de no mas 8 caracteres");

        if (read.next().length() == 8) {
            LOGGER.log(Level.INFO, () -> "CORRECTO");
        } else {
            LOGGER.log(Level.INFO, () -> "INCORRECTO");
        }
    }
}
