/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2repasoc;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaC {
    /*Bucles y sentencias de salto break y continue
    12. Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está
    entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
    public static void notas(){
         Scanner leer=new Scanner(System.in);
        int dato;
         
         do {
         System.out.println("Ingresa la nota");
         dato= leer.nextInt();}
         while (dato>10 || dato < 0);
         System.out.println("La nota ingresada es correcta =) ");
    }
    /*13. Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
    public static void sumador(){
           Scanner leer=new Scanner(System.in);
        int dato;
        int sumador = 0;
        int limite;
        System.out.println("Ingrese un valor limite entero");
        limite= leer.nextInt();
         do {System.out.println("Ingrese un numero"); 
         dato= leer.nextInt();
         sumador= sumador + dato;}
         while (sumador<=limite );
         System.out.println("La suma es igual a "+ sumador);
    }
    /*14. Realizar un método que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego
volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el
siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario selecciona
el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.*/
    public static void menuCalc(){
        int n1;
        int n2;
        int nMenu;
        double r=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        n1= leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        n2= leer.nextInt();
        do {
             System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Ingrese 1,2,3,4 o 5 para seleccionar una opcion");
        nMenu= leer.nextInt();
            switch(nMenu) { 
            case 1: r=n1+n2;
                System.out.println(n1+"+"+n2+" = "+r);
            break;
            case 2: r=n1-n2;
                System.out.println(n1+"-"+n2+" = "+r);
            break;
            case 3: r=n1*n2;
                System.out.println(n1+"*"+n2+" = "+r);
            break;
            case 4: r=n1/n2;
                System.out.println(n1+"/"+n2+" = "+r);
            break;
            case 5: 
             System.out.println("¿Esta seguro que desea salis (S/N)? ");
             leer.nextLine();
            String salir= leer.nextLine();
            if(salir.equals("N")||salir.equals("n")){ nMenu=6;}
            break;
        }
        } while (nMenu !=5);
        }
    
    /*15. Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota:
recordar el uso de la sentencia break.*/
    public static void finalizaEnCero(){
        Scanner leer=new Scanner(System.in);
        int i;
        int res=0;
        int nume1;
        System.out.println("antes del for");
        for (i=0; i<=19; i++) {
        System.out.println("Ingrese un numero entero");
            nume1 = leer.nextInt();
            if(nume1>0){res=res+nume1;} else 
            if(nume1==0){i=20;}
        } 
        System.out.println("Se capturo el numero cero.");
        System.out.println("La suma de los n ingresados es = "+res);
    }
    
    /*16. Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por
    el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter
    tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos 
    (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, 
    se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
    investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(), equals().*/
    
    public static void RS232 (){
            int largo;
            int correctas=0;
            int incorrectas=0;
        String cadena ;
        String primera;
        String ultima;
            Scanner leer=new Scanner(System.in);
            do {System.out.println("Ingrese 5 caracteres");
            cadena= leer.nextLine();
            largo= cadena.length();
            primera= cadena.substring(0,1);
            ultima= cadena.substring(largo-1);
                System.out.println("primer letra= "+ primera);
                System.out.println("ultima letra= "+ultima);
            if (cadena.equals("&&&&&")){System.out.println("Las correctas son = "+correctas +" Las incorrectas son = "+incorrectas);}
            else if (largo==5 && primera.equals("X") && ultima.equals("O"))
            {correctas=correctas +1; }
            else{incorrectas= incorrectas+1 ;}
            
            }
            while (!"&&&&&".equals(cadena));
            
    }
    
    /*17. Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
    si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
    El valor de N se ingresará por teclado y en este caso utilice la estructura while para dibujarlo.*/
    
    public static void cuadrado(int num){
       
        int i=0;
        int j=0;
        String a="";
     
            while (i<num )
            { a= a.concat("*");
            i++;
            }
            System.out.println(""+a);

            //despues de la linea completa 
            i=0;
            while ( i< num-2){
             i++;
            System.out.print("*");
             j=0;
            while ( j<num-2 ){
                System.out.print(" ");
                j++;
            }
            System.out.println("*");
        }
            System.out.println(""+a);
    }
    /*18. Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **   */
    public static void cuatroNumeros(int n1,int n2,int n3, int n4){
        if(n1>1 && n1 < 21){System.out.print(n1+" "); 
        for (int i=0 ; i<=n1-1;i++){System.out.print("*");}
        }
            else{System.out.println("El numero ingresado no fue entre 1 y 20");int i=n1+1;}
            System.out.println("");
             
        if(n2>1 && n2 < 21){System.out.print(n2+" ");
        for (int i=0 ; i<=n2-1;i++){System.out.print("*");}
        }
            else{System.out.println("El numero ingresado no fue entre 1 y 20");int i=n2+1;}
                System.out.println("");
        
        if(n3>1 && n3 < 21){System.out.print(n3+" ");
        for (int i=0 ; i<=n3-1;i++){System.out.print("*");}
        }
            else{System.out.println("El numero ingresado no fue entre 1 y 20");int i=n3+1;}
        
        System.out.println("");
        
         if(n4>1 && n4 < 21){System.out.print(n4+" ");
           for (int i=0 ; i<=n4-1;i++){System.out.print("*");}
         }
            else{System.out.println("El numero ingresado no fue entre 1 y 20");int i=n4+1;}
    }
    }  


