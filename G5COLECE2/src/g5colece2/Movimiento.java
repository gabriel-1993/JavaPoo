
package g5colece2;

import java.time.LocalDate;


public class Movimiento {
    protected LocalDate fecha;
    protected char tipo;
    protected double importe;
    protected double saldo;
    
    public Movimiento(LocalDate fecha,char tipo,double importe,double saldo){
        this.fecha=fecha;
        this.tipo=tipo;
        this.importe=importe;
        this.saldo=saldo;
    }
    
    
}
