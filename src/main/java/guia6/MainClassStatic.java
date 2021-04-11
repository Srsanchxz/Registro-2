/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MainClassStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Coche.numeroRuedas);
        System.out.println("El coche tienes su timon del lado :" + Coche.timon);
        
        System.out.println("El metodo retorna : " + Coche.arrancar());
        System.out.println("El metodo retorna : " + Coche.combustible());
        System.out.println("El metodo rerorna : " + Coche.frenar());
        System.out.println("El metodo retorna : " + Coche.girar());
        
        Coche toyota = new Coche();
        toyota.setColor("rojo");
        System.out.println("el color del carro es :  " + toyota.getColor());
        
        toyota.setVelocidad(100);
        System.out.println("La velocidad maxima del carro es : " + toyota.getVelocidad());
        
        toyota.setTamano(7);
        System.out.println("El tamano del carro es : " + toyota.getTamano());
        
        if (toyota instanceof Coche){
            System.out.println("En efecto es una instancia de coche");
        }else{
            System.out.println("El carro toyota no es una instancia de coche");
        }
        
        
        
        // TODO code application logic here
    }
    
}
