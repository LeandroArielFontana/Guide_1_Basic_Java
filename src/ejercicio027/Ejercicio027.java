/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio027;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio027 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

//      Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//      donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//      programa que permita introducir un cuadrado por teclado y determine si este
//      cuadrado es mágico o no. El programa deberá comprobar que los números
//      introducidos son correctos, es decir, están entre el 1 y el 9.

    Scanner Read = new Scanner(System.in);
    
    int[][] Matrix = new int[3][3];
    
    int Count = 0;
    
    int CountRows = 0;
    
    int CountColumn = 0;
    
    int CountDiag = 0;
    
    Fill(Matrix);
    
    Show(Matrix);
    
        for (int i = 0; i < 3; i++) {
            
            Count = 0;
            
            for (int j = 0; j < 3; j++) {
             
                Count += Matrix[i][j]; 
                       
                if (Count == 15){
                    
                        CountRows++;
                        
                }        
            }
        }
        
        for (int i = 0; i < 3; i++) {
            
            Count = 0;
            
            for (int j = 0; j < 3; j++) {
             
                Count += Matrix[j][i]; 
                       
                if (Count == 15){
                    
                        CountColumn++;
                        
                }        
            }
        }
        
        Count = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
             
                if (i == j){
                    
                    Count += Matrix[i][j];
                    
                }
                
                if (Count == 15) {
                        
                    CountDiag++;
                        
                }
            }
        }
        
//        System.out.println("El valor de las columnas es: " + CountColumn);
//        
//        System.out.println("El valor de las filas es: " + CountRows);                 VERIFICACION DE CONTADORES!
//        
//        System.out.println("El valor de la diagonal es: " + CountDiag);
        
        if (CountDiag == 1 && CountRows == 3 && CountColumn == 3){
            
            System.out.println("La matriz SI es un cuadrado magico");
            
        }else{
            
            System.out.println("La matriz NO es un cuadrado magico");
            
        }
        
    }
    
    public static void Fill(int[][] Matrix){
        
        Scanner Read = new Scanner(System.in);
        
        int Num = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Digite un numero para la posicion " + i + " , " + j);

                Num = Read.nextInt();
                
                Matrix[i][j] = Num;
                
            }
            
        }
        
    }
    
    public static void Show(int[][] Matrix){
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" [ " + Matrix[i][j] + " ] ");
                
            }
            
            System.out.println(" ");
            
        }
        
    } 
    
}
