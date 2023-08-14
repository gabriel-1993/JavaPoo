/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio7;

/**
 7) En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado
en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su
atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos
adicionales:

 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que
por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería
suficiente.
 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor
menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
 */
public class G12Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Robot shobot = new Robot("Tito");
      //si le paso 1,100,2500 funciona si le paso 2400 no deja de imprimir lo de false
      while (shobot.bateriaVacia()==false) {
        System.out.println("avanzar: "+shobot.avanzar(1));
        }    
    }   
}
