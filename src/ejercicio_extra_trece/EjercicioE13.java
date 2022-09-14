package ejercicio_extra_trece;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
 * cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
 * todas las familias.
 */

import java.util.Scanner;

public class EjercicioE13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int count = 0;
        int children;
        int yearsAdd = 0;

        System.out.println("Digite por favor la cantidad de familias");
        int families = read.nextInt();

        for (int i = 0; i < families; i++) {
            System.out.println("Digite la cantidad de hijos que contiene la familia");
            children = read.nextInt();
            count += children;

            for (int j = 0; j < children; j++) {
                System.out.println("Digite la edad del " + (j + 1) + "° chico");
                yearsAdd += read.nextInt();
            }
        }

        System.out.println("El promedio de edad de la(s) " + families + " familia(s) es de: " + (yearsAdd / count));
    }
}
