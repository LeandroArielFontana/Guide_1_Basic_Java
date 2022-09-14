package ejercicio_extra_cinco;

/**
 * Una obra social tiene tres clases de socios:
 * <p>
 * o   Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
 * descuento en todos los tipos de tratamientos.
 * <p>
 * o   Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
 * descuento para los mismos tratamientos que los socios del tipo A.
 * <p>
 * o    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
 * dichos tratamientos.
 * <p>
 * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
 * que represente el costo del tratamiento (previo al descuento) y determine el importe
 * en efectivo a pagar por dicho socio.
 */

import java.util.Scanner;

public class EjercicioE05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite que tipo de socio es la persona que realizo la compra");
        String letter = read.nextLine();

        System.out.println("Digite el monto a pagar");
        double amountPayable = read.nextDouble();

        switch (letter) {
            case "A":
                System.out.println("Como es un socio tipo A, el importe a pagar es de: $ " + (amountPayable - (amountPayable * 0.50)));
                break;
            case "B":
                System.out.println("Como es un socio tipo B, el importe a pagar es de: $ " + (amountPayable - (amountPayable * 0.35)));
                break;
            case "C":
                System.out.println("Como es un socio tipo C, el importe a pagar es de: $ " + amountPayable);
                break;
        }
    }
}
