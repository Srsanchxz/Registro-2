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
public class TareaIf1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Programa para determinar si un numero es par o impar. 
        
        int numero;
        
        System.out.println("Ingrese un numero cualquiera: ");
        numero= Entrada.entero();
        
        if (numero%2 ==0){
        
            System.out.println("el numero es par");
            
        }else{
        
            System.out.println("El numero es impar");
            
        }
    }
    
}
