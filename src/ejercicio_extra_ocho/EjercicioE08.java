package ejercicio_extra_ocho;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
 * //debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
 * //números pares y la cantidad de números impares. Al igual que en el ejercicio
 * //anterior los números negativos no deben sumarse. Nota: recordar el uso de la
 * //sentencia break.
 */

import java.util.Scanner;

public class EjercicioE08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number;
        int count = 0;
        int odd = 0;
        int pair = 0;

        do {
            System.out.println("Digite un numero positivo");
            number = read.nextInt();

            if (number > 0) {
                count++;

                if (number % 2 == 0) {
                    pair++;
                } else {
                    odd++;
                }
            }
        } while (number % 5 != 0);

        System.out.println("Se ingresaron " + count + " numeros");
        System.out.println("En los numeros ingresados hay " + pair + " numeros pares");
        System.out.println("En los numeros ingresados hay " + odd + " numeros impares");
    }
}
