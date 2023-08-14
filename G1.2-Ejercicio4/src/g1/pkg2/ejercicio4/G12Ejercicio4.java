/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio4;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversor cambio = new Conversor();
        System.out.println("Convertir USD500 a Pesos = "+cambio.convertirAPesos(500));
        System.out.println("Convertir $25700 a dolares = "+cambio.convertirADolar(25700));

    }
    
}
