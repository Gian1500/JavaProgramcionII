
package ClasesYObjetos;

public class Local extends Inmobiliaria{

    private int numVentanas;

    public Local(int numVentanas, String direccion, float metrosCuadrados, int añosInmueble, float precioBase) {
        super(direccion, metrosCuadrados, añosInmueble, precioBase);
        this.numVentanas = numVentanas;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
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
        
        if(metrosCuadrados>50)
            precioFinal=precioFinal + (precioFinal*1)/100;
        
        if(numVentanas<=1)
            precioFinal=precioFinal - (precioFinal*2)/100;
        else if (numVentanas>=4)
            precioFinal=precioFinal + (precioFinal*2)/100;
        
        return precioFinal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("|DATOS INGRESADOS LOCAL|");
        System.out.println("Direccion: "+ direccion);
        System.out.println("Dimension: "+ metrosCuadrados+ " m2");
        System.out.println("N° de ventanas: "+ numVentanas);
        System.out.println("Edad del inmueble: "+ añosInmueble + " años");
        System.out.println("Precio base: $ "+ precioBase);
    }
    
}
