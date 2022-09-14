package ejercicio_extra_once;

/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 * utilizando el operador de división. Nota: recordar que las variables de tipo entero
 * truncan los números o resultados.
 */

import java.util.Scanner;

public class EjercicioE11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count = 1;

        System.out.println("Digite un numero para la devolucion de la cantidad de digitos ( NOTA : NO SE TOMARAN EN CUENTA AQUELLOS NUMEROS CON COMA )");
        int number = read.nextInt();

        if (number > 9) {
            do {
                number = number / 10;
                count++;
            } while (number > 9);

            System.out.println("El numero contiene " + count + " digitos");
        } else {
            System.out.println("El numero contiene 1 digito");
        }
    }
}
