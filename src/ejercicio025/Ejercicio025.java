/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio025;

/**
 *
 * @author Leandro
 */
public class Ejercicio025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
//          muestre ordenada por sus columnas

int[][] Matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                Matrix[i][j] = (int)Math.floor(Math.random()*11);
                
            }
        }

        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(" [ " + Matrix[i][j] + " ] ");
                
            }
            
            System.out.println(" ");
            
        }
    }
}
