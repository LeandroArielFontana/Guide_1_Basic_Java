/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE18;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE18 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
//      Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//      comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//      elementos).

    Scanner Read = new Scanner(System.in);

        System.out.println("Digite la dimension de los vectores");
    
    int Dim = 0;
            
    Dim = Read.nextInt();        
        
    int[] Vector1 = new int[Dim];
            
    int[] Vector2 = new int[Dim];
    
    int Num = 0;
    
    int Count = 0;
    
    int i = 0;
    
    int CountN = 0;
    
    do{
        
        System.out.println("Digite un numero para la ubicacion " + i + " del 1er vector");
            
            Num = Read.nextInt();
            
            Vector1[i] = Num;
            
            System.out.println("Digite un numero para la ubicacion " + i + " del 1er vector");
           
            Num = Read.nextInt();
            
            Vector2[i] = Num;
        
            if (Vector1[i] == Vector2[i]){
                
                Count++;
                
            }else{
                
                CountN++;
                
            }
            
            i++;
            
    }while(i < Dim && CountN < 1);
    
        
    if (Count + CountN == (Dim)){
            
        System.out.println("Ambos vectores son iguales");
            
    }else{
            
        System.out.println("Los vectores son diferentes");
            
    }
    
    
    }
    
}
