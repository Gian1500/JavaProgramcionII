
package ClasesYObjetos;


public class Auto extends Vehiculo {
    
    private final String tipo;
    
    public Auto(String color, String marca, String modelo, String numSerieChasis, String numRuedas, String numPasajeros) {
        super(color, marca, modelo, numSerieChasis, numRuedas, numPasajeros);
        tipo="Descapotable";
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    @Override
    public float maximaVel(float cantKm) {
        float resultado;
        float recargas=cantKm/600;
        
        if(cantKm>=600)
            resultado= (cantKm/220)+ (int)recargas;
        else
            resultado= cantKm/220;
        
        return resultado;
    }


    
}
