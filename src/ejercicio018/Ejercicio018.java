/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio018;

/**
 *
 * @author Lean Hackerman
 */

public class Ejercicio018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*   Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
            del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
            por una E. Ejemplo:
            0-0-0
            0-0-1
            0-0-2
            0-0-E
            0-0-4
            .
            .
            0-1-2
            0-1-E
            Nota: investigar función equals() y como convertir números a String.*/
       
        String Count1 = "";
        
        String Count2 = "";
        
        String Count3 = "";
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                for (int k = 0; k < 10; k++) {
                    
                    Count1 = (i == 3) ? "E" : Integer.toString(i);
                    Count2 = (j == 3) ? "E" : Integer.toString(j);
                    Count3 = (k == 3) ? "E" : Integer.toString(k);        
                    
                    System.out.println(Count1 + " - " + Count2 + " - " + Count3);
                    
                }
            }
            
        }
        
        
        
    }
    
}

