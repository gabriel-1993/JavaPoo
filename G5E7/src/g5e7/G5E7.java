package g5e7;

public class G5E7 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {{0, 2, 4, 4, 7, 2, 9, 4, 2, 1}, {2, 0, 2, 6, 8, 5, 2, 9, 0, 1}, {4, 2, 0, 6, 4, 8, 5, 6, 3, 1},
        {0, 2, 4, 4, 7, 2, 9, 4, 2, 1}, {0, 2, 4, 4, 36, 5, 67, 2, 1, 8}, {0, 2, 4, 4, 89, 90, 75, 4, 2, 1}, {0, 2, 4, 4, 14, 22, 26, 4, 2, 1},
        {2, 0, 2, 6, 8, 5, 2, 9, 0, 1}, {2, 0, 2, 6, 8, 5, 2, 9, 0, 1}, {2, 0, 2, 6, 8, 5, 2, 9, 0, 1}};
        int[][] matriz2 = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        compararMatrices.comparar(matriz, matriz2);
    }

}
