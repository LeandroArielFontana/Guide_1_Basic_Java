package ejercicio_extra_diecinueve;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo
 * por parámetro. Después haremos otra función o procedimiento que imprima el
 * vector.
 */
public class EjercicioE19 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        autoFillVector(vector);
        showVector(vector);
    }

    public static void autoFillVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) Math.floor(Math.random() * 9);
        }
    }

    public static void showVector(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }

        System.out.println("");
    }
}
