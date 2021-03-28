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
public class Ejer2If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1,n2;
        System.out.println("Introduce un numero: ");
        n1=Entrada.entero();
         System.out.println("Introduce otro numero");
         n2 = Entrada.entero();
         
         if(n1==n2)
             System.out.println("Son iguales");
         else {
             if (n1>n2)
                 System.out.println(n1 + " es mayor que " + n2);
             else 
                 System.out.println(n2 + " es mayor que " + n1);
         }
    }
    
}
