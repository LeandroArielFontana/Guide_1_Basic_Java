/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE17;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE17 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

//      Eealizar un algoritmo que calcule la suma de todos los elementos de un vector de
//      tamaño N, con los valores ingresados por el usuario.

    Scanner Read = new Scanner (System.in);
    
    int Dim = 0;
    
        System.out.println("Digite el tamaño del vector a llenar");
        
    Dim = Read.nextInt();
    
    int[] Vector = new int[Dim];
    
    int Add = 0;
    
    int Num = 0;
    
    for (int i = 0; i < Dim; i++) {
            
        System.out.println("Digite un numero para la posicion " + i + " del vector ");
        
        Num = Read.nextInt();
        
        Vector[i] = Num;
        
        Add += Vector[i];
        
    }
    
        System.out.println("La sumatoria de todos los numeros del vector es de : " + Add);
    
    }

}
