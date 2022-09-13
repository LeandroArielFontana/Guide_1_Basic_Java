/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE16;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicoE16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          Crea una aplicación que nos pida un número por teclado y con una función se lo
//          pasamos por parámetro para que nos indique si es o no un número primo, debe
//          devolver true si es primo, sino false.
//          Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
//          no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

    Scanner Read = new Scanner(System.in).useDelimiter("\n");

    int Num = 0;
    
    System.out.println("Digite un numero para ver si es primo o no");
        
    Num = Read.nextInt();
        
        if (Verificate(Num) == true){
            
            System.out.println("El numero " + Num + " es primo");
            
        }else{
            
            System.out.println("El numero " + Num + " no es primo");
            
        }

    }
    
    public static boolean Verificate(int Num){
        
        boolean Verif = false;
        
        int Count = 0;
        
        for (int i = 2; i <= Num; i++) {
         
            if (Num % i == 0){
                
                Count++;
                
            }
            
        }
        
        if (Count == 1 ){
            
            Verif = true;
            
        }else{
            
            Verif = false;
            
        }
        
        return Verif;
        
    }
    
}
