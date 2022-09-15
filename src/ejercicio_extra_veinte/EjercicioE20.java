package ejercicio_extra_veinte;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro de
 * las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
 * cada nota son:
 * <p>
 * Primer trabajo práctico evaluativo 10%
 * <p>
 * Segundo trabajo práctico evaluativo 15%
 * <p>
 * Primer Integrador 25%
 * <p>
 * Segundo integrador 50%
 * <p>
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
 * del programa los profesores necesitan obtener por pantalla la cantidad de
 * aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
 * con promedio mayor o igual al 7 de sus notas del curso.
 */

import java.util.Scanner;

public class EjercicioE20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int noteOne;
        int noteTwo;
        int noteThree;
        double[] vector = new double[10];
        double average;

        int approved = 0;
        int disapproved = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite la nota del Primer trabajo práctico evaluativo del " + (i + 1) + "° alumno");
            noteOne = read.nextInt();

            System.out.println("Digite la nota del Segundo trabajo práctico evaluativo del " + (i + 1) + "° alumno");
            noteTwo = read.nextInt();

            System.out.println("Digite la nota del Primer Integrador del " + (i + 1) + "° alumno");
            noteThree = read.nextInt();

            System.out.println("Digite la nota del Segundo integrador del " + (i + 1) + "° alumno");
            average = ((noteOne * 0.10) + (noteTwo * 0.15) + (noteThree * 0.25) + (read.nextInt() * 0.50));
            vector[i] = average;

            if (average >= 7) {
                approved++;
            } else {
                disapproved++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }

        System.out.println("");
        System.out.println("Hubo una cantidad total de : " + approved + " alumnos aprobados");
        System.out.println("Hubo una cantidad total de : " + disapproved + " alumnos desaprobados");
    }
}
