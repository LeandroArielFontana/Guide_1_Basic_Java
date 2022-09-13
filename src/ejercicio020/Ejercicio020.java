/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio020;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio020 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*  Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
            número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
            5 *****
            3 ***
            11 ***********
            2 **      */
        
        Scanner Read = new Scanner(System.in);
        
        int Num = 0;
        
        for (int i = 0; i <= 3; i++) {
        
            System.out.println("Digite la cantidad de arteriscos que desea poner");
            
            Num = Read.nextInt();
            
            System.out.print(Num + " : ");
            
            if (Num >= 1 && Num <= 20){
                
                for (int j = 0; j <= Num - 1; j++) {
                
                    System.out.print(" * ");
                
                }  
            }
        }
    }
}
