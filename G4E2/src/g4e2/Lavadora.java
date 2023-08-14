
package g4e2;

public class Lavadora extends Electrodomestico {
        protected int carga;
        
//constructor vacio:
  public Lavadora(){};
  
//constructor inicializado:
  public Lavadora(int precio, String color, char consumoElectrico, int peso,int carga){
      super(precio,color,consumoElectrico,peso);
      this.carga=carga;   
  }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    
    @Override
    protected void precioFinal(){
    int pConsumo=0;
    int pPeso=0;
    int pCarga=0;
    int total=0;
    //
    if (this.getCarga() >30){
    pCarga=500;}
    //  
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
    total=pConsumo+pPeso+ pCarga+this.getPrecio();
    System.out.println("Lavadora{" + "color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso+"KG" +", carga= "+carga+"KG" + " <-- Precio Final = $ "+ total);

}
}
