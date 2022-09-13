package ejercicio_diecisiete;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
 * tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
 * con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
 * carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
 * secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
 * correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
 * se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */

public class Ejercicio017 {
    private static final Logger LOGGER = Logger.getLogger("");

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String code;
        int count = 0;

        do {
            LOGGER.log(Level.INFO, () -> "Digite un Codigo FDE");
            code = read.nextLine();
            LOGGER.log(Level.INFO, () -> "Verificando...");

            if ((code.length() == 5) && (code.substring(0, 1).equals("X")) && (code.substring(code.length() - 1, code.length()).equals("O"))) {
                count += 1;
                LOGGER.log(Level.INFO, () -> "El formato fue aceptado con exito");
            } else {
                LOGGER.log(Level.INFO, () -> "El formato no fue aceptado");
            }
        } while (!code.equals("&&&&&"));

        int finalCount = count;
        LOGGER.log(Level.INFO, () -> "Se realizaron una cantidad de: " + finalCount + " lecturas");
    }
}
