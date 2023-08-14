/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio1;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero numero1 = new Numero(1459);
         
        
        if(numero1.esPar()){
            System.out.println("El numero es par ");
        }else{System.out.println("El numero es impar");
            System.out.println("¿Es Positivo? = "+numero1.esPositivo());
            numero1.esMultiploDe(3);
            System.out.println("El numero "+numero1.getValor()+" ¿Es multiplo de "+3 +"? = "+numero1.esMultiploDe(3));
        }
    } 
}
