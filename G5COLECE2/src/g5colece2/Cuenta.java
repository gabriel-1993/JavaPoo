
package g5colece2;

import java.util.ArrayList;


public class Cuenta {
    protected long numero;
    protected double saldo;
    protected double interes;
    protected  Cliente titular  ;
    protected  ArrayList<Movimiento> movimientos ;
   
    
    public Cuenta(long numero,double saldo,double interes,Cliente titular){
        this.numero=numero;
        this.saldo=saldo;
        this.interes=interes;
        this.titular=titular;
        this.movimientos= new ArrayList();
    }
    
    
    
}
