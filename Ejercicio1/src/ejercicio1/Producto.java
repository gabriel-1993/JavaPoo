package ejercicio1;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
//constructor asignando argumentos
public Producto(int codigo, String descripcion, double precio, int stock){
            this.codigo=codigo;
            this.descripcion=descripcion;
            this.precio=precio;
            this.stock=stock;  
    }
   
    //get a cada propiedad para poder ver su valor
    public int getCodigo(){
        return codigo; }
     public String getDescripcion(){
        return descripcion; }
     public double getPrecio(){
        return precio; }
     public int getStock(){
        return stock;}
    //Set para poder editar los datos
    public void setCodigo(int codigo){
    this.codigo= codigo;
    }
    public void setDescripcion(String descripcion){
    this.descripcion= descripcion;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    } 
    public void setStock(int stock){
        this.stock= stock;
    }
            
    //metodo main
    
    
            
}
