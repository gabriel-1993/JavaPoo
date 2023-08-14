package g5parte2e5;

import java.util.Scanner;

public class G5Parte2E5 {

    public static void main(String[] args) {

        Colegio SanMartin = new Colegio();
        Scanner leer = new Scanner(System.in);
        String resp;

        do {
            System.out.println("-----Alumno Nuevo-----");
            //Ingreso de argumentos para alumno nuevo
            System.out.println("Ingrese Num de legajo int");
            int legajoo = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese el nombre");
            String nombree = leer.nextLine();
            System.out.println("Ingrese el apellido");
            String apellidoo = leer.nextLine();
            System.out.println("Ingrese el año a cursar");
            int añoo = leer.nextInt();
            leer.nextLine();
            //Creo Alumno asignandole las variables anteriores
            Alumno nuevoAlumno = new Alumno(legajoo, nombree, apellidoo, añoo);
            //Agrego Alumno al Colegio, a travez del registro(set) del colegio
            SanMartin.agregarAlumno(nuevoAlumno);
            // se crea otro alumno o no:
            System.out.println("¿Desea crear otro alumno?S/N");
            resp = leer.nextLine();

        } while (resp.equalsIgnoreCase("s"));
        //listar ordenados apellido A-Z
        System.out.println("listar por apellidos");
        SanMartin.listarPorApellidos();
        //borrar un alumno
        System.out.println("borrar al 1234");
        SanMartin.borrarAlumno(1234);
        // verificar si se borro
        System.out.println("mostrar  por apellido nuevamente");
        SanMartin.listarPorApellidos();
        System.out.println("listar por letra");
        SanMartin.listarLetraApellido("c");

    }

}
