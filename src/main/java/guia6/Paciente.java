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
public class Paciente {
    
    private String nombre;
    private String sexo;
    private int edad;
    private String diagnostico;
    public static final String enfermedad_cronica = "positivo";
    
    
    public static String Fecha(){
    return "Lunes 12 de Abril de 2021.";
    }
    
    public static String Medico(){
    return "Jesus Martinez";
    }
    
    public static String hora(){
    return "10:20 AM";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


}
