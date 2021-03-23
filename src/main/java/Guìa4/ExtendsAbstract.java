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
public class ExtendsAbstract extends AbstractEJ1 {



    @Override
    public int edad(int a) {
       return a;
    }


    @Override
    public double salario_bruto(double a) {
        return a;
    }

    @Override
    public double salario_neto(double a, double descuento) {
       return a-descuento;
    }

    @Override
    public String nombre(String a) {
      return a;
    }

    @Override
    public String ocupacion(String a) {
      return a;
    }

    
   
    
    
    

}
