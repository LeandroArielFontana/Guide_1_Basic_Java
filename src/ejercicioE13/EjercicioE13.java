/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE13;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//      Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//      cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//      cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//      todas las familias.   
        
    Scanner Read = new Scanner(System.in);
        
    int Families = 0;
    
    int Children = 0;
    
    int Count = 0;
    
    double YearsAverage = 0.0;
    
    int YearsAdd = 0;
    
        System.out.println("Digite por favor la cantidad de familias");
    
    Families = Read.nextInt();

        for (int i = 0; i < Families; i++) {
            
            System.out.println("Digite la cantidad de hijos que contiene la familia");
            
            Children = Read.nextInt();
            
            Count += Children;
            
            for (int j = 0; j < Children; j++) {
                
                System.out.println("Digite la edad del " + (j + 1) + "° chico");
                
                YearsAdd += Read.nextInt();
                
            }
            
        }
        
        YearsAverage = YearsAdd / Count;
        
        System.out.println("El promedio de edad de la(s) " + Families + " familia(s) es de: " + YearsAverage);
    
    }
    
}
