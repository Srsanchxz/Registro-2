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
public class Ejer1ClassInter implements Ejer1Interface {

    @Override
    public String producto(String a) {
    return a;
    }

    @Override
    public String descripcion(String a) {
     return a;
    }

    @Override
    public double precio_regular(double a) {
        return a;
    }

    @Override
    public double descuento(double a, double b) {
        
        return a*b;
    }

    @Override
    public double subtotal(double a, double b) {
        return a-b;
       
    }

}
