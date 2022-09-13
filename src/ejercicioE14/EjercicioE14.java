/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE14;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE14 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {

//      Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
//      sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//      operación matemática y deben devolver sus resultados para imprimirlos en el main.
    
    Scanner Read = new Scanner(System.in);
    
    int Num1 = 0;
    
    int Num2 = 0;  
    
        System.out.println("Digite el 1er Numero");
        
        Num1 = Read.nextInt();
        
        System.out.println("Digite el 2do Numero");
        
        Num2 = Read.nextInt();
        
    switch (Menu()){
        
        case 1:
       
            System.out.println("El resultado de la suma es : " + Addition(Num1, Num2));
            
            break;
            
        case 2:   
            
            System.out.println("El resultado de la resta es : " + Subtract(Num1, Num2));
        
            break;
            
        case 3:    
            
            System.out.println("El resultado de la multiplicacion es : " + Multiplication(Num1, Num2));
            
            break;
            
        case 4:    
            
            System.out.println("El resultado de la Division es : " + Division(Num1, Num2));
            
            break;
            
    }
    
    }
    
    public static int Menu(){
       
        int Opc = 0;
        
        Scanner Read = new Scanner(System.in);
        
        System.out.println("Digite la operacion que desea realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opcion:");
        
        Opc = Read.nextInt();
        
        return Opc;
        
    }
    
    public static int Addition(int Num1, int Num2){
        
        int Add = 0;
        
        Add = Num1 + Num2;
        
        return Add;
        
    }
    
    public static int Subtract(int Num1, int Num2){
        
        int Subtraction = 0;
        
        Subtraction = Num1 - Num2;
        
        return Subtraction;
        
    }
    
    public static double Division(int Num1, int Num2){
        
        return Num1 / Num2;
        
    }
    
    public static int Multiplication(int Num1, int Num2){
        
        return Num1 * Num2;
        
    }
}
