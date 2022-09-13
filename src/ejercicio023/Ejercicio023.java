/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio023;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio023 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        /*   Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
            pida al usuario un numero a buscar en el vector. El programa mostrará donde se
            encuentra el numero y si se encuentra repetido */
       
       Scanner Read = new Scanner (System.in);
       
       int Size = 0;
       
       System.out.println("Indique la cantidad de valores aleatorios que desea que tenga el vector");
       
       Size = Read.nextInt();
       
       int[] Array = new int[Size];
       
        System.out.println("Digite cual seria el valor maximo del numero random");
       
       int Max = 0;
       
       Max = Read.nextInt();
       
       for (int i = 0; i < Size; i++) {
           
           Array[i] = (int)Math.floor(Math.random()*Max);
         
        //   System.out.print(" " + Array[i] + " "); CORROBORAR LOS DATOS
        }
       
        //System.out.println(" "); CORROBORAR LOS DATOS
       
       int Search = 0;
       
       int Count = 0;
       
        System.out.println("Digite el numero que desea buscar en el vector ya antes creado");
       
        Search = Read.nextInt();
        
        for (int i = 0; i < Size; i++) {
            
            if (Array[i] == Search){
             
                System.out.println("El numero se encontro en la posicion " + i);
                
                Count = Count + 1;
                
            }
        }
        
        if (Count > 0){
            
            System.out.println("El numero " + Search + " se encontro" + Count + " vez / veces.");
            
        }else{
            
            System.out.println("El numero ingresado no se ha encontrado");
            
        }
        
    }    
}
