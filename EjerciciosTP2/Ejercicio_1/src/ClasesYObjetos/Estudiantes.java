
package ClasesYObjetos;


public class Estudiantes extends Persona {
    
    
    private String curso;

    public Estudiantes(String nombre, String apellido, String dni, String estadoC) {
        super(nombre, apellido, dni, estadoC);
        this.curso="";
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        
        return this.nombre+" "+this.apellido+" DNI:"+this.dni+" EstadoCivil:"+this.estadoC+" Curso:"+this.curso;
    }

 
    
    
}
