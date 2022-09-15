package ejercicio_extra_propio_uno;

public class EjercicioEE1 {
    private static final String COSTO_MINIMO_MAQUINA = "El costo maximo de la maquina nro ";
    private static final String ES_DE = "es de: ";

    public static void main(String[] args) {
        ejercicioExtraOne();
    }

    public static void ejercicioExtraOne() {
        String[][] matrix = new String[7][6];
        fillMatrix(matrix);
        showMatrix(matrix);
        verificateMatrix(matrix);
    }

    public static void fillMatrix(String[][] matrix) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = " ";
                } else if (j == 0) {
                    matrix[i][j] = Integer.toString(i);
                } else if (i == 0) {
                    switch (j) {
                        case 1 -> matrix[i][j] = "A";
                        case 2 -> matrix[i][j] = "B";
                        case 3 -> matrix[i][j] = "C";
                        case 4 -> matrix[i][j] = "D";
                        case 5 -> matrix[i][j] = "E";
                        default -> System.out.print("");
                    }
                } else {
                    switch (j) {
                        case 1, 2, 3, 4, 5 -> matrix[i][j] = Integer.toString((int) Math.floor(Math.random() * 99));
                        default -> System.out.print("");
                    }
                }
            }
        }
    }

    public static void showMatrix(String[][] matrix) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("   " + matrix[i][j] + "    ");
                } else {
                    System.out.print("   " + matrix[i][j] + "   ");
                }
            }

            System.out.println("");
        }
    }

    public static void verificateMatrix(String[][] matrix) {
        int max = 0;
        int min = 999999999;
        int columnMin = 0;
        int columnMax = 0;
        int rowMin = 0;
        int rowMax = 0;

        System.out.println("¡¡ MAQUINAS !!");

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 6; j++) {
                if (Integer.parseInt(matrix[i][j]) < min) {
                    min = Integer.parseInt(matrix[i][j]);
                    columnMin = j;
                }

                if (Integer.parseInt(matrix[i][j]) > max) {
                    max = Integer.parseInt(matrix[i][j]);
                    columnMax = j;
                }
            }

            min = 999999999;
            max = 0;

            switch (columnMax) {
                case 1, 2, 3, 4, 5 ->
                        System.out.println(COSTO_MINIMO_MAQUINA + i + ES_DE + Integer.valueOf(matrix[i][columnMax]));
                default -> System.out.print("");
            }
            switch (columnMin) {
                case 1, 2, 3, 4, 5 ->
                        System.out.println(COSTO_MINIMO_MAQUINA + i + ES_DE + Integer.valueOf(matrix[i][columnMin]));
                default -> System.out.print("");
            }
        }

        System.out.println("¡¡ FASES !!");

        for (int j = 1; j < 6; j++) {
            for (int i = 1; i < 7; i++) {
                if (Integer.parseInt(matrix[i][j]) < min) {
                    min = Integer.parseInt(matrix[i][j]);
                    rowMin = i;
                }

                if (Integer.parseInt(matrix[i][j]) > max) {
                    max = Integer.parseInt(matrix[i][j]);
                    rowMax = i;
                }
            }

            min = 999999999;
            max = 0;

            switch (j) {
                case 1, 2, 3, 4, 5 ->
                        System.out.println("El costo maximo de la Fase A es de: " + Integer.valueOf(matrix[rowMax][j]));
                default -> System.out.print("");
            }

            switch (rowMin) {
                case 1, 2, 3, 4, 5 ->
                        System.out.println("El costo minimo de la Fase A es de: " + Integer.valueOf(matrix[rowMin][j]));
                default -> System.out.print("");
            }
        }
    }
}

