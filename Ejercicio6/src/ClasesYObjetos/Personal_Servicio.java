
package ClasesYObjetos;

import java.util.Scanner;

public class Personal_Servicio extends Universidad {
    
    Scanner teclado = new Scanner(System.in);
    private String seccion;
    private String nDespacho;
    private String añoIncorpo;

    public Personal_Servicio(String seccion, String nDespacho, String añoIncorpo, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
        this.nDespacho = nDespacho;
        this.añoIncorpo = añoIncorpo;
    }



    @Override
    public void cargarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.print("Ingrese el nombre del Personal: ");
        nombre=teclado.nextLine();
            
        System.out.print("Ingrese el Apellido del Personal: ");
        apellido=teclado.nextLine();
         
        System.out.print("Ingrese el DNI del Personal: ");
        dni=teclado.nextLine();
                    
        System.out.print("Ingrese el estado civil del Personal: ");
        estadoCivil=teclado.nextLine();
        
        System.out.print("Ingrese el año de incorportacion del Personal: ");
        añoIncorpo=teclado.nextLine();
        
        System.out.print("Ingrese el N° de despacho del Personal: ");
        nDespacho=teclado.nextLine();
                    
        System.out.print("Ingrese la Seccion a la que pertenece el Personal: ");
        seccion=teclado.nextLine();
        System.out.println("|--------------------------------------------|");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("|--------------------------------------------|");
        System.out.println("|DATOS DEL PERSONAL|");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Estado Civil: "+estadoCivil);
        System.out.println("Año de Incorporacion: "+añoIncorpo);
        System.out.println("N° de despacho: "+nDespacho);
        System.out.println("Seccion: "+seccion);
        System.out.println("|--------------------------------------------|");
    }
    
}
