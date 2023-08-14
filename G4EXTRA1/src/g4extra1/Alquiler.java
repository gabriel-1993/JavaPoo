
package g4extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler {
    private String nombre;
    private int dni;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posicion;
    private Barco barco;
    
    public Alquiler (String nombre,int dni,LocalDate fechaInicio,LocalDate fechaFin,int posicion,Barco barco){
        this.nombre=nombre;
        this.dni=dni;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.posicion=posicion;
        this.barco=barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public void cantidadDias(){
        int dias= (int) ChronoUnit.DAYS.between(fechaInicio,fechaFin);
    System.out.println("Días vividos: "+ChronoUnit.DAYS.between(fechaInicio,fechaFin));
    }
}
