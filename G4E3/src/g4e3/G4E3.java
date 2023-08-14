/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4e3;

/**
 *
 * @author Usuario
 */
public class G4E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(30);
        Rectangulo rectangulo1 = new Rectangulo(15 ,40);
        Rectangulo rectangulo2 = new Rectangulo(10,30);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        circulo2.calcularArea();
        circulo2.calcularPerimetro();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        rectangulo2.calcularArea();
        rectangulo2.calcularPerimetro();
    }
    
}
