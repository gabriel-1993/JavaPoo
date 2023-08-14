package g3e1; 

public class Perro {

    private String nombre;

    private String raza;

    private String tam;

    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Perro(String nombre, String raza, String tam, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tam = tam;
        this.edad = edad;
    }
}

