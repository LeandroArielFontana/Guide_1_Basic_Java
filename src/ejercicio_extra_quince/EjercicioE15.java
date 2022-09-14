package ejercicio_extra_quince;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o menores
 * de edad. Después de cada persona, el programa debe preguntarle al usuario si
 * quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
 * “No”.
 */

import java.util.Scanner;

public class EjercicioE15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        String name;
        int year;
        String option;
        int i = 0;

        do {
            System.out.println("Digite el nombre de la " + (i + 1) + "° persona");
            name = read.next();

            System.out.println("Digite la edad de la " + (i + 1) + "° persona");
            year = read.nextInt();

            if (year >= 18) {
                System.out.println("Nombre : " + name);
                System.out.println("Edad : " + year);
                System.out.println("Mayor de edad : Si ");
            } else {
                System.out.println("Nombre : " + name);
                System.out.println("Edad : " + year);
                System.out.println("Mayor de edad : No ");
            }

            System.out.println("Desea ingresar mas personas? ( Si / No )");
            option = read.next();
        } while (!option.equals("No"));
    }
}
