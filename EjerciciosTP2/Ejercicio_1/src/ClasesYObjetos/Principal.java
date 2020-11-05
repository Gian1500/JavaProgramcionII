
package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        ArrayList<Profesores> profesores = new ArrayList<Profesores>();
        ArrayList<Personaldeservicio> personal = new ArrayList<Personaldeservicio>();
        try{
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
                System.out.println("4) Consultar datos de estudiantes");
                System.out.println("5) Consultar datos de profesores");
                System.out.println("6) Consultar datos de personal de servicio");
                System.out.println("|ELIMINACION|");
                System.out.println("7) Eliminar datos de estudiante");
                System.out.println("8) Eliminar datos de profesor");
                System.out.println("9) Eliminar datos de personal de servicio");

                System.out.println("10) SALIR");
            
            
                opcion=teclado.nextInt();
           
                switch (opcion){

                case 1:
                    Estudiantes estudianteX =new Estudiantes("","","","");
                            teclado.nextLine();
                            System.out.println("Ingrese el nombre");
                            estudianteX.setNombre(teclado.nextLine());
                            System.out.println("Ingrese el apellido");
                            estudianteX.setApellido(teclado.nextLine());
                            System.out.println("Ingrese el dni");
                            estudianteX.setDni(teclado.nextLine());
                            System.out.println("Ingrese el estado civil");
                            estudianteX.setEstadoC(teclado.nextLine());
                            System.out.println("Ingrese el curso");
                            estudianteX.setCurso(teclado.nextLine());
                            estudiantes.add(estudianteX);
                           
    
                    break;

                case 2:
                     Profesores profesorX = new Profesores("","","","");
                            teclado.nextLine();
                            System.out.println("Ingrese el nombre");
                            profesorX.setNombre(teclado.nextLine());
                            System.out.println("Ingrese el apellido");
                            profesorX.setApellido(teclado.nextLine());
                            System.out.println("Ingrese el dni");
                            profesorX.setDni(teclado.nextLine());
                            System.out.println("Ingrese el estado civil");
                            profesorX.setEstadoC(teclado.nextLine());
                            System.out.println("Ingrese el año de incorporacion");
                            profesorX.setAñoInc(teclado.nextLine());
                            System.out.println("Ingrese el departamento");
                            profesorX.setDepartamento(teclado.nextLine());
                            System.out.println("Ingrese el N° de despacho");
                            profesorX.setNumDespacho(teclado.nextLine());
                            profesores.add(profesorX);
                    break;

                case 3:
                    Personaldeservicio personalX = new Personaldeservicio("","","","");
                            teclado.nextLine();
                            System.out.println("Ingrese el nombre");
                            personalX.setNombre(teclado.nextLine());
                            System.out.println("Ingrese el apellido");
                            personalX.setApellido(teclado.nextLine());
                            System.out.println("Ingrese el dni");
                            personalX.setDni(teclado.nextLine());
                            System.out.println("Ingrese el estado civil");
                            personalX.setEstadoC(teclado.nextLine());
                            System.out.println("Ingrese el año de incorporacion");
                            personalX.setAñoInc(teclado.nextLine());
                            System.out.println("Ingrese la seccion");
                            personalX.setSeccion(teclado.nextLine());
                            System.out.println("Ingrese el N° de despacho");
                            personalX.setNumDespacho(teclado.nextLine());
                            personal.add(personalX);
                    
                    break;

                case 4:
                    System.out.println("1)Ver Todos  //  2) Ver Particular");
                   
                    if(teclado.nextInt()==2){
                        System.out.println("Ingrese el N° de registro a buscar");
                        estudiantes.get(teclado.nextInt()-1);
                    }
                    
                    estudiantes.forEach((e) -> {
                        System.out.println("Estudiante N°"+estudiantes.size());
                        System.out.println(e.MostrarDatos());
                        System.out.println("---------------------------------------------");
            });
                    break;

                case 5:
                    System.out.println("1)Ver Todos  //  2) Ver Particular");
                   
                    if(teclado.nextInt()==2){
                        System.out.println("Ingrese el N° de registro a buscar");
                        profesores.get(teclado.nextInt()-1);
                    }
                    
                    profesores.forEach((p) -> {
                        System.out.println("Profesor N°"+profesores.size());
                        System.out.println(p.MostrarDatos());
                        System.out.println("---------------------------------------------");
            });
                    break;

                case 6:
                    System.out.println("1)Ver Todos  //  2) Ver Particular");
                   
                    if(teclado.nextInt()==2){
                        System.out.println("Ingrese el N° de registro a buscar");
                        personal.get(teclado.nextInt()-1);
                    }
                    
                    personal.forEach((per) -> {
                        System.out.println("Personal de servicio N°"+personal.size());
                        System.out.println(per.MostrarDatos());
                        System.out.println("---------------------------------------------");
            });
                    break;
            
            
                case 7:
                    System.out.println("Ingrese el N° de registro del estudiante a ELIMINAR");
                    estudiantes.remove(teclado.nextInt()-1);
                    
                    break;        
                
                case 8:
                    System.out.println("Ingrese el N° de registro del profesor a ELIMINAR");
                    profesores.remove(teclado.nextInt()-1);
                    
                    break;     
                
                case 9:
                    System.out.println("Ingrese el N° de registro del personal de servicio a ELIMINAR");
                    personal.remove(teclado.nextInt()-1);
                    
                    break;     
                }
            }while(opcion!=10);
        }
        
        catch(java.util.InputMismatchException ex){
                System.out.println("-ERROR- letra ingresada en vez de numero");
            }
        
        catch(Exception e){
                e.printStackTrace();
            } 
        finally{
            System.out.println("REINICIE EL PROGRAMA PARA CARGAR NUEVAMENTE");
        }
    }
}
 
    

    


    

