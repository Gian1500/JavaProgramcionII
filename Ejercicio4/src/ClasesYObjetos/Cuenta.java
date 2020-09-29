
package ClasesYObjetos;


public class Cuenta {
    
    private int numeroCuenta;
    private float saldoDisponible;

    public Cuenta(int numeroCuenta, float saldoDisponible) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
    }
    
    public void consultarSueldo(){
    
        System.out.println("El sueldo Disponible es de: $ "+saldoDisponible);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible ;
        
    }
    
    

}
