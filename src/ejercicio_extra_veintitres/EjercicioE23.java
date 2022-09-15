package ejercicio_extra_veintitres;

/**
 * Serie Fibonacci
 */

import java.util.Scanner;

public class EjercicioE23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numberOne = 0;
        int numberTwo = 1;
        int numberThree;

        System.out.println("Digite hasta que posicion desee que llegue fibonacci");
        System.out.print("0 1 ");

        for (int i = 0; i <= read.nextInt(); i++) {
            numberThree = numberOne + numberTwo;
            System.out.print(numberThree + " ");
            numberOne = numberTwo;
            numberTwo = numberThree;
        }

        System.out.println("");
    }
}
