
package examen;

/**
 *
 * @author Usuario
 */
public abstract class Propiedad{ 
 protected String nombre;
 protected double precio;
 protected int stock;
 
 public Propiedad(String nombre,Double precio, int stock){
     this.nombre=nombre;
     this.precio=precio;
     this.stock=stock;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void calcularPrecioTotal(){
        System.out.println("El precio es total es:"+ this.precio);    
            
    }
 
}