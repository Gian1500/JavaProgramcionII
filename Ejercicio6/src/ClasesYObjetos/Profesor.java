
package ClasesYObjetos;

import java.util.Scanner;


public class Profesor extends Universidad {
    
    Scanner teclado = new Scanner(System.in);
    private String departamento;
    private String nDespacho;
    private String añoIncorpo;

    public Profesor(String departamento, String nDespacho, String añoIncorpo, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
        this.nDespacho = nDespacho;
        this.añoIncorpo = añoIncorpo;
    }


    @Override
    public void cargarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.print("Ingrese el nombre del Profesor: ");
        nombre=teclado.nextLine();
            
        System.out.print("Ingrese el Apellido del Profesor: ");
        apellido=teclado.nextLine();
         
        System.out.print("Ingrese el DNI del Profesor: ");
        dni=teclado.nextLine();
                    
        System.out.print("Ingrese el estado civil del Profesor: ");
        estadoCivil=teclado.nextLine();
        
        System.out.print("Ingrese el año de incorportacion del Profesor: ");
        añoIncorpo=teclado.nextLine();
        
        System.out.print("Ingrese el N° de despacho del Profesor: ");
        nDespacho=teclado.nextLine();
                    
        System.out.print("Ingrese el Departamento al que pertenece el Profesor: ");
        departamento=teclado.nextLine();
        System.out.println("|--------------------------------------------|");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.println("|DATOS DEL PROFESOR|");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Estado Civil: "+estadoCivil);
        System.out.println("Año de Incorporacion: "+añoIncorpo);
        System.out.println("N° de despacho: "+nDespacho);
        System.out.println("Departamento: "+departamento);
        System.out.println("|--------------------------------------------|");
    }
}
