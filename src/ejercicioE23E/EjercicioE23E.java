/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE23E;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE23E {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       
    Scanner Read = new Scanner(System.in);
        
        int n = 0;

        System.out.println("Digite el numero de posicion en fibonacci");
        
    n = Read.nextInt();

    
        System.out.println(Fibonacci(n));  
    }
    
    public static int Fibonacci(int n){
        
     if ( n > 1){
       
         return Fibonacci(n-1) + Fibonacci(n-2);  
    
     }else if ( n == 1 ){   
        
//       System.out.println(1);  
         
       return 1;  
    
    }else if ( n == 0 ){ 
        
//         System.out.println(0);
        
        return 0;
    
    }else{ 
      
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        
        return -1;   
    }
    
   }
}    
