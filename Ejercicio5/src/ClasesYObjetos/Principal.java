
package ClasesYObjetos;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
       
        Scanner teclado = new Scanner(System.in);
        float cantKm,tiempoA,tiempoM,tiempoTren;
        
        Auto auto1= new Auto("Rojo","Nissan","Skyline","N° 123548","4","4");
        Moto moto1=new Moto ("Azul","Motomel","M34","N° 3234","2","1");
        Tren tren1=new Tren ("Plata","Dominus","Dm7898","N° 456489","100","200","10");
        
        System.out.println("Ingrese la cantidad de KM: ");
        cantKm=teclado.nextFloat();
       
        tiempoA=auto1.maximaVel(cantKm);
        tiempoM=moto1.maximaVel(cantKm);
        tiempoTren = tren1.maximaVel(cantKm);
        
        System.out.println("|AUTO|");
        System.out.println("El auto de color: " + auto1.color+ " " + auto1.marca + " " + auto1.modelo + " con " + auto1.numPasajeros + " pasajeros y " + " " + auto1.numRuedas + " ruedas,chasis " + auto1.numSerieChasis + " tipo " + auto1.getTipo());
        System.out.println("|RECORRIO| " + cantKm + "  KM " + " en " + tiempoA+ " horas");
        System.out.println("--------------------------------------------------------------");
        
        
        System.out.println("|MOTO|");
        System.out.println("La moto de color: " + moto1.color+ " " + moto1.marca + " " + moto1.modelo + " con " + moto1.numPasajeros + " pasajeros y "  + moto1.numRuedas + " ruedas, chasis " + moto1.numSerieChasis);
        System.out.println("|RECORRIO| " + cantKm + "  KM " + " en " + tiempoM+ " horas");
        System.out.println("--------------------------------------------------------------");
    
        System.out.println("|TREN|");
        System.out.println("El Tren de color: " + tren1.color+ " " + tren1.marca + " " + tren1.modelo + " con " + tren1.numPasajeros + " pasajeros y " + tren1.numRuedas + " ruedas, chasis " + tren1.numSerieChasis + " Con " + tren1.getNumVagones() + " Vagones");
        System.out.println("|RECORRIO| " + cantKm + "  KM " + " en " + tiempoTren+ " horas");
        System.out.println("--------------------------------------------------------------");
        
        if (tiempoA<tiempoM && tiempoA<tiempoTren)
            System.out.println("El auto tardo menos en llegar a destino " +"= "+ tiempoA + " Horas");
        
        else if(tiempoM<tiempoA && tiempoM<tiempoTren)
            System.out.println("La moto tardo menos en llegar a destino "+"= "+ tiempoM + " Horas" );
        else 
            System.out.println("El tren tardo menos en llegar a destino "+"= "+ tiempoTren+ " Horas" );
        
        
    }
  
}
