/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE22;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioE22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
//medida que el usuario las va ingresando, construya una “sopa de letras para niños”
//de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
//horizontal en una fila que será seleccionada de manera aleatoria. Una vez
//concluida la ubicación de las palabras, rellene los espacios no utilizados con un
//número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
//creada.
        
     Scanner Read = new Scanner (System.in).useDelimiter("\n");   
        
    String Word = "";

    String[][] Matrix = new String[20][20];
    
    int Rows = 0;
    
    int Columns = 0;
    
    int k = 0;
    
    int l = 0;
    
    char Letter = ' ';
    
    String Letter2 = "";

        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 9 ));
                
            }
            
        }
    
    
        for (int a = 0; a < 5; a++) {
            
        k = 0;    
            
        System.out.println("Digite una palabra de 3 a 5 caracteres para colocar en la sopa de letras");
        
        Word = Read.next().toUpperCase();   
        
            if(Word.length() >= 3 && Word.length() <= 5){
            
                Rows = (int)Math.floor(Math.random()*19); 
        
                Columns = (int)Math.floor(Math.random()*15);
            
                for (int i = Rows; i <= Rows; i++){

                    l = Columns;

                    do{

                        Matrix[i][l] = Character.toString(Word.charAt(k));
                        
                        k++;
                        
                        l++;
                        
                    }while(k < Word.length());
                        
                }
            
            }else{
                
                System.out.println("No se tomara en cuenta esta palabra ya que no tiene entre 3 y 5 caracteres");

            }      
        }
        
    Show(Matrix);  
        
    }
    
    public static void Show(String[][] Matrix){
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                System.out.print(" " + Matrix[i][j] + " ");
                
            }
            
            System.out.println(" ");
            
        }
        
    }
    
}
