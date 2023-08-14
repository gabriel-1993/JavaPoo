package g3e1; 
public class Persona {

    
    private String nombre;

    private String apellido;

    private int edad;

    private String documento;
    
    private Perro p1;
    
    private Perro p2;
    
    private Perro p3;
    
    private int cantPerros;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        cantPerros=0;
        p1=null;
        p2=null;
        p3=null;
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public void adoptarPerro(Perro perro) {
        
        if (cantPerros<3){ 
            if(p1==null){
                p1=perro;
            }
            else{
                if(p2==null){
                p2=perro;
            }else{
                    if(p3==null){
                        p3=perro;
                    }
                }
                
                }
      
        cantPerros++;
    }
        else {System.out.println("Ya no puedes adoptar mas perros ");
    }
    }
    public void perroMasGrande(){
        String mayor;
    if ( p2.getEdad() > p1.getEdad()){
        mayor=p2.getNombre();}
    else if(p3.getEdad() > p1.getEdad()){
        mayor=p3.getNombre();}
    else {mayor=p1.getNombre();}
        System.out.println("El perro mas grande es "+mayor);
    }
    }
    
