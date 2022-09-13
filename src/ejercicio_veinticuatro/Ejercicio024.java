package ejercicio_veinticuatro;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */

public class Ejercicio024 {
    private static final String HAY_UN_TOTAL_DE = "Hay un total de";

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int countNumberOneDigit = 0;
        int countNumberTwoDigits = 0;
        int countNumberThreeDigits = 0;
        int countNumberFourDigits = 0;
        int countNumberFiveDigits = 0;

        System.out.println("Digite el tamaño de el vector");
        int sizeOfArray = read.nextInt();

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Digite un numero para guardar en el vector");
            array[i] = read.nextInt();

            switch (String.valueOf(array[i]).length()) {
                case 1: countNumberOneDigit++; break;
                case 2: countNumberTwoDigits++; break;
                case 3: countNumberThreeDigits++; break;
                case 4: countNumberFourDigits++; break;
                case 5: countNumberFiveDigits++; break;
            }
        }

        System.out.println(HAY_UN_TOTAL_DE + countNumberOneDigit + " numero(s) de 1 digito");
        System.out.println(HAY_UN_TOTAL_DE + countNumberTwoDigits + " numero(s) de 2 digito");
        System.out.println(HAY_UN_TOTAL_DE + countNumberThreeDigits + " numero(s) de 3 digito");
        System.out.println(HAY_UN_TOTAL_DE + countNumberFourDigits + " numero(s) de 4 digito");
        System.out.println(HAY_UN_TOTAL_DE + countNumberFiveDigits + " numero(s) de 5 digito");
    }
}
