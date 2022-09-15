package ejercicio_extra_veintitres_recursivo;

/**
 * Fibonacci Recursivo
 */

import java.util.Scanner;

public class EjercicioE23E {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite el numero de posicion en fibonacci");
        int number = read.nextInt();

        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int number) {
        if (number > 1) {
            return fibonacci(number - 1) + fibonacci(number - 2);
        } else if (number == 1) {
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
}    
