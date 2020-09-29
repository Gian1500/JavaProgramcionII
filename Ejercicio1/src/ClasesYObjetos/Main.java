
package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Operaciones Ope1 = new Operaciones();
        Scanner entrada= new Scanner(System.in);
        int opcion;
        String nombre;
        
        do{
            System.out.println("Bienvenido al Programa");
            System.out.println("Ingrese su nombre...");
            nombre= entrada.nextLine();
            System.out.println("Ingrese los numeros a calcular");
            
            Ope1.leerNumeros();
        
            System.out.println("Elija una Operacion");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("0) SALIR");

            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1:
                    Ope1.sumar();
                    Ope1.mostrarSuma();
                    System.out.println("Su Nombre es: " + nombre);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    Ope1.restar();
                    Ope1.mostrarResta();
                    System.out.println("Su Nombre es: " + nombre);
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    Ope1.multiplicar();
                    Ope1.mostrarMultiplicacion();
                    System.out.println("Su Nombre es: " + nombre);
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    Ope1.dividir();
                    Ope1.mostrarDivision();
                    System.out.println("Su Nombre es: " + nombre);
                    System.out.println("----------------------------------------------------");
                    break;
                case 0:
                    System.out.println("SALIENDO...........");
                    
            }
            
            entrada.nextLine(); //FLUSH DEL BUFFER
           

        }while(opcion!=0);
        
    }
    
}
