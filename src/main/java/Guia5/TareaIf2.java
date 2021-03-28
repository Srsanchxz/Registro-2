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
public class TareaIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El colegio Santa teresa de jesus desea premiar a los mejores promedios aplicando un descuento segun
       // su promedio obtenido en el registro. 
       
        double promedio, mensualidad=110, descuento, total;
       
        System.out.println("Ingrese el promedio del alumno:  ");
        promedio = Entrada.real();
        
        if (promedio >=9 && promedio <=10)
        {
            descuento = 0.25;
        }
        else{
        
             if (promedio>=8 && promedio <9 )
        {
            descuento = 0.15;
            
        }else{
             
                 if (promedio >=7 && promedio <8){
                 
                     descuento =0.5;
                 
                 }else{
                 
                     descuento =0;
                     
                 }
             
             }
        
        }
        
        total = mensualidad-mensualidad*descuento;
        System.out.println("El total de colegiatura es: ");
        System.out.print("$"+ total);
       
  
    }
    
}
