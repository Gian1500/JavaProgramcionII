/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author Gian
 */
public class Rectangulo {
    float base;
    float altura;
    
    
    //METODOS
    
    //CONSTRUCTOR

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularPerimetro(){
       return (base+altura)*2;
    }
    
     public float calcularArea(){
       return base*altura;
     }
    
}
