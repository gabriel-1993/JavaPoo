/*
3) En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que es una
constante con el valor 3.14 y radio; un constructor que permita inicializar el radio del círculo; los
métodos “get” y “set” para radio y los siguientes métodos adicionales:
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del círculo.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Circulo con radio 5.75 ;
Luego utilizando sus métodos:
b) Mostrar por consola su perímetro
c) Mostrar por consola su superficie.
 */
package g1.pkg2.ejercicio3;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(5.75);
            System.out.println("Perimetro = "+ circulo1.calcularPerimetro());
            System.out.println("Area = "+circulo1.calcularArea());       
    }
}
