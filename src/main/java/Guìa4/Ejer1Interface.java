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
public interface Ejer1Interface {
    
    String producto (String a);
    String descripcion(String a);
    double precio_regular(double a);
    double descuento (double a, double b);
    double subtotal (double a, double b);
    
}
