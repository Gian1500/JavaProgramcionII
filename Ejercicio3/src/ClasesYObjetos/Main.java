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
    public static void main (String [] Args){
        
        
        Scanner teclado=new Scanner(System.in);
        Rectangulo rec1 = new Rectangulo(0f,0f);
        Rectangulo rec2 = new Rectangulo(0f,0f);
        Rectangulo rec3 = new Rectangulo(0f,0f);

        
        System.out.println(" |BIENVENIDO AL PROGRAMA|");
        System.out.println("");
        System.out.println(" |RECTANGULO 1|");
        do{
            
            System.out.println("Base: ");
            rec1.base=teclado.nextFloat();
            System.out.println("Altura: ");
            rec1.altura=teclado.nextFloat(); 
            
            if (rec1.base <=0 || rec1.altura <= 0){
                System.out.println("-ERROR-, los valores ingresados no pueden ser negativos o iguales a 0");
                System.out.println("Reingrese los datos");
              }
            
        }while (rec1.base <=0 || rec1.altura <= 0);
        
        if (rec1.base <=0 || rec1.altura <= 0){
            System.out.println("-ERROR-, los valores ingresados no pueden ser negativos o iguales a 0");
            System.out.println("Reingrese los datos");
        }
        
        System.out.println("");
        System.out.println(" |RECTANGULO 2|");
        
        
        do{
            
            System.out.println("Base: ");
            rec2.base=teclado.nextFloat();
            System.out.println("Altura: ");
            rec2.altura=teclado.nextFloat(); 
            
            if (rec2.base <=0 || rec2.altura <= 0){
                System.out.println("-ERROR-, los valores ingresados no pueden ser negativos o iguales a 0");
                System.out.println("Reingrese los datos");
              }
            
        }while (rec2.base <=0 || rec2.altura <= 0);
        
        
        
        System.out.println("");
        System.out.println(" |RECTANGULO 3|");
        
        do{
            
            System.out.println("Base: ");
            rec3.base=teclado.nextFloat();
            System.out.println("Altura: ");
            rec3.altura=teclado.nextFloat(); 
            
            if (rec3.base <=0 || rec3.altura <= 0){
                System.out.println("-ERROR-, los valores ingresados no pueden ser negativos o iguales a 0");
                System.out.println("Reingrese los datos");
              }
            
        }while (rec3.base <=0 || rec3.altura <= 0);
        
        System.out.println("-------------------------------");
        System.out.println("|PERIMETROS Y AREAS|");
        System.out.println("Rectangulo 1");
        System.out.println("Perimetro: "+ rec1.calcularPerimetro());
        System.out.println("Area: "+ rec1.calcularArea());
        
        System.out.println("");
        System.out.println("Rectangulo 2");
        System.out.println("Perimetro: "+ rec2.calcularPerimetro());
        System.out.println("Area: "+ rec2.calcularArea());
        
        System.out.println("");
        System.out.println("Rectangulo 3");
        System.out.println("Perimetro: "+ rec3.calcularPerimetro());
        System.out.println("Area: "+ rec3.calcularArea());
        
        //CONDICIONES PARA MAYOR PERIMETRO Y AREA
        
        System.out.println("-------------------------------");
        System.out.println("|MAYOR PERIMETRO Y AREA|");
        
        if(rec1.calcularPerimetro()>rec2.calcularPerimetro()&& rec1.calcularPerimetro()>rec3.calcularPerimetro()){
             System.out.println("Mayor Perimetro: Rectangulo 1");}
       
        else if (rec2.calcularPerimetro()>rec1.calcularPerimetro()&& rec2.calcularPerimetro()>rec3.calcularPerimetro()){
             System.out.println("Mayor Perimetro: Rectangulo 2");
        }
        
        else if (rec3.calcularPerimetro()>rec1.calcularPerimetro()&& rec3.calcularPerimetro()>rec2.calcularPerimetro()){
            System.out.println("Mayor Perimetro: Rectangulo 3");
        }
        
        
        if(rec1.calcularArea()>rec2.calcularArea()&& rec1.calcularArea()>rec3.calcularArea()){
             System.out.println("Mayor Area: Rectangulo 1");}
       
        else if (rec2.calcularArea()>rec1.calcularArea()&& rec2.calcularArea()>rec3.calcularArea()){
             System.out.println("Mayor Area: Rectangulo 2");
        }
        
        else if (rec3.calcularArea()>rec1.calcularArea()&& rec3.calcularArea()>rec2.calcularArea()){
            System.out.println("Mayor Area: Rectangulo 3");}
        
    }
}

