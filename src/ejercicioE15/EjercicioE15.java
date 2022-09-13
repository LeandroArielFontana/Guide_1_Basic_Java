/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE15;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//          Diseñe una función que pida el nombre y la edad de N personas e imprima los
//          datos de las personas ingresadas por teclado e indique si son mayores o menores
//          de edad. Después de cada persona, el programa debe preguntarle al usuario si
//          quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
//          “No”.

    Scanner Read = new Scanner(System.in).useDelimiter("\n");
    
    String Name = "";
    
    int Year = 0;
    
    String Opc = "";
    
    int i = 0;
    
    do{
    
        System.out.println("Digite el nombre de la " + (i + 1) + "° persona");
            
        Name = Read.next();
            
        System.out.println("Digite la edad de la " + (i + 1) + "° persona");
            
        Year = Read.nextInt();
            
        if (Year >= 18){
                
            System.out.println("Nombre : " + Name);
                
            System.out.println("Edad : " + Year);
                
            System.out.println("Mayor de edad : Si ");
            
        }else{
                
            System.out.println("Nombre : " + Name);
                
            System.out.println("Edad : " + Year);
                
            System.out.println("Mayor de edad : No ");
                
        }
        
    System.out.println("Desea ingresar mas personas? ( Si / No )");
        
    Opc = Read.next();
        
    }while(!Opc.equals("No"));
    
    
    }
    
}
