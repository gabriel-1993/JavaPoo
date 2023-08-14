/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.e1;

import java.util.Scanner;

public class G2E1 {
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer=new Scanner(System.in);
           System.out.println("Ingrese el primer numero");
           int n1= leer.nextInt();
           System.out.println("Ingrese el segundo numero");
           int n2= leer.nextInt();
           int r = repasoGuia.sumar(n1,n2);
           System.out.println("la suma es = "+r);
    }
};
    
    


         

   

