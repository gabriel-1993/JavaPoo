/*
 6) En un nuevo proyecto, crear una clase de nombre Triangulo con los atributos: lado1, lado2,
lado3; un constructor que permita inicializar sus atributos; los métodos getter y setter; y los
siguientes métodos adicionales:

 esUnTriangulo(): Sabiendo que la regla principal que da origen al triángulo tiene que ver
con la longitud de sus lados. Esta plantea que la suma de dos de sus lados debe ser mayor
a la longitud del tercer lado. Por lo tanto si los valores de los lados de este triángulo
cumplen con la regla este método retornará true caso contrario false.
 tipoTriangulo(): Si es un triángulo y tiene sus tres lados iguales, este método retornará
equilátero; si sus tres lados son distintos, retornará “escaleno”; caso contrario, es decir, si
sólo dos de sus lados son iguales, retornará “isósceles”; en el caso de que no sea un
triángulo, retornará “Con sus lados no se puede representar un triángulo!!!”
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Triángulo válido.

Luego utilizando sus métodos:

b) Mostrar por consola que tipo de triángulo es.
c) Crear un objeto Triángulo inválido.

Luego utilizando sus métodos:

d) Mostrar por consola que tipo de triangulo es.
 */
package g1.pkg2.ejercicio6;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tresAngulos = new Triangulo(15,15,20);
        System.out.println("¿Es un triangulo?:"+tresAngulos.esUnTriangulo());
        System.out.println("Tipo de angulo: "+ tresAngulos.tipoTriangulo());
        Triangulo xTresAngulos = new Triangulo(15,15,1000);
        System.out.println("¿Es un triangulo?:"+xTresAngulos.esUnTriangulo());
        System.out.println("Tipo de angulo: "+ xTresAngulos.tipoTriangulo());
    }
    
}
