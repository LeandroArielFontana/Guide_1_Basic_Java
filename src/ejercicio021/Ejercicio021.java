/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio021;

/**
 *
 * @author Leandro
 */
    
import java.util.Scanner;

public class Ejercicio021 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        /*  Crea una aplicación que a través de una función nos convierta una cantidad de
            euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
            libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
            converir que será una cadena, este no devolverá ningún valor y mostrará un
            mensaje indicando el cambio (void).
            El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 € */
        
        Scanner Read = new Scanner(System.in);
        
        double Money = 0.0;
        
        String Currency = "";
        
        System.out.println("Digite el tipo de moneda con el cual desea cambiar los euros");
        
        Currency = Read.nextLine();
        
        System.out.println("Digite la cantidad de Euros a pasar");
        
        Money = Read.nextDouble();
        
        ChangeCurrency(Money, Currency);
        
        }
    
    public static void ChangeCurrency(Double Money, String Currency) {
        
        double Change = 0.0;
        
        switch (Currency){
            
            case "dolares":
                
                Change = Money * 1.28611;
                
                System.out.println("La cantidad de dolares es de: " + Change);
                
                break;
                
            case "yenes":
                
                Change = Money * 129.852;
                
                System.out.println("La cantidad de yenes es de: " + Change);
                
                break;
                
            case "libras":
                
                Change = Money * 0.86;
                
                System.out.println("La cantidad de libras es de: " + Change);
                
                break;
                
        }
    }
}
