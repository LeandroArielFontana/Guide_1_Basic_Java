package ejercicio_extra_propio_dos;

import java.util.Scanner;

public class EjercicioEE2 {

    public static void main(String[] args) {
        ejercicioExtraTwo();
    }

    public static void ejercicioExtraTwo() {
        Scanner read = new Scanner(System.in);
        int longitudeOfNumber = 0;
        int koprekarNumber = 0;

        String halfNumOne;
        String halfNumTwo;

        System.out.println("Digite un numero para ver si es un numero Koprekar");
        String number = read.nextLine();

        if (Integer.parseInt(number) >= 1 && Integer.parseInt(number) <= 65536) {
            koprekarNumber = (int) Math.pow(Integer.parseInt(number), 2);
            longitudeOfNumber = (Integer.toString(koprekarNumber)).length();

            System.out.println((String.valueOf(koprekarNumber)).substring(0, longitudeOfNumber / 2) + " + " + (String.valueOf(koprekarNumber)).substring(longitudeOfNumber / 2, longitudeOfNumber));

            halfNumOne = String.valueOf(koprekarNumber).substring(0, longitudeOfNumber / 2);
            halfNumTwo = String.valueOf(koprekarNumber).substring(longitudeOfNumber / 2, longitudeOfNumber);

            if ((Integer.parseInt(halfNumOne) + Integer.parseInt(halfNumTwo)) == Integer.parseInt(number)) {
                System.out.println("El numero es un numero Koprekar");
            } else {
                System.out.println("El numero no es numero Koprekar");
            }
        }
    }
}
