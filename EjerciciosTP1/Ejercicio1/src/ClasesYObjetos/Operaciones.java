
package ClasesYObjetos;

import java.util.Scanner;


public class Operaciones {
      //Atributos
    Scanner entrada= new Scanner(System.in);
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    float division;


    //Metodos
    public void leerNumeros(){
        
        numero1= entrada.nextInt();
        numero2= entrada.nextInt();
            
    }
    
    public void sumar(){
        suma= numero1+numero2;
    }
    
    public void restar(){
        if(numero1<numero2){
            do{
                System.out.println("-ERROR- Recuerde que el primer numero debe ser mayor al segundo, Reingrese los datos");
                numero1 = entrada.nextInt();
                numero2 = entrada.nextInt();
                
            }while(numero1<numero2);
        }
        resta=numero1-numero2;
    }
    
    public void multiplicar(){
        multiplicacion= numero1*numero2;
    }
    
    public void dividir(){
        if (numero2==0){
           do{
                System.out.println("-ERROR- No es posible la division entre 0. Reingrese los datos");
                numero1 = entrada.nextInt();
                numero2 = entrada.nextInt();
                
           }while(numero2==0);
        }
        division= numero1/numero2;
    }
    
    public void mostrarSuma(){
        System.out.println("El resultado de la suma es: " + suma); 
    }
    
     public void mostrarResta(){
        System.out.println("El resultado de la resta es: " + resta); 
    }
     
     public void mostrarMultiplicacion(){
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion); 
    }
       
     public void mostrarDivision(){
        System.out.println("El resultado de la division es: " + division); 
    }
       
           
 
}

