package g5parte2e1;

import java.util.Scanner;

public class G5Parte2E1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cine cine1 = new Cine("ROMA SRL", "Rivadavia 325");

        //BUCLE PARA CREAR PELICULA
        String resp;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese el Titulo de la pelicula y presione Enter");
            String tit = leer.nextLine();
            System.out.println("Ingrese el Director de la pelicula y presione Enter");
            String direct = leer.nextLine();
            System.out.println("Por ultimo ingrese la duracion.Ej si dura 1 hora 40 minutos = 1.40 ");
            int duracionn = leer.nextInt();
            leer.nextLine();

            //asigno los valores a la pelicula nueva
            Pelicula peli = new Pelicula(tit, direct, duracionn);
            //agrego la pelicula al cine1 o cine ROMA SRL
            cine1.agregarPelicula(peli);
            //para seguir creando o finalizar
            System.out.println("¿Desea crear otra pelicula? Ingrese: S/N ");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("s"));

        //listar pelis de mas de N duracion de horas
        cine1.listarDuranMas(2);
        //mostrar todas las pelis del  cine originalmente
       cine1.listarTodo();
        // mostrar de A-Z por titulo
        cine1.listarOrdenadasPorTituloAZ();
        
        // mostrar de A-Z por director
        cine1.listarOrdenadasPorDirectorAZ();
        //mostrar ordenadas por duracion en horas
        cine1.listarMenorDuracionAMayorDuracion();
    }
;
}
