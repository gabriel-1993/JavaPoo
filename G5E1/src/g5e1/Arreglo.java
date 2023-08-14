package g5e1;

import java.util.Scanner;


public class Arreglo {
  
//a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma 
//y promedio de los mismos.  
    public static void sumarLista(int[] vector1){
        int sumador=0;
        int promedio=0;
for (int nro:vector1){
        sumador+=nro;
    System.out.println(sumador-nro+"+"+nro+"="+sumador);

}
System.out.println("Promedio= "+ sumador/ vector1.length);
    }
    
//b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el 
    //entero más grande que se encuentra en el arreglo.
    
    public static void buscarMayor(int[][] matriz1){
            int max= Integer.MIN_VALUE;
            for (int i=0;i<matriz1.length;i++){
            int k=matriz1[i].length;
            for (int j=0;j<k;j++){
            if(matriz1[i][j]>max){
                max=matriz1[i][j];
            }    
            }
            }
            System.out.println("Num mayor = "+max);
}
    
    //c) Método cuentaVocales, que reciba por parámetro un String y 
    //retorne la cantidad de vocales que tiene la cadena.
    
    public static void cuentaVocales(String string1){
        int contador=0;
        for (int i=0;i<string1.length();i++){
            char letra=string1.charAt(i);

 switch (letra) { 
    case 'a':
     contador++;
     break;
     case 'A':
     contador++;
     break; 
      case 'e':
     contador++;
     break;
      case 'E':
     contador++;
     break;
      case 'i':
     contador++;
     break;
      case 'I':
     contador++;
     break;
      case 'o':
     contador++;
     break;
      case 'O':
     contador++;
     break;
      case 'u':
     contador++;
     break;
      case 'U':
     contador++;
     break;
    
  }
  }
            System.out.println("Cantidad vocales :"+ contador);
        }
    //d) Método cuentaCaracter que reciba por parámetro un 
    // String y un carácter, luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.
    public static void cuentaCaracter(String string1,char letra){
           int contador=0;
        for (int i=0;i<string1.length();i++){
            char charI=string1.charAt(i);
            if(charI==letra){contador++;}
        }
        System.out.println("La letra se repite : "+contador);
    } 
        
    
    }




