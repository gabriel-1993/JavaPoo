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
public class G12Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha unaFecha = new Fecha(22,03,1993);
        Fecha otraFecha = new Fecha(24,04,2020);

        System.out.println("¿Es un año bisiesto "+unaFecha.getAño()+"? "+unaFecha.esBisiesto());
        System.out.println("¿Es un año bisiesto "+otraFecha.getAño()+"? "+otraFecha.esBisiesto());
        //años del 1993 a 2020
        System.out.println("Años de diferencia: "+unaFecha.calcularAños(otraFecha.getAño()));
        //años del 2020 a 1993
        System.out.println("Años de diferencia: "+otraFecha.calcularAños(unaFecha.getAño()));

    }
    
}
