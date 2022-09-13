/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE08;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break.

    Scanner Read = new Scanner(System.in);

    int Num = 0;
    
    int Count = 0;
    
    int Odd = 0;
    
    int Pair = 0;
    
    do{
        
        System.out.println("Digite un numero positivo");
    
        Num = Read.nextInt();
        
        if (Num > 0){
            
            Count++;
        
            if (Num % 2 == 0){
            
              Pair++;
            
            }else{
            
                Odd++;
            
            } 
        }    
    
    }while(Num % 5 != 0);    
    
            
        System.out.println("Se ingresaron " + Count + " numeros");
        
        System.out.println("En los numeros ingresados hay " + Pair + " numeros pares" );
        
        System.out.println("En los numeros ingresados hay " + Odd + " numeros impares" );
            
    }
    
}
