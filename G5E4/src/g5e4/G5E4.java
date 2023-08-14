
package g5e4;

public class G5E4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //4) En un nuevo proyecto, en el método main de su clase principal,
        //se pide realizar un algoritmo que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
        
    int [][]matriz = new int[4][4];
    for(int i=0; i<4;i++){
        for(int j=0;j<4;j++){
            matriz[i][j]= (int) (Math.random() * 10);
            System.out.print(" "+matriz[i][j]);
        }
        System.out.println("");
    }
        System.out.println("valor en la 0,0: "+matriz[0][0]);
        System.out.println("Matriz traspuesta a la primera : ");
          for(int i=0; i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print(" "+matriz[j][i]);
        }
        System.out.println("");
    }
    }
    
}
