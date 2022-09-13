/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE11;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//          Escribir un programa que lea un número entero y devuelva el número de dígitos
//          que componen ese número. Por ejemplo, si introducimos el número 12345, el
//          programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//          utilizando el operador de división. Nota: recordar que las variables de tipo entero
//          truncan los números o resultados.

    Scanner Read = new Scanner(System.in);

    int Num = 0;
    
    int Count = 1;
    
        System.out.println("Digite un numero para la devolucion de la cantidad de digitos ( NOTA : NO SE TOMARAN EN CUENTA AQUELLOS NUMEROS CON COMA )");

    Num = Read.nextInt();
    
    if (Num > 9){
        
        do{
            
            Num = Num / 10;
            
            Count++;
            
        }while(Num > 9);
        
        System.out.println("El numero contiene " + Count + " digitos");
        
    }else{
        
        System.out.println("El numero contiene 1 digito");
        
    }
        
    }
    
}
