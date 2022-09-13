package ejercicio_dos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        /*  Escribir un programa que pida dos números enteros por teclado y calcule la suma
            de los dos. El programa deberá después mostrar el resultado de la suma */

        Scanner read = new Scanner(System.in);

        LOGGER.log(Level.INFO, () -> "Ingrese dos numeros para hacer su sumatoria");
        int numberOne = read.nextInt();

        int add = numberOne + read.nextInt();
        LOGGER.log(Level.INFO, () -> "La suma de los numeros ingresados es " + add);
    }
}
