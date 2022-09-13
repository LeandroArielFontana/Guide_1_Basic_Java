/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio024;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class Ejercicio024 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//          Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//          cuántos de 2 dígitos, etcétera (hasta 5 dígitos)

    Scanner Read = new Scanner (System.in);
    
    int Num = 0;
    
    int Size = 0;
    
    int Count1 = 0;
    
    int Count2 = 0;
    
    int Count3 = 0;
    
    int Count4 = 0;
    
    int Count5 = 0;
    
    int Long = 0;
    
    String Aux = "";
    
    System.out.println("Digite el tamaño de el vector");
        
    Size = Read.nextInt();
    
    int[] Array = new int[Size];
    
        for (int i = 0; i < Size; i++) {
            
            System.out.println("Digite un numero para guardar en el vector");
            
            Num = Read.nextInt();
            
            Array[i] = Num;
            
            Aux = String.valueOf(Num);
            
            Long = Aux.length();
            
            switch (Long){
                
                case 1:
                    
                    Count1++;
                    
                    break;
                    
                case 2:
                    
                    Count2++;
                    
                    break;
                    
                case 3:
                    
                    Count3++;
                    
                    break;
                    
                case 4:
                    
                    Count4++;
                    
                    break;
                    
                case 5:
                    
                    Count5++;
                    
                    break;
                    
            }
        }
//        
//        for (int i = 0; i < Size; i++) {
//            
//            System.out.print(" " + Array[i] + " "); 
//            
//        }
//
//        System.out.println(" ");
        
        System.out.println("Hay un total de " + Count1 + " numero(s) de 1 digito");
        
        System.out.println("Hay un total de " + Count2 + " numero(s) de 2 digito");
        
        System.out.println("Hay un total de " + Count3 + " numero(s) de 3 digito");
        
        System.out.println("Hay un total de " + Count4 + " numero(s) de 4 digito");
        
        System.out.println("Hay un total de " + Count5 + " numero(s) de 5 digito");   
    }
}
