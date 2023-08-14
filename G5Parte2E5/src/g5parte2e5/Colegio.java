package g5parte2e5;

import java.util.Comparator;
import java.util.TreeSet;

public class Colegio {

    private TreeSet<Alumno> registro;

    public Colegio() {
        this.registro = new TreeSet<Alumno>(ordenarAhastaZ);

    }
    //Comparator apellido A-->Z
    // se modifica el comparator para ordenar alfabeticamente por titulo
    public static Comparator<Alumno> ordenarAhastaZ = (Alumno o1, Alumno o2) -> o1.getApellido().compareTo(o2.getApellido());

    public void agregarAlumno(Alumno alumno) {
        registro.add(alumno);
    }

    public void borrarAlumno(int legajoo) {
                registro.removeIf(elem -> elem.getLegajo() == legajoo);  
    }

    public void listarPorApellidos() {
        for (Alumno elem : registro) {
            System.out.println(elem);
        }
    }
    
    public void listarLetraApellido(String letra){
        for(Alumno elem: registro){
            if(
            elem.getApellido().substring(0, 1).equals(letra )){
                System.out.println(elem);
            }
        }
    }

}
