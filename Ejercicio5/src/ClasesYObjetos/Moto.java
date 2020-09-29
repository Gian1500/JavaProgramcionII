
package ClasesYObjetos;


public class Moto extends Vehiculo {

    public Moto(String color, String marca, String modelo, String numSerieChasis, String numRuedas, String numPasajeros) {
        super(color, marca, modelo, numSerieChasis, numRuedas, numPasajeros);
    }



    @Override
    public float maximaVel(float cantKm) {
        float resultado;
        int recargas;
        float contador=0;
        int i;
        
        recargas=(int)cantKm/700;
        for(i=1;i<=recargas;i++)
            contador+=0.30;
        
        if(cantKm>=700)
            resultado= (cantKm/150)+ contador;
        else
            resultado= cantKm/150;
        
        return resultado;
    }


    
}
