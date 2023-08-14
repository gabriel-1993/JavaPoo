package g5parte2e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class CineE2 {

    private String nombre;
    private String direccion;
    private HashSet<PeliculaE2> proyecciones;

    public CineE2(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new HashSet();
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

    public void agregarPelicula(PeliculaE2 peli) {
        proyecciones.add(peli);

    }

    public void listarTodo() {
        System.out.println("Proyecciones: todas sin ordenar");
        for (PeliculaE2 peli : proyecciones) {
            System.out.println(peli);
        }
    }

    public void listarDuranMas(Integer horas) {
        System.out.println("Buscando pelis con una duracion mayor a " + horas + " HS :");
        Integer cont = 0;
        for (PeliculaE2 peli : proyecciones) {
            if (peli.getDuracion() > horas) {
                System.out.println(peli.toString());
            } else {
                cont++;

            }
        }
        if (cont.equals(proyecciones.size())) {
            System.out.println("No hay pelis con una duracion mayor a la ingresada");
        }
    }
    // se modifica el comparator para ordenar por duracion 
    public static Comparator<PeliculaE2> ordenarMenorAmayor = (PeliculaE2 o1, PeliculaE2 o2) -> o1.getDuracion().compareTo(o2.getDuracion());

    // se modifica el comparator para ordenar alfabeticamente por titulo
    public static Comparator<PeliculaE2> ordenarAhastaZ = (PeliculaE2 o1, PeliculaE2 o2) -> o1.getTitulo().compareTo(o2.getTitulo());

    // se modifica el comparator para ordenar alfabeticamente por director
    public static Comparator<PeliculaE2> ordenarAhastaZdirector = (PeliculaE2 o1, PeliculaE2 o2) -> o1.getDirector().compareTo(o2.getDirector());

    public void listarMenorDuracionAMayorDuracion() {
        ArrayList proyecciones2 = new ArrayList(proyecciones);
        Collections.sort(proyecciones2, ordenarMenorAmayor);
        System.out.println("Menor duracion a Mayor duracion : ");
        System.out.println(proyecciones2);

    }

    public void listarOrdenadasPorTituloAZ() {
        ArrayList proyecciones2 = new ArrayList<PeliculaE2>(proyecciones);
        Collections.sort(proyecciones2, ordenarAhastaZ);
        System.out.println("Ordenadas por titulo de A-Z");
        System.out.println(proyecciones2);

    }

    public void listarOrdenadasPorDirectorAZ() {
        ArrayList proyecciones2 = new ArrayList(proyecciones);
        Collections.sort(proyecciones2, ordenarAhastaZdirector);
        System.out.println("Ordenadas por director de A-Z");
        for (PeliculaE2 peli : proyecciones) {
            System.out.println(peli.toString());
        }
    }

}
