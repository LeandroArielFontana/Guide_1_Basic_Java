/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE03;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE03 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//           Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//          vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//          clase String.

Scanner Read = new Scanner(System.in);

    String Letter = "";

        System.out.println("Digite una vocal");
        
    Letter =  Read.nextLine();

    if (Letter.equals("a") || Letter.equals("e") || Letter.equals("i") || Letter.equals("o") || Letter.equals("u")){
        
        System.out.println("Es una vocal");
        
    }else{
        
        System.out.println("No es una vocal");
        
    }


    }
    
}
