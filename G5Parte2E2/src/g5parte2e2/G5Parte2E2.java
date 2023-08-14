package g5parte2e2;

import java.util.Scanner;

public class G5Parte2E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        CineE2 cine1 = new CineE2("ROMA SRL", "Rivadavia 325");

        //BUCLE PARA CREAR PELICULA
        String resp;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese el Titulo de la pelicula");
            String tit = leer.nextLine();
            System.out.println("Ingrese el Director de la pelicula");
            String direct = leer.nextLine();
            System.out.println("Ingrese la duracion de la peli");
            int duracionn = leer.nextInt();
            leer.nextLine();

            //asigno los valores a la pelicula nueva
            PeliculaE2 peli = new PeliculaE2(tit, direct, duracionn);
            //agrego la pelicula al cine1 o cine ROMA SRL
            cine1.agregarPelicula(peli);
            //para seguir creando o finalizar
            System.out.println("¿Desea crear otra pelicula? Ingrese: S/N ");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("s"));
        
        cine1.listarTodo();
        cine1.listarMenorDuracionAMayorDuracion();
        cine1.listarOrdenadasPorTituloAZ();
        cine1.listarOrdenadasPorDirectorAZ();
        
    }

}
