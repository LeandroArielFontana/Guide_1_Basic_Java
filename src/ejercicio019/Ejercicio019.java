/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio019;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
            si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            
            * * * *
            *     *
            *     *
            * * * *        */
      
        Scanner Read = new Scanner (System.in).useDelimiter("\n");
        
        int Size = 0;
        
        String Char = "";
        
        System.out.println("Digite el tamaño del cuadrado a dibujar");
        
        Size = Read.nextInt();
        
        System.out.println("Digite el caracter que desea");
        
        Char = Read.nextLine();
        
        for (int i = 0; i <= Size - 1; i++) {
            
            for (int j = 0; j <= Size - 1; j++) {
                
                if (j == 0 || i == 0 || (j == Size - 1) || (i == Size - 1)){
                    
                    System.out.print(" " + Char +" ");
                    
                }else{
                    
                    System.out.print("   ");
                    
                }
                
            }
            
            System.out.println(" ");
            
        }
    }
    
}
