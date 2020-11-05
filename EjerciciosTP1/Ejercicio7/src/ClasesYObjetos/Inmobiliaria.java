
package ClasesYObjetos;


public abstract class Inmobiliaria {
    
    protected String direccion;
    protected float metrosCuadrados;
    protected int añosInmueble;
    protected float precioBase;

    public Inmobiliaria(String direccion, float metrosCuadrados, int añosInmueble, float precioBase) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.añosInmueble = añosInmueble;
        this.precioBase = precioBase;
    }
    
    
    
    public abstract float calcularPrecioFinal();
    
    public abstract void mostrarDatos();
    
}