
package g5parte2e2;

import java.util.Objects;

public class PeliculaE2 {
    private String titulo;
    private String director;
    private Integer duracion;
    
    public PeliculaE2(String titulo, String director,Integer duracion){
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeliculaE2 other = (PeliculaE2) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    
    

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
  
}
