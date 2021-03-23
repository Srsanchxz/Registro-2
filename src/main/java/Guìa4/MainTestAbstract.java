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
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            ExtendsAbstract boleta = new ExtendsAbstract();
            
            System.out.println("El nombre del empleado es : " + boleta.nombre("maria fernanda"));
            System.out.println("Ocupacion del empleado : " + boleta.ocupacion("Operador de maquina"));
           System.out.println("La edad del empleado es: " + boleta.edad(35) + "anos de edad");
            System.out.println("El sueldo bruto del empleado es: " + boleta.salario_bruto(225.65) + "dolares americanos");
            System.out.println("El sueldo total del empleado es:  " + boleta.salario_neto(225.65, 20.85) + "dolares americanos");
            
            
        
        
    }
    
}
