/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class Principal {

    public static void main(String[] args) {
        
        int opcion;
        ArrayList<Productos> productos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        try{
            do{
            
                System.out.println("|PROGRAMA DE CONTROL DE PRODUCTOS|");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                System.out.println("Elija la opcion que desea");
                System.out.println("1)Agregar Producto");
                System.out.println("2)Quitar Producto");
                System.out.println("3)Ver todos los Productos registrados");
                System.out.println("4)SALIR");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

                opcion= entrada.nextInt();

                switch(opcion){

                    case 1:

                        Productos productoNuevo = new Productos();

                        System.out.println("|REGISTRO DE PRODUCTO|");

                        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        System.out.println("PRODUCTO N°"+ (productos.size()+1));
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre del Producto: ");
                        productoNuevo.setNombre(entrada.nextLine());
                        System.out.print("Ingrese el codigo del Producto: ");
                        productoNuevo.setCodigo(entrada.nextInt());
                        System.out.print("Ingrese el stock del Producto: ");
                        productoNuevo.setStock(entrada.nextInt());
                        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

                        productos.add(productoNuevo);
                        break;

                    case 2:
                        System.out.println("|ELIMINACION DE PRODUCTO|");
                        System.out.println("Ingrese el N° de registro del producto a ELIMINAR");
                        productos.remove(entrada.nextInt()-1);
                        break;

                    case 3:
                        System.out.println("|PRODUCTOS REGISTRADOS|");

                        for(Productos p: productos){

                            if(p.getStock()<10){
                                System.out.println("PRODUCTO N°"+ (productos.indexOf(p)+1));
                                System.out.println("Nombre: " + p.getNombre());
                                System.out.println("Código: " + p.getCodigo());
                                System.out.println("Stock: " + p.getStock());
                                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                            }
                        }
                        break;
                    }
                }while(opcion!=4);
            }
        catch(java.util.InputMismatchException ex){
            System.out.println("-ERROR- NO se admiten caracteres, solo números"
                    + "en los codigos, stock y las opciones");
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
            System.out.println("CERRANDO....");
        }
      
  }
    
}
