/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE20;

/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class EjercicioE20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Los profesores del curso de programación de Egg necesitan llevar un registro de
//      las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
//      aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
//      notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
//      cada nota son:

//      Primer trabajo práctico evaluativo 10%

//      Segundo trabajo práctico evaluativo 15%

//      Primer Integrador 25%

//      Segundo integrador 50%

//      Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
//      del programa los profesores necesitan obtener por pantalla la cantidad de
//      aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
//      con promedio mayor o igual al 7 de sus notas del curso.

    Scanner Read = new Scanner(System.in);

    int Note1 = 0;
    
    int Note2 = 0;
    
    int Note3 = 0;
    
    int Note4 = 0;
    
    double[] Vector = new double[10];
    
    double Average = 0.0;
    
    int Approved = 0;
    
    int Disapproved = 0;
    
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite la nota del Primer trabajo práctico evaluativo del " + (i+1) + "° alumno");
            
            Note1 = Read.nextInt();
            
            System.out.println("Digite la nota del Segundo trabajo práctico evaluativo del " + (i+1) + "° alumno");
            
            Note2 = Read.nextInt();
            
            System.out.println("Digite la nota del Primer Integrador del " + (i+1) + "° alumno");
            
            Note3 = Read.nextInt();
            
            System.out.println("Digite la nota del Segundo integrador del " + (i+1) + "° alumno");
            
            Note4 = Read.nextInt();
            
            Average = ( (Note1 * 0.10) + (Note2 * 0.15) + (Note3 * 0.25) + (Note4 * 0.50) );
            
            Vector[i] = Average;
            
            if (Average >= 7){
                
                Approved++;
                
            }else{
                
                Disapproved++;
                
            }
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print(" [ " + Vector[i] + " ] ");
            
        }
        
        System.out.println("");
    
        System.out.println("Hubo una cantidad total de : " + Approved + " alumnos aprobados");
        
        System.out.println("Hubo una cantidad total de : " + Disapproved + " alumnos desaprobados");
        
    }
    
}
