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
public class Conversor {
   
    
    //constructor
    public Conversor (){
     }
    
    public double convertirAPesos(int dolares){
    double resul = dolares / 0.0046 ; 
        return resul;
    };

   
    public double convertirADolar(int pesos){
    double resul = pesos / 400;
    return resul;
    }
    }
    

