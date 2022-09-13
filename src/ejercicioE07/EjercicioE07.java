/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE07;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//           Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//          promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//          los números serán introducidos por el usuario. Realice dos versiones del programa,
//          una usando el bucle “while” y otra con el bucle “do - while”.

    Scanner Read = new Scanner(System.in);    

    int Num = 0;
    
    double Average = 0.0;
    
    int Min = 999999999;
    
    int Max = 0;
    
    int Amount = 0;
    
    int Sum = 0;
    
    int Count = 0;
    
    int i = 0;
    
        System.out.println("Digite la cantidad de numeros que va a ingresar");
     
    Amount = Read.nextInt();

//    while(Count != Amount){
//        
//        System.out.println("Digite el " + (i + 1) + "° numero");
//            
//        Num = Read.nextInt();
//            
//        Sum += Num;
//            
//        Min = (Num < Min) ? Num : Min;
//            
//        Max = (Num > Max) ? Num : Max;
//        
//        Count++;
//        
//        i++;
//        
//    }

        do{
         
        System.out.println("Digite el " + (i + 1) + "° numero");
            
        Num = Read.nextInt();
            
        Sum += Num;
            
        Min = (Num < Min) ? Num : Min;
            
        Max = (Num > Max) ? Num : Max;
        
        Count++;
        
        i++;
          
        }while(Count != Amount);  
    
    
        Average = Sum / Amount;
        
        System.out.println("El numero maximo ingresado fue: " + Max);
        
        System.out.println("El numero minimo ingresado fue: " + Min);
        
        System.out.println("El promedio de los numeros ingresados fue de: " + Average);
        
    }
    
}
