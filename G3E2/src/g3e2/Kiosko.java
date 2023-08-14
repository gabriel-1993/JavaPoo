
package g3e2;

import java.time.LocalDate;
import java.time.Month;



public class Kiosko {
    private String dire;
    private String nombre;
    private long cuit;
    private Empleado e1;
    private Empleado e2;
    private Empleado e3;
    private int cantEmp;
    
    
    public Kiosko(String dire,String nombre,long cuit){
        this.dire=dire;
        this.nombre=nombre;
        this.cuit=cuit;
        cantEmp=0;
        e1=null;
        e2=null;
        e3=null;
    } 

    //get y set dire  nombre  cuit
    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    
    public void ingreso(Empleado empleado){
           if (cantEmp<3){ 
            if(e1==null){
                e1=empleado;
            }
            else{
                if(e2==null){
                e2=empleado;
            }else{
                    if(e3==null){
                        e3=empleado;
                    }
                }
                
                }
      
        cantEmp++;
    }
        else {System.out.println("No puede ingresar mas empleados, los 3 puestos estan ocupados... ");
    }
        
    }
    
    public void mayorAntiguedad(){
        
    LocalDate e1ant = LocalDate.of(2005,03,27);
    LocalDate e2ant = LocalDate.of(2003,02,27);
    LocalDate e3ant = LocalDate.of(2001,06,04);
    
    if( e1ant.getYear() < e2ant.getYear() && e1ant.getYear()< e3ant.getYear()){
        System.out.println("El empleado con mas antiguedad es : ");
        System.out.println("Nombre : "+e1.getNombre()+ " Apellido : "+e1.getApellido()+" fecha ingreso : "+e1.getFechaIngreso()+ " DNI : "+e1.getDni());
    }else if( e2ant.getYear() < e1ant.getYear() && e2ant.getYear()< e3ant.getYear()){
        System.out.println("El empleado con mas antiguedad es");
        System.out.println("Nombre : "+e2.getNombre()+ " Apellido : "+e2.getApellido()+" fecha ingreso : "+e2.getFechaIngreso()+ " DNI : "+e2.getDni());
    }else  if( e3ant.getYear() < e1ant.getYear() && e3ant.getYear()<e2ant.getYear()){
        System.out.println("El empleado con mas antiguedad es");
        System.out.println("Nombre : "+e3.getNombre()+ " Apellido : "+e3.getApellido()+" fecha ingreso : "+e3.getFechaIngreso()+ " DNI : "+e3.getDni());
    }
    
}
}
