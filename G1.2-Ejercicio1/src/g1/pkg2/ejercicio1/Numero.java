/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Numero {
    private int nro;
    
     public Numero (int nro){
     this.nro = nro ;
     }

    public int getValor() {
        return nro;
    }

    public void setValor(int nro) {
        this.nro = nro;
    }
     
   public boolean esPar(){
        return this.nro % 2 == 0;
    }
   public boolean esPositivo(){
        return this.nro > -1;
    }
   
    public boolean esMultiploDe(int num2){
        return num2%this.nro==0;
    }
}
