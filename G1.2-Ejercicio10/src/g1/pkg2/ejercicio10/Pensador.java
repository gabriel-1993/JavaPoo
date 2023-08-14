/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio10;

/**
 *
 * @author Usuario
 */
public class Pensador {
    private int n ;
    
    public Pensador(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int invertir(){
        int n1, n2,n3;
        n1= this.n % 10;    
        n2=this.n/10;
        n2=n2%10;
        n1=n1*10+n2;
        n3=this.n/10;
        n3=this.n/10;
        n3=n3/10;
        n1=n1*10+n3;
        return n1;
    }
    public int parAntes(){
        int r;
        r= this.n-1;
        if(r%2==0){return n-1;}
        else {r=this.n-2;}
        return r;
    }
     public int parPosterior(){
        int r;
        r= this.n+1;
        if(r%2==0){return n+1;}
        else {r=this.n+2;}
        return r;
    }
     //funciona con numeros de 3 cifras
     public int primerDigito(){
        int r;
        r=this.n / 10;
        r=r/10;
         return r;
     }
     //funciona con numeros de 3 cifras
      public int ultimoDigito(){
         int r;
         r=this.n % 10;
         return r;
     }
}
