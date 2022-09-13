/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE02;

/**
 *
 * @author Roxana
 */
public class EjercicioE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//          Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//          cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
//          valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//          Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//          variable auxiliar.

    int A = 1;
    
    int B = 2;
    
    int C = 3;
    
    int D = 4;
    
    int Aux = 0;
    
        System.out.println("Valor inicial de A: " + A);
        
        System.out.println("Valor inicial de B: " + B);
        
        System.out.println("Valor inicial de C: " + C);
        
        System.out.println("Valor inicial de D: " + D);
        
        System.out.println("");
        
        Aux = B;
        
        B = C;
        
        C = A;
        
        A = D;
        
        D = Aux;
        
        System.out.println("Valor final de A: " + A);
        
        System.out.println("Valor final de B: " + B);
        
        System.out.println("Valor final de C: " + C);
        
        System.out.println("Valor final de D: " + D);
        

    }
    
}
