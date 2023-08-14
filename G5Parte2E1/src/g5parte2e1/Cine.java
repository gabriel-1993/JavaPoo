package g5parte2e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarPelicula(Pelicula peli) {
        proyecciones.add(peli);

    }

    public void listarTodo() {
        System.out.println("Proyecciones: todas sin ordenar");
        for (Pelicula peli : proyecciones) {
            System.out.println(peli.toString());
        }
    }

    public void listarDuranMas(Integer horas) {
        System.out.println("Buscando pelis con una duracion mayor a " + horas + " HS :");
            Integer cont=0;
        for (Pelicula peli : proyecciones) {
            if (peli.getDuracion() > horas) {
                System.out.println(peli.toString());
            } else {  cont++;
                
            }
        }
        if(cont.equals(proyecciones.size())){
            System.out.println("No hay pelis con una duracion mayor a la ingresada");
        }
    ;}
    // se modifica el comparator para ordenar por duracion 
    public static Comparator<Pelicula> ordenarMenorAmayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    // se modifica el comparator para ordenar alfabeticamente por titulo
    public static Comparator<Pelicula> ordenarAhastaZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    // se modifica el comparator para ordenar alfabeticamente por director
    public static Comparator<Pelicula> ordenarAhastaZdirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

    public void listarMenorDuracionAMayorDuracion() {
        Collections.sort(proyecciones, ordenarMenorAmayor);
        System.out.println("Menor duracion a Mayor duracion : ");
        for (Pelicula peli : proyecciones) {
            System.out.println(peli.toString());
        }
    }

    public void listarOrdenadasPorTituloAZ() {
        Collections.sort(proyecciones, ordenarAhastaZ);
        System.out.println("Ordenadas por titulo de A-Z");
        for (Pelicula peli : proyecciones) {
            System.out.println(peli.toString());
        }

    }

    public void listarOrdenadasPorDirectorAZ() {
        Collections.sort(proyecciones, ordenarAhastaZdirector);
        System.out.println("Ordenadas por director de A-Z");
        for (Pelicula peli : proyecciones) {
            System.out.println(peli.toString());
        }
    }

}
