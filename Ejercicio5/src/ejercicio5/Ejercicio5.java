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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Pieza alfilNegro1 = new Pieza();
alfilNegro1.setNombre("Alfil Izquierdo");
alfilNegro1.setColor("Negro");
alfilNegro1.setFila("D");
alfilNegro1.setColumna(4);

//mostrar datos
alfilNegro1.mostrarInfo();
System.out.println("---------------------------");
Pieza caballoBlanco2 = new Pieza();
caballoBlanco2.setNombre("Caballo Izquierdo");
caballoBlanco2.setColor("Blanco");
caballoBlanco2.setFila("C");
caballoBlanco2.setColumna(8);

//mostrar datos
caballoBlanco2.mostrarInfo();
    }
    
}
