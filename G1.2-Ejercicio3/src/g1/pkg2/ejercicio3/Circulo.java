/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio3;

/**
 *
 * @author Usuario
 */
//Atributos de la class
public class Circulo {
    private static final double PI =3.14 ;
    private double radio;
//Constructor    
public Circulo (double radio){
this.radio = radio;
}
//get y set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public  double calcularArea(){
        double area= PI* radio;
        return area;
    }
    public  double calcularPerimetro(){
    double perimetro =(2*PI)*radio;
        return perimetro;
    }
    
}
    
    
