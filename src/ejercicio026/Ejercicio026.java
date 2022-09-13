/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio026;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio026 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
//          Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
//          que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
//          cambiada de signo. Es decir, A es anti simétrica si A = -AT.
//          La matriz traspuesta de
//          una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
//          viceversa).
//          Ejemplo:

//            [ 0 ] [ -2 ] [ 4 ]                 [ 0 ] [ 2 ] [ -4 ]
//            
//            [ 2 ] [ 0 ] [ 2 ]                  [ -2 ] [ 0 ] [ -2 ]
//            
//            [ -4 ] [ -2 ] [ 0 ]                [ 4  ] [ 2 ] [  0 ]

//          En este caso la matriz es anti simétrica.

    Scanner Read = new Scanner (System.in);

    int Num = 0;

    int[][] Matrix = new int[3][3];
    
    int[][] MatrixTrans = new int [3][3];
    
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
            
                System.out.println("Digite un numero para la posicion " + i + " , " + j);
                
                Num = Read.nextInt();
                
                Matrix[i][j] = Num;
                
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                MatrixTrans[j][i] = Matrix[i][j];
                
            }
            
        }
        
        Show(Matrix);

        System.out.println(" ");

        Show(MatrixTrans);
        
        Verificate(Matrix, MatrixTrans);
        
    
    }
    
    public static void Show(int[][] Matrix){
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" [ " + Matrix[i][j] + " ] ");
                
            }
            
            System.out.println(" ");
            
        }

    }
    
    public static void Verificate(int[][] Matrix, int[][] MatrixTrans){
        
        int Count = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                if (Matrix[i][j] == (MatrixTrans[i][j] * -1 )){
                    
                    Count++;
                    
                }
                
            }
            
        }
        
        if (Count == 9){
            
            System.out.println("La matriz es anti simetrica");
            
        }else{
            
            System.out.println("La matriz no es anti simetrica");
            
        }
        
    }
}
