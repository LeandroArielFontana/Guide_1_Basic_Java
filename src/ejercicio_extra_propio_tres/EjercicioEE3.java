package ejercicio_extra_propio_tres;

import java.util.Scanner;

public class EjercicioEE3 {

    public static void main(String[] args) {
        ejercicioExtraThree();
    }

    public static void ejercicioExtraThree() {
        Scanner read = new Scanner(System.in);
        int result = 1;
        int longitude;

        System.out.println("Digite la cantidad de pruebas que desea realizar");

        for (int i = 0; i < read.nextInt(); i++) {
            System.out.println("Digite el numero al que desea realizar su factorial");

            for (int j = 1; j <= read.nextInt(); j++) {
                result = result * j;
            }

            longitude = String.valueOf(result).length();
            System.out.println(String.valueOf(result).charAt(longitude - 1));
            result = 1;
        }
    }
}
