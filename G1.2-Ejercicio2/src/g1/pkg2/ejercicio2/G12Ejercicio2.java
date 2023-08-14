/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio2;


/**
 *
 * @author Usuario
 */
public class G12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrilatero primerCuadri = new Cuadrilatero(50,70);
        System.out.println("Perimetro = "+ primerCuadri.calcularPerimetro()); 
        System.out.println("Area = "+primerCuadri.calcularArea()); 
        System.out.println("¿Es un cuadrado? : "+ primerCuadri.esUnCuadrado());
        primerCuadri.setAlto(50);
        System.out.println("Alto vale 70,se pisa con el valor de 50");
        System.out.println("¿Es un cuadrado? : "+ primerCuadri.esUnCuadrado());
    }   
}
