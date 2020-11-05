
package ClasesYObjetos;


public class Personaldeservicio extends Persona {
    
    private String añoInc;
    private String numDespacho;
    private String seccion;

    public Personaldeservicio(String nombre, String apellido, String dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.añoInc="";
        this.numDespacho="";
        this.seccion= "";
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

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
               this.estadoC+" Seccion:"+this.seccion + " Año Incorporacion:" + this.añoInc
                + " N° de Despacho:"+ this.numDespacho;
    }
    
    
    
}
