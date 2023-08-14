
package ejercicio1;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod1 = new Producto (1011, "Taza grande cafe", 700.050, 8);
        System.out.println("El codigo del producto: "+prod1.getCodigo());
        System.out.println("El producto es un/a: "+prod1.getDescripcion());
        System.out.println("El precio es = "+prod1.getPrecio());
        System.out.println("El stock es = "+prod1.getStock());


        System.out.println("hola");

    }
    
}
