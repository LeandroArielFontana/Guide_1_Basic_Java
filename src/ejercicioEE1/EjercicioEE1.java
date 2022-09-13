/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioEE1;

/**
 *
 * @author Roxana
 */

import java.util.Scanner;

public class EjercicioEE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       EjercicioExtra1();
        
    }
    
    public static void EjercicioExtra1(){
        
    String[][] Matrix = new String[7][6];        
        
    Fill(Matrix);
    
    Show(Matrix);
    
    Verificate(Matrix);
    
    }
  
    public static void Fill(String[][] Matrix){
        
        Scanner Read = new Scanner(System.in);
        
        for (int i = 0; i < 7; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                if (i == 0 && j == 0){
                    
                    Matrix[i][j] = " ";
                    
                }else if (j == 0){
                    
                    Matrix[i][j] = Integer.toString(i);
                    
                }else if (i == 0) {
                    
                    switch (j) {
                        
                        case 1:
                            
                            Matrix[i][j] = "A";
                            
                            break;
                            
                        case 2:
                            
                            Matrix[i][j] = "B";
                            
                            break;
                            
                        case 3:
                            
                            Matrix[i][j] = "C";
                            
                            break;
                            
                        case 4:
                            
                            Matrix[i][j] = "D";
                            
                            break;
                            
                        case 5:    
                            
                            Matrix[i][j] = "E";
                        
                            break;
                    }
                    
                }else{
                    
                    switch (j) {
                        
                        case 1:
                            
//                            System.out.println("Digite la catidad de ventas de la silla " + i + " en la fase A" );
//                            
//                            Num = Read.nextInt();
                            
                            Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 99));
                            
                            break;
                            
                        case 2:
                            
//                            System.out.println("Digite la catidad de ventas de la silla " + i + " en la fase B" );
//                            
//                            Num = Read.nextInt();
//                            
                            Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 99));
                            
                            break;
                            
                        case 3:
                            
//                            System.out.println("Digite la catidad de ventas de la silla " + i + " en la fase C" );
//                            
//                            Num = Read.nextInt();
                            
                            Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 99));
                            
                            break;
                            
                        case 4:
                            
//                            System.out.println("Digite la catidad de ventas de la silla " + i + " en la fase D" );
//                            
//                            Num = Read.nextInt();
                           
                            Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 99));
                            
                            break;
                            
                        case 5:    
                            
//                            System.out.println("Digite la catidad de ventas de la silla " + i + " en la fase E" );
//                            
//                            Num = Read.nextInt();
                        
                            Matrix[i][j] = Integer.toString((int)Math.floor(Math.random() * 99));
                            
                            break;
                    }
                    
                    
                    
                }
                    
                
            }
        }
        
    }
    
    public static void Show(String[][] Matrix){
        
        for (int i = 0; i < 7; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                if (i == 0 || j == 0){
                    
                    System.out.print("   " + Matrix[i][j] + "    ");
                     
                }else{
                    
                    System.out.print("   " + Matrix[i][j] + "   ");
                    
                }
                
               
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static void Verificate(String[][] Matrix){
        
        int Max = 0;
        
        int Min = 999999999;
        
        int ColumnMin = 0;
        
        int ColumnMax = 0;
        
        int RowMin = 0;
        
        int RowMax = 0;
        
        System.out.println("¡¡ MAQUINAS !!");
        
        for (int i = 1; i < 7; i++) {
            
            for (int j = 1; j < 6; j++) {
                
                if (Integer.valueOf(Matrix[i][j]) < Min){
                    
                    Min = Integer.valueOf(Matrix[i][j]);
                    
                    ColumnMin = j;
                    
                } 
                    
                if(Integer.valueOf(Matrix[i][j]) > Max){
                    
                    Max = Integer.valueOf(Matrix[i][j]);
                    
                    ColumnMax = j;
                    
                }
                   
            }
            
            Min = 999999999;
            
            Max = 0;
            
                switch (ColumnMax) {
                    
                    case 1:
                            
                        System.out.println("El costo maximo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMax])); 
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("El costo maximo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMax])); 
                        
                        break;
                        
                    case 3:    
                        
                        System.out.println("El costo maximo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMax])); 
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("El costo maximo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMax])); 
                        
                        break;
                        
                    case 5:    
                    
                        System.out.println("El costo maximo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMax])); 
                        
                        break;
                        
                }
              
                switch (ColumnMin) {
                    
                    case 1:
                            
                        System.out.println("El costo minimo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMin])); 
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("El costo minimo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMin])); 
                        
                        break;
                        
                    case 3:    
                        
                        System.out.println("El costo minimo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMin])); 
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("El costo minimo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMin])); 
                        
                        break;
                        
                    case 5:    
                    
                        System.out.println("El costo minimo de la maquina nro " + i + " es de: " + Integer.valueOf(Matrix[i][ColumnMin])); 
                        
                        break;
                        
                }
                
        }
        
        System.out.println("¡¡ FASES !!");
        
        
        for (int j = 1; j < 6; j++) {
            
            for (int i = 1; i < 7; i++) {
                
                if (Integer.valueOf(Matrix[i][j]) < Min){
                    
                    Min = Integer.valueOf(Matrix[i][j]);
                    
                    RowMin = i;
                    
                } 
                    
                if(Integer.valueOf(Matrix[i][j]) > Max){
                    
                    Max = Integer.valueOf(Matrix[i][j]);
                    
                    RowMax = i;
                    
                }
                   
            }
            
            Min = 999999999;
            
            Max = 0; 
             
            switch (j) {
                    
                    case 1:
                            
                        System.out.println("El costo maximo de la Fase A es de: " + Integer.valueOf(Matrix[RowMax][j])); 
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("El costo maximo de la Fase B es de: " + Integer.valueOf(Matrix[RowMax][j])); 
                        
                        break;
                        
                    case 3:    
                        
                        System.out.println("El costo maximo de la Fase C es de: " + Integer.valueOf(Matrix[RowMax][j])); 
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("El costo maximo de la Fase D es de: " + Integer.valueOf(Matrix[RowMax][j])); 
                        
                        break;
                        
                    case 5:    
                    
                        System.out.println("El costo maximo de la Fase E es de: " + Integer.valueOf(Matrix[RowMax][j])); 
                        
                        break;
                        
                }
              
                switch (RowMin) {
                    
                    case 1:
                            
                        System.out.println("El costo minimo de la Fase A es de: " + Integer.valueOf(Matrix[RowMin][j])); 
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("El costo minimo de la Fase B es de: " + Integer.valueOf(Matrix[RowMin][j])); 
                        
                        break;
                        
                    case 3:    
                        
                        System.out.println("El costo minimo de la Fase C es de: " + Integer.valueOf(Matrix[RowMin][j])); 
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("El costo minimo de la Fase D es de: " + Integer.valueOf(Matrix[RowMin][j])); 
                        
                        break;
                        
                    case 5:    
                    
                        System.out.println("El costo minimo de la Fase E es de: " + Integer.valueOf(Matrix[RowMin][j])); 
                        
                        break;
                        
                }
                
                
            
        }
            
    }
        
}

