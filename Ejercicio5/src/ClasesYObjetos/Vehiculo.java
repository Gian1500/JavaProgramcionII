
package ClasesYObjetos;

public abstract class Vehiculo {
     
//Pueden agregarse muchisimos mas atributos que pueden ser heredables 
    //como altura,ancho,capacidad de carga, nmero de luces,etc, pero 
     //recurri a lo basico para entender el concepto de herencia
    protected String color;
    protected String marca;
    protected String modelo;
    protected String numSerieChasis;
    protected String numRuedas;
    protected String numPasajeros;

    public Vehiculo(String color, String marca, String modelo, String numSerieChasis, String numRuedas, String numPasajeros) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerieChasis = numSerieChasis;
        this.numRuedas = numRuedas;
        this.numPasajeros = numPasajeros;
    }


    
    
    
    
    
    public abstract float  maximaVel(float cantKm);
      
}
