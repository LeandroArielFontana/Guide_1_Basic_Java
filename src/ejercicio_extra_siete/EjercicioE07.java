package ejercicio_extra_siete;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
 * promedio de n números (n>0). El valor de n se solicitará al principio del programa y
 * los números serán introducidos por el usuario. Realice dos versiones del programa,
 * una usando el bucle “while” y otra con el bucle “do - while”.
 */

import java.util.Scanner;

public class EjercicioE07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number;
        int minNumber = 999999999;
        int maxNumber = 0;
        int sum = 0;
        int count = 0;
        int i = 0;

        System.out.println("Digite la cantidad de numeros que va a ingresar");
        int amount = read.nextInt();

        do {
            System.out.println("Digite el " + (i + 1) + "° numero");
            number = read.nextInt();
            sum += number;
            minNumber = (number < minNumber) ? number : minNumber;
            maxNumber = (number > maxNumber) ? number : maxNumber;
            count++;
            i++;
        } while (count != amount);

        System.out.println("El numero maximo ingresado fue: " + maxNumber);
        System.out.println("El numero minimo ingresado fue: " + minNumber);
        System.out.println("El promedio de los numeros ingresados fue de: " + (sum / amount));
    }
}
