/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE09;

/**
 *
 * @author Leandro
 */
  
import java.util.Scanner;

public class EjercicioE09 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
//          Simular la división usando solamente restas. Dados dos números enteros mayores
//          que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
//          restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
//          que el divisor, este resultado es el residuo, y el número de restas realizadas es el
//          cociente. Por ejemplo: 50 / 13:

//          50 – 13 = 37 una resta realizada
//          37 – 13 = 24 dos restas realizadas
//          24 – 13 = 11 tres restas realizadas

//          dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.    
        
    Scanner Read = new Scanner(System.in);

    int Divider = 0;
    
    int Dividend = 0;
    
    int Count = 0;
    
        System.out.println("Digite el dividendo por favor");
        
    Dividend = Read.nextInt();
    
        System.out.println("Digite el divisor por favor");
    
    Divider = Read.nextInt();    
    
    if(Dividend > Divider){
        
        do{
            
            Count++;
            
            Dividend = Dividend - Divider;
            
            
            
        }while(Dividend >= Divider);
        
    }
    
        System.out.println("El resto es de: " + Dividend);

        System.out.println("El cociente es de: " + Count);
        
    }
    
}
