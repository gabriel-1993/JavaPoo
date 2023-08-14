/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio7;

/**
 *
 * @author Usuario
 */
public class Robot {
    private int bateriaInicializado=500;
    private String nombre;
    
    public Robot(String nombre){
        this.nombre=nombre;
    }

    public int getBateriaInicializado() {
        return bateriaInicializado;
    }

    public void setBateriaInicializado(int bateriaInicializado) {
        this.bateriaInicializado = bateriaInicializado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @SuppressWarnings("empty-statement")
    public String avanzar(int pasos){
        //100 pasos 10 energia, 10 pasos 1 energia, 1 paso 0.1
        String msj;
        int combustible;
        double descontar;
        double actualizarBateria;
        descontar= pasos * 0.1 ;
        combustible = this.getBateriaInicializado();
        
        if(combustible - descontar >= 0){ msj="El robot avanzo "+pasos+" pasos." ;
        //actualizo la bateria descontandole la variable DESCONTAR
        actualizarBateria= this.getBateriaInicializado() - descontar ;
        //al inicializar actualiz.. lo hago con un int, me pidio que declare como int entero: 
        //No lo hago del principio porque no me deja multiplicar 0.1, debe ser double para que me permita
        //hacer esa multiplicacion.
        this.setBateriaInicializado((int) actualizarBateria);
        }
        else {msj="No hay suficiente bateria para avanzar esa cantidad de pasos!!";}
        return msj;
    }
    
    public boolean bateriaVacia(){
     return  this.getBateriaInicializado() <= 0 ;
}
}    


