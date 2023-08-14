/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio5;

/**
 *
 * @author Usuario
 */
public class Utilitario {
    
    Utilitario(){}
    
    public static void dibujaCuadrado(int n){
        for (int i=0 ;i< n; i++)
        {System.out.print("*");
        }
        System.out.println();
        for (int i=0; i< n-2; i++){
            System.out.print("*");
            for (int j=0; j<n-2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j=0 ; j<n ; j++){
            System.out.print("*");
        }
        System.out.println("");
}
    //  elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el
    //  mayor. En caso de ser iguales lo deberá informar.
    public static int elMayorEs(int n1,int n2,int n3){
     int max ;
        max = 0;
     if (n1>n2 & n1>n3) {max= n1;}
     else if(n2>n1 & n2>n3) {max=n2;}
     else if(n3>n2 & n3>n1) {max=n3;}
     return max;
    } 
    
    public static String elDiaEs(int num){
        String dia="";
        switch(num) { 
            case 1: dia="Lunes";
            break;
            case 2: dia="Martes";
            break;
            case 3: dia="Miercoles";
            break; 
            case 4: dia="Jueves";
            break; 
            case 5: dia="Viernes";
            break; 
            case 6: dia="Sabado";
            break; 
            case 7: dia="Domingo";
            break; 
            default: dia="No existe ese dia!!!";
            }
        return dia;
    }
}
    
    

