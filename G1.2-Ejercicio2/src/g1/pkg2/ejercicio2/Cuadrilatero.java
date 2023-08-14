
package g1.pkg2.ejercicio2;


public class Cuadrilatero {
    private int largo;
    private int alto;
    
    //constructor
    public Cuadrilatero (int largo,int alto){
     this.largo = largo ;
     this.alto=alto;
     }
    //getter setters
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    //metodo perimetro
    public  double calcularPerimetro(){
    double perimetro =(alto*2) + (largo*2);
        return perimetro;
    }
    
    public  int calcularArea(){
    int area= largo*alto;
        return area;
    }
    
    public boolean esUnCuadrado(){
        return alto == largo;
    }
    

}