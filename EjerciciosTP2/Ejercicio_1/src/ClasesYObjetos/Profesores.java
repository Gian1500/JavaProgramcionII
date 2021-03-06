/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author Gian
 */
public class Profesores extends Persona {
    
    private String departamento;
    private String añoInc;
    private String numDespacho;

    public Profesores(String nombre, String apellido, String dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.departamento="";
        this.añoInc="";
        this.numDespacho="";
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAñoInc() {
        return añoInc;
    }

    public void setAñoInc(String añoInc) {
        this.añoInc = añoInc;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    @Override
    public String MostrarDatos() {
        
        return this.nombre+" "+this.apellido+" DNI:"+this.dni+" EstadoCivil:"+
               this.estadoC+" Departamento:"+this.departamento + " Año Incorporacion:" + this.añoInc
                + " N° de Despacho:"+ this.numDespacho;
    }
    
    
    
}
