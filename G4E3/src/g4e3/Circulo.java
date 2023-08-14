
package g4e3;

public class Circulo implements calculosFormas {
    private int radioCir;
    
public Circulo(int radioCir){
    this.radioCir=radioCir;
}    

    public int getRadioCir() {
        return radioCir;
    }

    public void setRadioCir(int radioCir) {
        this.radioCir = radioCir;
    }
        
 @Override   
public void calcularArea(){
    double area=0;
// Área circulo: PI * radio ^ 2
area= PI*(this.radioCir * this.radioCir);
     System.out.println("Area circulo = "+area);
};

@Override
public void calcularPerimetro(){
    //Perímetro circulo: PI * diámetro
    double perimetro;
    int diametro= this.radioCir*2;
    perimetro= PI*diametro;
    System.out.println("Perimetro circulo = "+perimetro);
}


}
    

