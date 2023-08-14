
package g4e2;


public class Televisor extends Electrodomestico{
    protected double resolucion;
    protected boolean sintonizadorTDT;

//constructor vacio:    
public Televisor(){};

//constructor inicializado:
public Televisor(int precio, String color, char consumoElectrico, int peso,double resolucion,boolean sintonizadorTDT){
      super(precio,color,consumoElectrico,peso);
      this.resolucion= resolucion;
      this.sintonizadorTDT=sintonizadorTDT;
}

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    protected void precioFinal(){
    int pConsumo=0;
    int pPeso=0;
    int pTdt=0;
    double total=0;
    char letra;
     if (this.sintonizadorTDT==true){
    pTdt=500;}
     letra=Character.toUpperCase(consumoElectrico) ;
      switch (letra){
        
        case 'A': pConsumo=1000;
        break;
        
        case 'B': pConsumo=800;
        break;
       
        case 'C': pConsumo=600;
        break;
       
        case 'D': pConsumo=500;
        break;
        
        case 'E': pConsumo=300;
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
   
    while(this.getResolucion() > 40){
    total=this.getPrecio()*1.3;
    total= total+pPeso+pConsumo+pTdt;
    //aumento el 30%.  NO FUNCA EL AUMENTOOOOOOO y se imprime tambien el total fuera de este while U.U :
    System.out.println("Televisor{" + "color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso +"KG "+ "SintonizadorTDT= "+sintonizadorTDT+ " resolucion en pulgadas= "+resolucion+ " <--Precio Final = $ "+ total);
           break;
    }
   if(this.getResolucion()<=40){
           total= this.getPrecio()+pPeso+pConsumo+pTdt;
 System.out.println("Televisor{" + "color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso +"KG "+ ",SintonizadorTDT= "+sintonizadorTDT+ ", resolucion en pulgadas= "+resolucion+ " <--Precio Final = $ "+ total);   }
}

}
