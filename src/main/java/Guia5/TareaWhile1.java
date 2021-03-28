/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TareaWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa para determinar cuantos alumnos de una clase necesitan refuerzo.
        
        double promedio;
        int a = 0,b = 0, c = 0,  i = 1;
        
        while (i<=5){
        
            System.out.println("Introduzca el promedio del alumno");
            promedio=Entrada.real();
            i=i+1;
            if ( promedio >= 8 && promedio <=10){
            
                System.out.println("El alumno no necesita refuerzo academico");
                a= a+1;
                
            }else {
            
                if (promedio >= 0 && promedio <8){
                
                    System.out.println("El alumno necesita refuerzo academico.");
                    b=b+1;
                    
                    
                }else{
                
                    System.out.println("Promedio ingresado no es valido");
                    c=c+1;
                
                }
            
            }
            
        
        }
        
        System.out.println("El total de alumnos que no necesitan recuperacion es: " + a);
        System.out.println("El total de alumnos que necesitan recuperacion es: " + b);
        System.out.println("Se ingresason " + c + " datos sin valides.");
        
        
    }
    
}
