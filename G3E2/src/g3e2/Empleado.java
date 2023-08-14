
package g3e2;

public class Empleado {
    private String nombre;
    private String apellido;
    private String fechaIngreso;
    private long dni;
    
    
     public Empleado(String nombre,String apellido,String fechaIngreso,long dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaIngreso=fechaIngreso;
        this.dni=dni;

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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
     
}
