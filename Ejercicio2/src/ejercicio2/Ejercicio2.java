/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu1 = new Computadora("LG 17pulg ","teclado y mouse USB ","Buenardo "," 100GB ","12GB "," 1GB ","12 sin interes ",91000,102 , 401063);
        System.out.println("Monitor: "+compu1.getMonitor());
        System.out.println("Accesorios: "+compu1.getAccesorios());
        System.out.println("Procesador: "+compu1.getProcesador());
        System.out.println("Disco: "+compu1.getDisco());
        System.out.println("Memoria RAM: "+compu1.getRam());
        System.out.println("Video: "+compu1.getVideo());
        System.out.println("Cuotas: "+compu1.getCuotas());
        System.out.println("Precio: $"+compu1.getPrecio());
        System.out.println("Stock disponible: "+compu1.getStock());
        System.out.println("Codigo del producto: "+compu1.getCodigo());

    }
    
}
