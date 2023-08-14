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
public class G12Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pensador sapienSapiensa = new Pensador(123);
        Pensador otroNum = new Pensador(256);
        System.out.println("numero invertido: "+sapienSapiensa.invertir());
        System.out.println("Par anterior: "+otroNum.parAntes());
        System.out.println("Par posterior: "+otroNum.parPosterior());
        //funcionan en numeros de 3 cifras
        System.out.println("Primer digito: "+otroNum.primerDigito());
        System.out.println("Ultimo digito: "+otroNum.ultimoDigito());

    }
    
}
