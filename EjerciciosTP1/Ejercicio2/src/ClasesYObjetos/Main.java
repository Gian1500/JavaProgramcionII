/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class Main {
    public static void main (String[] args){
        
        double kmRecorridos;
        double kmRecorridos2;
        double nuevoKilometraje;
        double nuevoKilometraje2;
        
        Scanner teclado = new Scanner(System.in);
        
        
        Auto Auto1 = new Auto();
        Auto Auto2 = new Auto();
        
        Auto1.setKilometraje(95000);
        Auto2.setKilometraje(80000);
        
        Auto1.setCombustible(5);
        Auto2.setCombustible(3);
        
        Auto1.setMarca("Toyota");
        Auto1.setModelo("Supra");
        
        Auto2.setMarca("Nissan");
        Auto2.setModelo("Skyline");
        
        System.out.println("Ingrese el la cantidad de Kilometros Recorridos: ");
        kmRecorridos= teclado.nextFloat();
        
        if(kmRecorridos<0){
            
            do{
                
                System.out.println("-ERROR- No pueden ingresarse valores negativos");
                System.out.println("-Reingrese los datos...");
                kmRecorridos= teclado.nextFloat();
            
            }while(kmRecorridos<0);
        }
        
        kmRecorridos2=kmRecorridos;
        nuevoKilometraje=kmRecorridos+Auto1.getKilometraje();
        nuevoKilometraje2=kmRecorridos+Auto2.getKilometraje();
        
        System.out.println("|AUTOS|");
        System.out.println("Marca: " +Auto1.getMarca());
        System.out.println("Modelo: " +Auto1.getModelo());
        System.out.println("Kilometraje Inicial: " +Auto1.getKilometraje()+" Km");
        System.out.println("Gasto por KM: " +Auto1.getCombustible()+ " " + "Litros");
        
        System.out.println("");
        System.out.println("Marca: " +Auto2.getMarca());
        System.out.println("Modelo: " +Auto2.getModelo());
        System.out.println("Kilometraje Inicial: " +Auto2.getKilometraje()+" Km");
        System.out.println("Gasto por KM: " +Auto2.getCombustible()+ " " + "Litros");
       
        kmRecorridos= kmRecorridos*Auto1.getCombustible();
        kmRecorridos2= kmRecorridos2*Auto2.getCombustible();
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("COMPARACION ENTRE AUTOS");
        System.out.println("");
        System.out.println("Toyota gastó: "+kmRecorridos+ " Litros");
        System.out.println("Toyota Kilometraje: "+nuevoKilometraje+ " KM");
        System.out.println("");
        System.out.println("Nissan gastó: "+kmRecorridos2+ "Litros");
        System.out.println("Nissan Kilometraje: "+nuevoKilometraje2+ " KM");
        
        
        
    }


}
