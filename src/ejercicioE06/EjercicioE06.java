/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE06;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//          Leer la altura de N personas y determinar el promedio de estaturas que se
//          encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

    Scanner Read = new Scanner(System.in);

    int Amount = 0;
    
    double Height = 0.0;
    
    double Count = 0.0;
    
    double Result = 0.0;
    
        System.out.println("Digite la cantidad de personas que midio la altura");
        
        Amount = Read.nextInt();
        
        for (int i = 0; i < Amount; i++) {
            
            System.out.println("Digite la medida de la persona " + (i + 1));
            
            Height = Read.nextDouble();
            
            Count += Height;
            
        }
    
    Result = Count / Amount;
    
        System.out.println("El promedio de las medidas ingresadas es de: " + Result);
        
    }
    
}
