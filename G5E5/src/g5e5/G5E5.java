package g5e5;

public class G5E5 {

    public static void main(String[] args) {
        // TODO code application logic here
        //5) En un nuevo proyecto, en el método main de su clase principal, se pide realice un algoritmo 
        //que compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando
        //ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
        //La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).28
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz2= new int [3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                matriz2[j][i]=matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("Matriz traspuesta a la primera : ");
        int cont=0;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                
                //positivos
                System.out.print(matriz2[i][j]+" ");
                if((matriz2[i][j]>0 || matriz2[i][j]<0 && matriz2[i][j]== matriz[i][j]-(matriz[i][j]*2))|| matriz2[i][j]==0){
                    cont++;
                }
                
            ;}
            System.out.println("");
            }
        //fuera de los dos for anidados :
        System.out.println("cont: "+cont);
            if(cont== matriz2.length * matriz2[0].length){
                System.out.println("Matriz anti simetrica: cumple ");}
            else{
                System.out.println("Matriz anti simetrica: NO cumple");
            }
    }
}
