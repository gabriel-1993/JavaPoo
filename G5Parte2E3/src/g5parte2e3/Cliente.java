
package g5parte2e3;

public class Cliente {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String dire;
    
    public Cliente(int dni,String nombre,String apellido,String ciudad,String dire){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.ciudad=ciudad;
        this.dire=dire;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", dire=" + dire + '}';
    }
    
}
