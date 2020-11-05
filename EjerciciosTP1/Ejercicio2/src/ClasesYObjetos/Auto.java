
package ClasesYObjetos;


public class Auto {
    private String Marca;
    private String Modelo;
    private double Combustible;
    private double Kilometraje;
    


    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setCombustible(double Combustible) {
        this.Combustible = Combustible;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getCombustible() {
        return Combustible;
    }

    public double getKilometraje() {
        return Kilometraje;
    }
    

}
