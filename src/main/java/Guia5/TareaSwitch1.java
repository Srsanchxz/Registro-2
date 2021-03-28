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
public class TareaSwitch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double  n1, n2, resultado;
        int menu;
        
        System.out.println("ingresa un numero:  ");
        n1= Entrada.real();
        System.out.println("ingresa otro numero: ");
        n2= Entrada.real();
        
        System.out.println("Que deseas hacer con estos numeros?");
        System.out.println("1- sumar");
        System.out.println("2- restar");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir ");
        System.out.println("Ingrese opcion: ");menu= Entrada.entero();
        
        switch(menu){
        
            case 1: 
                
                resultado = n1 + n2;
                System.out.println("La suma de los dos numero es " + resultado);
                break;
             
            case 2:
                
                resultado = n1 - n2;
                System.out.println("La resta de los dos numeros es: " + resultado);
                 break;
                 
           case 3:
                
                resultado = n1 * n2;
                System.out.println("La multiplicacion de los dos numeros es: " + resultado);
                 break;
                 
            case 4:
                
                resultado = n1 / n2;
                System.out.println("La division de los dos numeros es: " + resultado);
                 break;
                                                                                                                                                                                        
        
        
            
        }
        
        
        
        
    }
    
}
