package ejercicio_veintiuno;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
 * libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
 * converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * * 0.86 libras es un 1 €
 * * 1.28611 $ es un 1 €
 * * 129.852 yenes es un 1 €
 */

public class Ejercicio021 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite el tipo de moneda con el cual desea cambiar los euros");
        String currency = read.nextLine();

        System.out.println("Digite la cantidad de Euros a pasar");
        changeCurrency(read.nextDouble(), currency);
    }

    public static void changeCurrency(Double money, String currency) {
        switch (currency) {
            case "dolares":
                System.out.println("La cantidad de dolares es de: " + (money * 1.28611));
                break;
            case "yenes":
                System.out.println("La cantidad de yenes es de: " + (money * 129.852));
                break;
            case "libras":
                System.out.println("La cantidad de libras es de: " + (money * 0.86));
                break;
        }
    }
}
