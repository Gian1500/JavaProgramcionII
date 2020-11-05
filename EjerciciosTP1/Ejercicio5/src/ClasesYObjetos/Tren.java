
package ClasesYObjetos;


public class Tren extends Vehiculo {
    
    private String numVagones;

    public Tren(String color, String marca, String modelo, String numSerieChasis, String numRuedas, String numPasajeros, String numVagones) {
        super(color, marca, modelo, numSerieChasis, numRuedas, numPasajeros);
        this.numVagones=numVagones;
    }

    public String getNumVagones() {
        return numVagones;
    }

    @Override
   public float maximaVel(float cantKm) {
        float resultado;
        
        resultado=cantKm/80;
        
        return resultado;
    }


 
    
}
