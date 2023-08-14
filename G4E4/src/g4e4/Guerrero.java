
package g4e4;


public class Guerrero extends Personaje {
    
    private boolean caballo;
    
    public Guerrero(Position ubicacion, String nick, boolean caballo){
      super(ubicacion,nick);
      this.caballo=caballo;
      
  }
    
    @Override
    public void avanzar(){
        int cantidadPasos;
            if(this.caballo==true){
                cantidadPasos=10;
            }else{cantidadPasos=1;}

         switch (this.orientacion) {
        case 'N':
            this.ubicacion.setY(this.ubicacion.getY()+cantidadPasos);
            break;
        case 'S':
            this.ubicacion.setY(this.ubicacion.getY()-cantidadPasos);
            break;
        case 'E':
            this.ubicacion.setX(this.ubicacion.getX()+cantidadPasos);
            break;
        case 'O':
            this.ubicacion.setX(this.ubicacion.getX()-cantidadPasos);
            break;
        default:
            break;
    }
    }
    
    @Override 
    public void disparar(int cantidad){
        int contador=1;
        if(this.energia<30){this.caballo=false;}
        
    while(this.energia>= 10 && contador<=cantidad ){
        this.energia= this.energia -10;
        System.out.println("Disparo realizado. (Energia: "+this.energia);
        contador++;
    }
    if(contador<=cantidad && this.energia==0){
    System.out.println("Energia baja,no se pudo disparar");}
}
    
}
