
package ClasesYObjetos;


public class Persona {
    private int dni;
    private String nCuenta;

    public Persona(int dni, String nCuenta) {
        this.dni = dni;
        this.nCuenta = nCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    
    public int personaMorosa(int comprobador){
      int Estado=0;
        if (comprobador==1)//morosa
            Estado=1;
        else if (comprobador==0)
            Estado=2;
      
       return Estado;
    }
    
}
