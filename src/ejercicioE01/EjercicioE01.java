/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE01;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE01 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
//          Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//          el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//          horas.
        
    Scanner Read = new Scanner(System.in);
        
    int Min = 0;
    
    int Days = 0;
    
    int Hours = 0;
    
    System.out.println("Digite un tiempo en minutos para pasar a dias y horas");
        
    Min = Read.nextInt();
        
    Hours = Min / 60;
   
    do{
        
        if (Hours > 24){
            
            Hours -= 24;
            
            Days++;
            
        }
        
        
    }while(Hours > 24);
        
        System.out.println("El tiempo ingresado seria: " + Days + " dias y " + Hours + " horas" );   
            
    
    
    }
    
}
