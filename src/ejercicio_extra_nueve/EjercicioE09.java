package ejercicio_extra_nueve;

/**
 * Simular la división usando solamente restas. Dados dos números enteros mayores
 * que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
 * restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
 * que el divisor, este resultado es el residuo, y el número de restas realizadas es el
 * cociente. Por ejemplo: 50 / 13:
 * <p>
 * 50 – 13 = 37 una resta realizada
 * 37 – 13 = 24 dos restas realizadas
 * 24 – 13 = 11 tres restas realizadas
 * <p>
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */

import java.util.Scanner;

public class EjercicioE09 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count = 0;

        System.out.println("Digite el dividendo por favor");
        int dividend = read.nextInt();

        System.out.println("Digite el divisor por favor");
        int divider = read.nextInt();

        if (dividend > divider) {
            do {
                count++;
                dividend -= divider;
            } while (dividend >= divider);
        }

        System.out.println("El resto es de: " + dividend);
        System.out.println("El cociente es de: " + count);
    }
}
