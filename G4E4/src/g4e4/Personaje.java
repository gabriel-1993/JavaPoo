
package g4e4;


public abstract class Personaje {
protected Position ubicacion;
protected String nick;
protected int vidas;
protected int energia;
protected char orientacion;

public Personaje(Position ubicacion, String nick){
    this.ubicacion=ubicacion;
    this.nick=nick;
    this.vidas=3;
    this.energia=100;
    this.orientacion='N';
}

public void disparar(int cantidad){
    while(this.energia>= 10){
        this.energia= this.energia -10;
        System.out.println("Disparo realizado. (Energia: "+this.energia);
    }
    System.out.println("Energia baja,no se pudo disparar");
}

public void girar(){
    if(this.orientacion=='N'){this.orientacion='E';
        System.out.println("Giro su orientacion a 'E' ");}
    else if (this.orientacion=='E'){this.orientacion='S';
            System.out.println("Giro su orientacion a 'S' ");}
    else if (this.orientacion=='S'){this.orientacion='O';
        System.out.println("Giro su orientacion a 'O' ");}
    else if (this.orientacion=='O'){this.orientacion='N';
        System.out.println("Giro su orientacion a 'N' ");}
}    


public void avanzar(){
    switch (this.orientacion) {
        case 'N':
            this.ubicacion.setY(this.ubicacion.getY()+1);
            break;
        case 'S':
            this.ubicacion.setY(this.ubicacion.getY()-1);
            break;
        case 'E':
            this.ubicacion.setX(this.ubicacion.getX()+1);
            break;
        case 'O':
            this.ubicacion.setX(this.ubicacion.getX()-1);
            break;
        default:
            break;
    }
    
}



}
