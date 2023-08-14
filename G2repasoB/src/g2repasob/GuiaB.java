/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2repasob;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class GuiaB {
    public static void elMayor(int a,int b){
    int r =  Math.max(a, b);
        System.out.println("El numero mayor es = "+r);
    }
    
    public static void esPar(int n){
        String r;
        if (n % 2 == 0){r=" Es un numero par";}
        else {r=" Es un numero impar";}
        System.out.println("El numero "+n+r);
    }
    
    public static void eureka(){
        String r;
        Scanner leer=new Scanner(System.in);
           System.out.println("Ingresa una palabra o frase");
           String dato= leer.nextLine();
           String minusculas = dato.toLowerCase();
           if ("eureka".equals(minusculas)){r="Correcto";}
           else{r="Incorrecto";}
           System.out.println("¿eureka?"+r);
    }
    /*Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
el método lenght() de String.*/
    public static void frase(){
         Scanner leer=new Scanner(System.in);
           System.out.println("Ingresa una palabra o frase de 8 caracteres");
           String a= leer.nextLine();
           int r= a.length();
           if(r==8){a="CORRECTO";}
           else a="INCORRECTO";
           System.out.println("¿Son 8 caracteres?"+a);          
    }
    /*10. Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una
    ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
    “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.*/
    public static void validarLetra(){
        Scanner leer=new Scanner(System.in);
        String resul;
           System.out.println("Ingresa una palabra o frase");
           String a= leer.nextLine();
           boolean r= a.startsWith("A");
           if (r==true){resul="CORRECTO";}
           else resul="INCORRECTO";
           System.out.println("¿Es == A la primer letra? "+resul);
    }
    /*11. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
    que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una
    variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar
    lo siguiente:
     Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
     Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
    gasolina”.
     Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
    hormigón”.
     Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
    alimenticia”.
     Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
    válido para tipo de bomba”*/
    public static void bombas(){
        String resul;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4");
        int dato= leer.nextInt();
        switch(dato) { 
                case 1: resul="La bomba es una bomba de agua";
                break;
                case 2: resul="La  bomba es una bomba de gasolina";
                break;
                case 3: resul="La bomba es una bomba de hormigón";
                break;
                case 4: resul="La bomba es una bomba de pasta alimenticia";
                break;
                default:resul="No existe un valor valido para el tipo de bomba";
                        }
        System.out.println(""+resul);
    }
}
