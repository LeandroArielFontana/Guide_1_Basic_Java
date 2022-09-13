/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioEE2;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;
        
public class EjercicioEE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    EjercicioExtra2();    
        
    }
    
    public static void EjercicioExtra2(){
      
    Scanner Read = new Scanner(System.in);    
    
    int Long = 0;
    
    int Number = 0;
    
    int Add = 0;
    
    String HalfNum1 = "";
    
    String HalfNum2 = "";
    
    String Num = "";

        System.out.println("Digite un numero para ver si es un numero Koprekar");
    
        Num = Read.nextLine();
        
    if (Integer.valueOf(Num) >= 1 && Integer.valueOf(Num) <= 65536){
     
    Number = (int)Math.pow(Integer.valueOf(Num), 2);      
    
    Long = (Integer.toString(Number)).length();
    
//        System.out.println(Number);
    
        System.out.println((String.valueOf(Number)).substring(0, Long / 2) + " + " + (String.valueOf(Number)).substring(Long / 2, Long) );

     HalfNum1 = String.valueOf(Number).substring(0, Long / 2);
        
     HalfNum2 = String.valueOf(Number).substring(Long / 2, Long);
     
//        System.out.println(HalfNum1);
//        
//        System.out.println(HalfNum2);
        
        Add = Integer.valueOf(HalfNum1) + Integer.valueOf(HalfNum2);
        
        if (Add == Integer.valueOf(Num)){
            
            System.out.println("El numero es un numero Koprekar");
            
        }else{
            
            System.out.println("El numero no es numero Koprekar");
            
        }
    }
        
        
        
    }
    
}
