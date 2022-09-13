/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE19;

/**
 *
 * @author Leandro
 */
public class EjercicioE19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//      Crear una función rellene un vector con números aleatorios, pasándole un arreglo
//      por parámetro. Después haremos otra función o procedimiento que imprima el
//      vector.

    int[] Vector = new int[5];
    
    AutoFill(Vector);

    Show(Vector);
    
    }
    
    public static void AutoFill (int[] Vector){
        
        for (int i = 0; i < 5; i++) {
            
            Vector[i] = (int)Math.floor(Math.random() * 9);            
            
        }
        
    }
    
    public static void Show (int[] Vector){
      
        for (int i = 0; i < 5; i++) {
            
            System.out.print(" [ " + Vector[i] + " ] ");            
            
        }
        
        System.out.println("");
        
    }
}
