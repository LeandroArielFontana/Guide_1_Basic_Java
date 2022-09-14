package ejercicio_extra_doce;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la altura de
 * la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
 * <p>
 * 1
 * 12
 * 123
 */

import java.util.Scanner;

public class EjercicioE12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String number = "";

        System.out.println("Digite el tamaño de la escalera de numeros");
        int size = read.nextInt();

        for (int i = 1; i <= size; i++) {
            number += i;
            System.out.println(number);
        }
    }
}
