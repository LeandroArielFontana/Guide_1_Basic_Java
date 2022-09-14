package ejercicio_extra_catorce;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
 * sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
 * operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */

import java.util.Scanner;

public class EjercicioE14 {
    private static final String CONST = "El resultado de la ";

    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);

        System.out.println("Digite el 1er Numero");
        int numberOne = Read.nextInt();

        System.out.println("Digite el 2do Numero");
        int numberTwo = Read.nextInt();

        switch (menu()) {
            case 1: System.out.println(CONST + "suma es : " + addition(numberOne, numberTwo)); break;
            case 2: System.out.println(CONST + "resta es : " + subtract(numberOne, numberTwo)); break;
            case 3: System.out.println(CONST + "multiplicacion es : " + multiplication(numberOne, numberTwo)); break;
            case 4: System.out.println(CONST + "Division es : " + division(numberOne, numberTwo)); break;
        }
    }

    public static int menu() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite la operacion que desea realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opcion:");
        return read.nextInt();
    }

    public static int addition(int numberOne, int numberTwo) { return numberOne + numberTwo; }

    public static int subtract(int numberOne, int numberTwo) { return numberOne - numberTwo; }

    public static double division(int numberOne, int numberTwo) { return numberOne / numberTwo; }

    public static int multiplication(int numberOne, int numberTwo) { return numberOne * numberTwo; }
}
