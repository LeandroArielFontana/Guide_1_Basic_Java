/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE23;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Serie Fibonacci
        
    Scanner Read = new Scanner(System.in);
        
        int N = 0;
        
        int N1 = 0;
        
        int N2 = 1;
        
        int N3 = 1;

        System.out.println("Digite hasta que posicion desee que llegue fibonacci");
        
        N = Read.nextInt();
        
        System.out.print("0 1 ");
        
        for (int i = 0; i <= N; i++) {
            
           N3 = N1 + N2; 
            
            System.out.print(N3 + " ");
            
            N1 = N2;
                    
            N2 = N3;        
        }
        
        System.out.println("");
    }
    
}
