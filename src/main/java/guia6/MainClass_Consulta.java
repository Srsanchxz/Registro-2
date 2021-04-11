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
public class MainClass_Consulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Diagnostico a enfermedades cronicas: " + Paciente.enfermedad_cronica);
        System.out.println("Fecha de la consulta: " + Paciente.Fecha() +"  "+ Paciente.hora());
        System.out.println("Medico encargado: " + Paciente.Medico());
        
        Paciente Especialidades = new Paciente();
        
        Especialidades.setNombre("Maria Ventura");
        System.out.println("Nombre del paciente: " + Especialidades.getNombre());
        
        Especialidades.setSexo("Femenino");
        System.out.println("Sexo: " +  Especialidades.getSexo());
        
        Especialidades.setEdad(60);
        System.out.println("Anos de edad: " + Especialidades.getEdad());
        
        Especialidades.setDiagnostico("Pulmones perforados por consumo de cigarrillo");
        System.out.println("Diagnostico: " + Especialidades.getDiagnostico());
        
          if ( Especialidades instanceof Paciente){
            System.out.println("Especialidades tiene el cuadro clinico del Paciente");
        }else{
            System.out.println("El paciente es ajeno a especialidades");
        }
        
        
    }
    
}
