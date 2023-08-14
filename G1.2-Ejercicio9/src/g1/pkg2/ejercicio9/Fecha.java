/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio9;

/**
 *
 * @author Usuario
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
     public Fecha(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
     
    public boolean esBisiesto(){
      return  this.año % 4==0 && this.año % 100 != 0;
    }
    
    public int calcularAños(int año2){
        int r = 0;
        if (this.año > año2){r=this.año - año2;}
        else if(this.año < año2){r=año2-this.año ;}
        return r;
    }
    
}
