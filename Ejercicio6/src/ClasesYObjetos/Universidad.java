
package ClasesYObjetos;

public abstract class Universidad {
    
    protected String nombre;
    protected String apellido;
    protected String dni; //guardado como string ya que no se va realizar ningun calculo
    protected String estadoCivil;

   
    public Universidad(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public abstract void cargarDatos();
    public abstract void mostrarDatos();
}
