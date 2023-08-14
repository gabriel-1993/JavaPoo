
package g4e3;


public class Rectangulo  implements calculosFormas  {
        private int base;
        private int altura;
            
public Rectangulo(int base,int altura){
    this.base=base;
    this.altura=altura;
}    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
        
        
 @Override   
public void calcularArea(){
    double area=0;
// Área circulo: PI * radio ^ 2
area= this.base * this.altura;
     System.out.println("Area rectangulo = "+area);
};

@Override
public void calcularPerimetro(){
    //Perímetro circulo: PI * diámetro
    double perimetro;
    perimetro= (this.base*2) + (this.altura*2);
    System.out.println("Perimetro rectangulo = "+perimetro);
}

}
