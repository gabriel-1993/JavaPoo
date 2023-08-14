/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g1.pkg2.ejercicio8;

/**
 *
 * @author Usuario
 */
public class Calculo { 
    
    
    public static boolean esPrimo(int n){
        boolean resul=false ;
        // division: /  resto o modulo: %
        if(n==2){resul= true;}
        else if(n==3){resul= true;}
        else if(n>3 && n%n==0 && n%1==0 && n%2!=0 && n%3!=0){resul=true ;}
        return resul;
        
    }
    //valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
    public static int valorAbsoluto(int n){
    if(n>= 0){return n;}
    else return -n;
    }
   //calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
   //grado y mostrará por consola sus raíces y si no las tiene también lo informará. 
   public static void calcularRaices(double a,double b,double c){
       //NO FUNCIONA
       System.out.println("Resultados de una ecuacion de segundo grado "+a+".x^2+"+b+".x+"+c+" =0");
               double discriminante=(b*b)-(4*a*c);
               double divisor =2*a;
               double x1 =Math.sqrt(discriminante)/divisor;
               double x2=Math.sqrt(discriminante)/divisor;
               if(discriminante<0){
                   System.out.println("Los numeros ingresados no tienen solucion en reales");}
               else if (divisor==0){
                   System.out.println("Los numeros no tienen solucion no se puede dividir por 0");}else
               {System.out.println("x1 = "+x1);
                   System.out.println("x2 = "+x2);
               }
   }     
   
}
