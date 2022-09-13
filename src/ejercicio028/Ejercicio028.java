/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio028;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio028 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//          Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
//          P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
//          contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
//          submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
//          columnas, existe al menos una que coincida con la matriz P. En ese caso, el
//          programa debe indicar la fila y la columna de la matriz M en la cual empieza el
//          primer elemento de la submatriz P.
    
    Scanner Read = new Scanner (System.in);
    
    int[][] Matrix10_10 = new int[10][10];
    
    int[][] Matrix3_3 = new int[3][3];
   
    AutoFill(Matrix10_10);

    Show10_10(Matrix10_10); 
    
    ManualFill(Matrix3_3);

    Search(Matrix10_10, Matrix3_3);
        
       

    }
    
    public static void AutoFill(int[][] Matrix){
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                Matrix[i][j] = (int)Math.floor(Math.random()*99);
                
            }
            
        }
        
    }
    
    public static void Show10_10(int[][] Matrix){
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                System.out.print(" [ " + Matrix[i][j] + " ] ");
                
            }
            System.out.println("");
        }
        
    }
    
    public static void ManualFill(int[][] Matrix){
       
    Scanner Read = new Scanner (System.in);
        
    int Num = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Digite un numero para la posicion " + i + " , " + j);
                
                Num = Read.nextInt();
                
                Matrix[i][j] = Num;
                
            }
            
        }
        
    }
    
    public static void Search(int[][] Matrix10_10, int[][] Matrix3_3){
        
        int k = 0;
        
        int l = 0;
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                if (Matrix10_10[i][j] == Matrix3_3[0][0]){
                    
                    Verificate(Matrix10_10, Matrix3_3, i, j);
                    
                    k = 0;
                    
                    l = 0;
                }
                
            }
            
        }
        
    }
    
    public static void Verificate(int[][] Matrix10_10, int[][] Matrix3_3, int i, int j){
        
    int k = 0;
    
    int l = 0;
    
    int Count = 0; 
    
    if(i < 8 && j < 8){
    
        for (int a = i; a <= (i + 2); a++){
            
            l = 0;
            
            for (int b = j; b <= (j + 2); b++){

                if (Matrix10_10[a][b] == Matrix3_3[k][l]){
                    
                    Count++;
                    
//                    System.out.println("el contador: " + Count);
                    
                }
                
                l++;
                         
            }
            
            k++;
              
        }
        
        if (Count == 9) {
            
            System.out.println("La Matriz de 3x3 se encuentra en la de 10x10, en la posicion " + i + " , " + j);
 
        }else{
            
            System.out.println("La Matriz de 3x3 no se encuentra en la de 10x10");
            
        }
    }    
        
    }
}
