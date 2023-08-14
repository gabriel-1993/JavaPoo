/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Usuario
 */
public class Pieza {
    private String nombre;
    private String color;
    private String fila;
    private int columna;
    
     public Pieza (){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Color: "+getColor());
        System.out.println("Posicion Fila: "+getFila());
        System.out.println("Posicion Columna: "+getColumna());
    }
    
}
