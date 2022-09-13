/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE21;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//      Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
//      y muestre la suma de sus elementos.   
        
    Scanner Read = new Scanner(System.in);   
        
    int Rows = 0;
    
    int Columns = 0;
    
    int Addition = 0;
    
        System.out.println("Digite la cantidad de filas que desea que tenga la matriz ");
    
    Rows = Read.nextInt();
    
        System.out.println("Digite la cantidad de columnas que desea que tenga la matriz");
        
    Columns = Read.nextInt();

    int[][] Matrix = new int[Rows][Columns];
    
        for (int i = 0; i < Rows; i++) {
            
            for (int j = 0; j < Columns; j++) {
        
                Matrix[i][j] = (int)Math.floor(Math.random() * 9);
                
                Addition += Matrix[i][j];
                        
            }
            
        }
    
    for (int i = 0; i < Rows; i++) {
            
            for (int j = 0; j < Columns; j++) {
        
                System.out.print(" [ " +  Matrix[i][j] + " ] ");
                
            }
            
            System.out.println("");
            
    }
        
        System.out.println("La suma de todos los elementos de la matriz es de : " + Addition);    
    
    }
}
