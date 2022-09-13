/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE12;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Crear un programa que dibuje una escalera de números, donde cada línea de
//      números comience en uno y termine en el número de la línea. Solicitar la altura de
//      la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:

//      1
//      12
//      123

    Scanner Read = new Scanner(System.in);
    
    int Size = 0;
    
    String Num = "";
    
        System.out.println("Digite el tamaño de la escalera de numeros");
    
    Size = Read.nextInt();
    
        for (int i = 1; i <= Size; i++) {
            
            Num = Num + Integer.toString(i);
            
            System.out.println(Num);
            
        }
    
    }
    
}
