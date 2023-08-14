package g5e7;

public class compararMatrices {

    public static void comparar(int[][] matriz, int[][] matriz2) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int j2 = 0;
                int i2 = 0;
                //comparo la primer fila entre las dos matriz si da true, paso a comprar la segunda fila 
                if (matriz[i][j] == matriz2[i2][j2] && matriz[i][j + 1] == matriz2[i2][j2 + 1] && matriz[i][j + 2] == matriz2[i2][j2 + 2]) {
                    //comparo la segunda fila ,si da true comparo la tercera...
                    if (matriz[i + 1][j] == matriz2[i2 + 1][j2] && matriz[i + 1][j + 1] == matriz2[i2 + 1][j2 + 1] && matriz[i + 1][j + 2] == matriz2[i2 + 1][j2 + 2]) {
                        //comparo la tercera , si da true ...ya imprimo todas sus posiciones en la matriz de 10,10
                        if (matriz[i + 2][j] == matriz2[i2 + 2][j2] && matriz[i + 2][j + 1] == matriz2[i2 + 2][j2 + 1] && matriz[i + 2][j + 2] == matriz2[i2 + 2][j2 + 2]) {
                            System.out.println("cumple ");
                            int f1 = i;
                            int c1 = j;
                            System.out.println("Se encuentra en los indijes i,j : ");
                            System.out.println("Posiciones " + f1 + "," + c1 + "; " + f1 + "," + (c1 = c1 + 1) + "; " + f1 + "," + (c1 = c1 + 1));
                            System.out.println("Posiciones " + (f1 = f1 + 1) + "," + (c1 = c1 - 2) + "; " + f1 + "," + (c1 = c1 + 1) + "; " + f1 + "," + (c1 = c1 + 1));
                            System.out.println("Posiciones " + (f1 = f1 + 1) + "," + (c1 = c1 - 2) + "; " + f1 + "," + (c1 = c1 + 1) + "; " + f1 + "," + (c1 = c1 + 1));

                        }
                        ;
                    }
                    ;
                }
                ;
            }

        }

    }

}
