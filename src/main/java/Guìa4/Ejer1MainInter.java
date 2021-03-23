/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guìa4;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejer1MainInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            Ejer1ClassInter factura = new Ejer1ClassInter();
            System.out.println("Producto: " + factura.producto("COCA COLA"));
            System.out.println("Descripcion: " + factura.descripcion("Coca cola 2.5L cero azucar"));
            System.out.println("Precio regular: " +  factura.precio_regular(2.25));
            System.out.println("Descuento: " + factura.descuento(2.25, 0.10));
            System.out.println("Sub total: " + factura.subtotal(2.25, 0.23));
            
    }
    
}
