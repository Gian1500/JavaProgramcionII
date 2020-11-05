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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nDni;
        int opcion, opcion2, comprobador;
        float transferencia;
        float abono , recibo;
        
        Scanner teclado = new Scanner(System.in);
        
        Persona cliente1=new Persona(0,"BANCO NACION");
        
        Cuenta cuenta1=new Cuenta(149840,0);
        
        Cuenta cuenta2=new Cuenta(189121,1200);
        
        System.out.println("Ingrese su Numero de DNI");
        nDni=teclado.nextInt();
        
        cliente1.setDni(nDni);
        
        comprobador=0;
       do{
            System.out.println("Ingrese la opcion que desea");
            System.out.println("1)Pagar Recibo");
            System.out.println("2)Transferencia");
            System.out.println("3)Ingresar Abono");
            System.out.println("4)Consultar estado y Saldo disponible");
            System.out.println("5)SALIR");

            opcion=teclado.nextInt();

            

            switch(opcion){
                case 1:

                    System.out.println("Ingrese la cantidad de dinero a pagar");
                    recibo=teclado.nextFloat();
                    do{
                    System.out.println("Pagar con cuenta1 o cuenta2 (Presione 1 o 2)");
                    opcion2=teclado.nextInt();
                        if(opcion2==1)
                            cuenta1.setSaldoDisponible(cuenta1.getSaldoDisponible()-recibo);
                        else if (opcion2==2)
                            cuenta2.setSaldoDisponible(cuenta2.getSaldoDisponible()-recibo);
                        else
                            System.out.println("Opcion incorrecta");


                    }while(opcion2<=0 || opcion2>2);

                    if ((cuenta1.getSaldoDisponible()<0) || (cuenta2.getSaldoDisponible()<0))
                        comprobador=1;
                    else 
                        comprobador=0;
                    
                    
                    break;




                case 2:

                    System.out.println("Ingrese la cantidad de dinero que quiera transferir:");
                    transferencia=teclado.nextFloat();
                    
                    do{
                    System.out.println("1)Tranferir de cuenta1 a cuenta2");
                    System.out.println("2)Tranferir de cuenta2 a cuenta1");
                    opcion2=teclado.nextInt();
                       
                        if(opcion2==1 && cuenta1.getSaldoDisponible()>0 && cuenta1.getSaldoDisponible()<=transferencia){
                            cuenta1.setSaldoDisponible(cuenta1.getSaldoDisponible()-transferencia);
                            cuenta2.setSaldoDisponible(cuenta2.getSaldoDisponible()+transferencia);}
                        else if (opcion2==2 && cuenta2.getSaldoDisponible()>0 && cuenta2.getSaldoDisponible()<=transferencia){
                            cuenta2.setSaldoDisponible(cuenta2.getSaldoDisponible()-transferencia);
                            cuenta1.setSaldoDisponible(cuenta1.getSaldoDisponible()+transferencia);}
                        else
                            System.out.println("Opcion incorrecta o datos erroneos...Reintente");


                    }while(opcion2<=0 || opcion2>2);
                    
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad de dinero");
                    abono=teclado.nextFloat();
                    do{
                    System.out.println("Acreditar a cuenta1 o cuenta2 (Presione 1 o 2)");
                    opcion2=teclado.nextInt();
                        if(opcion2==1)
                            cuenta1.setSaldoDisponible(cuenta1.getSaldoDisponible()+abono);
                        else if (opcion2==2)
                            cuenta2.setSaldoDisponible(cuenta2.getSaldoDisponible()+abono);
                        else
                            System.out.println("Opcion incorrecta");

                    }while(opcion2<=0 || opcion2>2);
                    
                    break;

                case 4:
                    System.out.println("-----------------------------------------");
                    System.out.println("|DATOS DEL CLIENTE|");
                    System.out.println("DNI: " + cliente1.getDni());
                    System.out.println("Banco al que pertenece: " + cliente1.getnCuenta());
                    System.out.println("|CUENTAS ASOCIADAS|" );
                    System.out.println("Cuenta N°1: " + cuenta1.getNumeroCuenta()+ " (numero de identificacion");
                    System.out.println("Saldo Disponible Cuenta N°1: $ " + cuenta1.getSaldoDisponible());
                    System.out.println("Cuenta N°2: " + cuenta2.getNumeroCuenta()+ " (numero de identificacion");
                    System.out.println("Saldo Disponible Cuenta N°2: $ " + cuenta2.getSaldoDisponible());
                    if(cliente1.personaMorosa(comprobador)==1)
                        System.out.println("ESTADO: Persona Morosa");
                    else if (cliente1.personaMorosa(comprobador)==2)
                        System.out.println("ESTADO: Persona NO Morosa");
                    
                    break;
                    

            }
        System.out.println("-----------------------------------------");
      }while(opcion!=5); 
    }
    
}
