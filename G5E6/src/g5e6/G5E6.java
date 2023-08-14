package g5e6;

import java.util.Scanner;

public class G5E6 {

    public static void main(String[] args) {
        // TODO code application logic here
        //  6) Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
        //sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
        //y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
        //es decir, están entre el 1 y el 9.
        //Modele e implemente las clases Java con los métodos necesarios para poder resolver este problema. 
        //Luego realice las pruebas necesarias desde el método main de la clase principal del proyecto.
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un numero entre 1 y 9");
                int num = leer.nextInt();
                if (num > 0 && num < 10) {
                    matriz[i][j] = num;
                } else {
                    System.out.println(" ingreselo nuevamente, que este entre 1 y 9 ");
                    j--;
                }
            }
            System.out.println("");
        }

        //imprimir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }
        //sumar cada fila : fila1 ; fila2 ; fila3 para despues verificar que sean iguales
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==0 && j < matriz.length) {
                    f1 = f1 + matriz[i][j];
                } else if (i == 1 && j < matriz.length) {
                    f2 = f2 + matriz[i][j];
                } else if (i == 2 && j < matriz.length) {
                    f3 = f3 + matriz[i][j];
                }
            }
            System.out.println("");
        }
        boolean filasCumplen = false;
        if (f1 == f2 && f1 == f3) {
            filasCumplen = true;
        }
        //sumar cada columna: col1; col2; col3 y verificar que son iguales:
        //sumar cada fila : fila1 ; fila2 ; fila3 para despues verificar que sean iguales
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (j== 0 && i < matriz.length) {
                    c1 = c1 + matriz[j][i];
                } else if (j == 1 && i < matriz.length) {
                    c2 = c2 + matriz[j][i];
                } else if (j == 2 && i < matriz.length) {
                    c3 = c3 + matriz[j][i];
                }
            }
            System.out.println("");
        }
        boolean columCumplen=false;
        if(c1==c2 && c1==c3){
            columCumplen=true;
        }
        //comparar primer diagonal :
        int d1=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               if(i==j){d1=d1+matriz[i][j];}
            }
            System.out.println("");
        }
        boolean d1Cumple=false;
        if(d1==f1 && d1==c1){
            d1Cumple=true;
        }
        //comparar segundo diagonal :
        int d2=0;
           for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length-1; j > -1; j--) {                
                d2=d2+matriz[i][j];
                i=i+1;
                if(j==0){
                    i=i+1;
                }
                }
                
            }
        boolean d2Cumple=false;
        if(d2==f2 && d2==c1){
            d2Cumple=true;
        }
        int fin=0;

if( filasCumplen == true && columCumplen==true && d1Cumple==true && d2Cumple==true && fin==0 ){
    System.out.println("Es una matriz maagica =D ");
    fin++;
}else System.out.println("No es una matriz magica =( ");

 }
}

