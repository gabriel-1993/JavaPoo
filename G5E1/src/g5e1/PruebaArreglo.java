
package g5e1;

/**
 *
 * @author Usuario
 */
public class PruebaArreglo {
     public static void main(String[] args) {
        // TODO code application logic here
            //int[] vector1 =  {3,5,7,4,13,2};
            //Arreglo.sumarLista(vector1);
            //int [][] matriz1 = {{3,9,7},{20,13,8,17},{15,23,31,19,12}};
           //Arreglo.buscarMayor(matriz1);
           // Arreglo.cuentaVocales("Hola que tal, como estas? ");
           //Arreglo.cuentaCaracter("Hola! como estas pequeño saltamontes?", 'a');
           //2) En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que rellene un vector con los 
           //100 primeros números enteros y los muestre por pantalla en orden descendente.
           
               int []vector1 = new int[100];
               for (int i=0; i<vector1.length;i++){
               
               vector1[i] =  (int) (Math.random() * 10);
                   System.out.println(i+" = "+vector1[i]);
                   System.out.println("long"+vector1.length);
               }
               for(int i=vector1.length-1 ;i>=0;i--){
                   System.out.println("Posicion "+i+" : "+vector1[i]);
              }
           
    }
    
}
