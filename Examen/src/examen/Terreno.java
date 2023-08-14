/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Usuario
 */
public class Terreno extends Propiedad{
    private int area;
    
    
    public Terreno(String nombre, double precio, int stock,int area){
        super(nombre,precio,stock);
                this.area=area;
                
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
      @Override
    public void calcularPrecioTotal(){
        if(this.stock>10){
            double descuento= 7 / 100;
            descuento= descuento * this.getPrecio();
            this.setPrecio(descuento);
                            System.out.println("El precio es total con descuento es:"+ this.precio);    

        }

        };
}
