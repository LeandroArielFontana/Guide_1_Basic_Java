/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE05;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;
        
public class EjercicioE05 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//           Una obra social tiene tres clases de socios:

//          o   Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//              descuento en todos los tipos de tratamientos.

//          o   Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//              descuento para los mismos tratamientos que los socios del tipo A.

//          o    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//               dichos tratamientos.

//              Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//              que represente el costo del tratamiento (previo al descuento) y determine el importe
//              en efectivo a pagar por dicho socio.
    
    Scanner Read = new Scanner(System.in);

    String Letter = "";
     
    double FinalImport = 0.0;
    
    double Import = 0.0;
    
        System.out.println("Digite que tipo de socio es la persona que realizo la compra");
     
    Letter = Read.nextLine();    
    
        System.out.println("Digite el monto a pagar");
        
    Import = Read.nextDouble();

    switch (Letter){
        
        case "A":
            
            FinalImport = Import - (Import * 0.50);
            
            System.out.println("Como es un socio tipo A, el importe a pagar es de: $ " + FinalImport);
            
            break;
            
        case "B":
            
            FinalImport = Import - (Import * 0.35);
            
            System.out.println("Como es un socio tipo B, el importe a pagar es de: $ " + FinalImport);
            
            break;
            
        case "C": 
            
            FinalImport = Import;
            
            System.out.println("Como es un socio tipo C, el importe a pagar es de: $ " + FinalImport);
            
            break;
            
    }

    }
    
}
