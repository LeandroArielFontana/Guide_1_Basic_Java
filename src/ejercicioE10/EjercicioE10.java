/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE10;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE10 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//          Realice un programa para que el usuario adivine el resultado de una multiplicación
//          entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//          indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//          incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//          realizar este ejercicio investigue como utilizar la función Math.random() de Java.

    Scanner Read = new Scanner(System.in);
    
    int Num1 = 0;
    
    int Num2 = 0;
    
    int Result = 0;
  
    int Answer = 0;
    
    Num1 = (int)Math.floor(Math.random() * 10 );
    
    Num2 = (int)Math.floor(Math.random() * 10 );

    Result = Num1 * Num2;
    
    do{
       
        System.out.println("Digite el resultado de la multiplicacion");
        
        Answer = Read.nextInt();
        
        if (Answer == Result){
            
            System.out.println("Adivinaste!!");
            break;
            
        }else{
            
            System.out.println("NO ADIVINASTE! INTENTALO DE NUEVO");
            
        }
        
    }while(Answer != Result);
  }  
}
