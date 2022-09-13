/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio016;

/**
 *
 * @author Lean Hackerman
 */

import java.util.Scanner;

public class Ejercicio016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*  Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
            salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
            deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
            número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    
    Scanner Read = new Scanner(System.in);
    
    int Num = 0;
    
    int Suma = 0;
    
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Digite un numero");
            
            Num = Read.nextInt();
            
            if (Num == 0) {
                
                System.out.println("Se capturo el numero cero");
                
                System.out.println("La suma es: " + Suma);
                
                break;
                
            }else if (Num >= 0){
                
                Suma = Suma + Num;
                
                System.out.println("La suma es: " + Suma);
                
            }else {
                
                System.out.println("Como el numero es negativo, no entra en la sumatoria total. La suma es: " + Suma);
                
            }
                
        }
    
    }
    
}
