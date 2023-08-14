
package g4e2;

public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumoElectrico;
    protected int peso;
    
    public Electrodomestico(){}

    public Electrodomestico(int precio, String color, char consumoElectrico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    comprobarConsumoEnergico(consumoElectrico);
    comprobarColor(color);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        comprobarConsumoEnergico(consumoElectrico);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

private void comprobarConsumoEnergico(char letra){ 
if('a'==letra || 'b'==letra || 'c'==letra || 'd'==letra ||'e'==letra|| 'A'==letra || 'B'==letra || 'C'==letra || 'D'==letra || 'E'==letra)
{this.consumoElectrico=letra;}
else {this.consumoElectrico='f';}
}    

private void comprobarColor(String color1){
    color1=color1.toLowerCase();
    if("negro".equals(color1) || "rojo".equals(color1) || "azul".equals(color1) || "gris".equals(color1)){this.color=color1;}
    else{this.color="blanco";}
}
protected void precioFinal(){
    int pConsumo=0;
    int pPeso=0;
    int total=0;
    switch (this.getConsumoElectrico()){
        case 'a': pConsumo= 1000;
        break;
        case 'A': pConsumo=1000;
        break;
        case 'b': pConsumo=800;
        break;
        case 'B': pConsumo=800;
        break;
        case 'c': pConsumo=600;
        break;
        case 'C': pConsumo=600;
        break;
        case 'd': pConsumo=500;
        break;
        case 'D': pConsumo=500;
        break;
        case 'e': pConsumo=300;
        break;
        case 'E': pConsumo=300;
        break;
        case 'f': pConsumo=100;
        break;
        case 'F': pConsumo=100;
        break;
    }
    
    if(this.getPeso() >0 && this.getPeso() <=19){
        pPeso=100;
    }else if(this.getPeso()>19 && this.getPeso() <=49){
        pPeso=500;
    }else if(this.getPeso()>49 && this.getPeso() <=79){
        pPeso=800;
    }else if(this.getPeso()>79){
    pPeso=1000;
    }
    total=pConsumo+pPeso+this.getPrecio();
    System.out.println("Electrodomestico{" + "color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + " <--Precio Final = $ "+ total);
}

   



}
