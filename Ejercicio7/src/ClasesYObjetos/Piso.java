
package ClasesYObjetos;


public class Piso extends Inmobiliaria {

    private int numPiso;

    public Piso(int numPiso, String direccion, float metrosCuadrados, int añosInmueble, float precioBase) {
        super(direccion, metrosCuadrados, añosInmueble, precioBase);
        this.numPiso = numPiso;
    }



    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getAñosInmueble() {
        return añosInmueble;
    }

    public void setAñosInmueble(int añosInmueble) {
        this.añosInmueble = añosInmueble;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    @Override
    public float calcularPrecioFinal() {
        float precioFinal;
        
        precioFinal=precioBase;
        
        if(añosInmueble<15)
            precioFinal=precioFinal-(precioFinal*1)/100;
        else if (añosInmueble>=15)
            precioFinal=precioFinal-(precioFinal*2)/100;
        
        if(numPiso>=3)
            precioFinal=precioFinal + (precioFinal*3)/100;
        
        return precioFinal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("|DATOS INGRESADOS PISO|");
        System.out.println("Direccion: "+ direccion);
        System.out.println("Dimension: "+ metrosCuadrados+ " m2");
        System.out.println("N° de piso: "+ numPiso+"°");
        System.out.println("Edad del inmueble: "+ añosInmueble + " años");
        System.out.println("Precio base: $ "+ precioBase);
        
    }
    
}
