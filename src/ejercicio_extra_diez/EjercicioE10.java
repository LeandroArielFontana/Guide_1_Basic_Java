package ejercicio_extra_diez;

/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación
 * entre dos números generados aleatoriamente entre 0 y 10. El programa debe
 * indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
 * incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
 * realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */

import java.util.Scanner;

public class EjercicioE10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int answer;

        int numberOne = (int) Math.floor(Math.random() * 10);
        int numberTwo = (int) Math.floor(Math.random() * 10);

        int result = numberOne * numberTwo;

        do {
            System.out.println("Digite el resultado de la multiplicacion");
            answer = read.nextInt();

            if (answer == result) {
                System.out.println("Adivinaste!!");
                break;
            } else {
                System.out.println("NO ADIVINASTE! INTENTALO DE NUEVO");
            }
        } while (answer != result);
    }
}
