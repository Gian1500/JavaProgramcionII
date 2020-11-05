
package ClasesYObjetos;

import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
        
        int opcion;
        
        Estudiante estudiante1 = new Estudiante("","","","");
        Profesor profesor1= new Profesor("","","","","","","");
        Personal_Servicio personal1= new Personal_Servicio("","","","","","","");
        
        
        Scanner teclado = new Scanner(System.in);
        
        do{
        
            System.out.flush();
            System.out.println("|SISTEMA DE REGISTRO|");
            System.out.println("Elija una opcion: ");
            System.out.println("");
            System.out.println("|REGISTRO|");
            System.out.println("1) Registrar estudiante");
            System.out.println("2) Registrar profesor");
            System.out.println("3) Registrar personal de servicio");
            System.out.println("|CONSULTAS|");
            System.out.println("4) Consultar datos de estudiante");
            System.out.println("5) Consultar datos de profesor");
            System.out.println("6) Consultar datos de personal de servicio");
            System.out.println("7) SALIR");

            opcion=teclado.nextInt();

            switch (opcion){

                case 1:
                    estudiante1.cargarDatos();
                    break;

                case 2:
                    profesor1.cargarDatos();
                    break;

                case 3:
                    personal1.cargarDatos();
                    break;

                case 4:
                    estudiante1.mostrarDatos();
                    break;

                case 5:
                    profesor1.mostrarDatos();
                    break;

                case 6:
                    personal1.mostrarDatos();
                    break;
                        
            }
        }while(opcion!=7);          
    }
}
    

