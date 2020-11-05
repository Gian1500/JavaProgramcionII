
package ClasesYObjetos;


public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String estadoC;

    public Persona(String nombre, String apellido, String dni, String estadoC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoC = estadoC;
    }
    
 
   public abstract String MostrarDatos();

    
  
}
