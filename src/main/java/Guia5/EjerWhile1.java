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
public class EjerWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int num;
        System.out.println("Introduzca un numero: ");
        num=Entrada.entero();
        while (num != 0) //mientras num sea distinto de cero
        {
            if (num>0)
                // mayor que cero: positivo
                System.out.println("Positivo");
            else 
                // si no es positivo: es negativo
                System.out.println("Negativo");
                        // repetimos el proceso y volvemos a leer num
                        System.out.println("Introduzca otro numero: ");
                        num= Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es 0
    }
    
}
