
package ClasesYObjetos;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int opcion;
        Piso piso1=new Piso(0,"",0f,0,0f);
        Local local1=new Local(0,"",0f,0,0f);
        
        do{
            System.out.println("|SISTEMA INMOBILIARIA|");
            System.out.println("Elija una opcion....");
            System.out.println("1)Calcular valor de un PISO");
            System.out.println("2)Calcular valor de un LOCAL");
            System.out.println("3)SALIR");

            opcion=teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("|PISO|");
                    teclado.nextLine();

                    System.out.println("|----------------------------------------------------|");
                    System.out.print("Ingrese la direccion del piso: ");
                    piso1.setDireccion(teclado.nextLine());

                    System.out.print("Ingrese el numero de metros cuadrados que tiene el piso: ");
                    piso1.setMetrosCuadrados(teclado.nextFloat());

                    System.out.print("Ingrese la cantidad de años que tiene el piso: ");
                    piso1.setAñosInmueble(teclado.nextInt());

                    System.out.print("Ingrese en que piso se encuentra el inmueble: ");
                    piso1.setNumPiso(teclado.nextInt());

                    System.out.print("Ingrese el precio base del inmueble: ");
                    piso1.setPrecioBase(teclado.nextFloat());

                    System.out.println("|----------------------------------------------------|");

                    piso1.mostrarDatos();
                    System.out.println("|VALOR TOTAL DEL PISO|--> $" + piso1.calcularPrecioFinal());

                    break;

                case 2:
                    System.out.println("|LOCAL|");
                    teclado.nextLine();

                    System.out.println("|----------------------------------------------------|");
                    System.out.print("Ingrese la direccion del local: ");
                    local1.setDireccion(teclado.nextLine());

                    System.out.print("Ingrese el numero de metros cuadrados que tiene el local: ");
                    local1.setMetrosCuadrados(teclado.nextFloat());

                    System.out.print("Ingrese la cantidad de años que tiene el local: ");
                    local1.setAñosInmueble(teclado.nextInt());

                    System.out.print("Ingrese la cantidad de ventanas que tiene el inmueble: ");
                    local1.setNumVentanas(teclado.nextInt());

                    System.out.print("Ingrese el precio base del inmueble: ");
                    local1.setPrecioBase(teclado.nextFloat());

                    System.out.println("|----------------------------------------------------|");

                    local1.mostrarDatos();
                    System.out.println("|VALOR TOTAL DEL PISO|--> $" + local1.calcularPrecioFinal());

                    break;
                
                case 3:
                    System.out.println("SALIENDO...");
            }
        }while(opcion!=3);
        
        
        
    }
    
}
