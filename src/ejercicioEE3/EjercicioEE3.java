/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioEE3;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioEE3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        EjercicioExtra3();        
        
    }
    
    public static void EjercicioExtra3(){

    Scanner Read = new Scanner(System.in);
        
    int Num = 0;
    
    int N = 0;
    
    int Result = 1;
    
    int Long = 0;
    
        System.out.println("Digite la cantidad de pruebas que desea realizar");
    
    N = Read.nextInt();
    
        for (int i = 0; i < N; i++) {
            
            System.out.println("Digite el numero al que desea realizar su factorial");
            
            Num = Read.nextInt();
            
            for (int j = 1; j <= Num; j++) {
                
                Result = Result * j;
                
            }
            
            Long = String.valueOf(Result).length();
            
            System.out.println(String.valueOf(Result).substring(Long - 1, Long));
            
            Result = 1;
        }
        
    }
    
}
