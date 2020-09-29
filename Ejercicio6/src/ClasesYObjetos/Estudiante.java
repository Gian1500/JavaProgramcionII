
package ClasesYObjetos;

import java.util.Scanner;

public class Estudiante extends Universidad {
   
    Scanner teclado = new Scanner(System.in);
    private String curso;

    public Estudiante(String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso="";
    }

    
    
    @Override
    public void cargarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.print("Ingrese el nombre del Alumno: ");
        nombre=teclado.nextLine();
            
        System.out.print("Ingrese el apellido del Alumno: ");
        apellido=teclado.nextLine();
         
        System.out.print("Ingrese el DNI del Alumno: ");
        dni=teclado.nextLine();
                    
        System.out.print("Ingrese el estado civil del Alumno: ");
        estadoCivil=teclado.nextLine();
        
        System.out.print("Ingrese el curso del Alumno: ");
        curso=teclado.nextLine();
       
    }

    @Override
    public void mostrarDatos() {
       
        System.out.println("|--------------------------------------------|");

        System.out.println("|DATOS DEL ALUMNO|");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Estado Civil: "+estadoCivil);
        System.out.println("Curso: "+curso);
        
        System.out.println("|--------------------------------------------|");
    }
}
