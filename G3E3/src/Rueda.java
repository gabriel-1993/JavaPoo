
public class Rueda {

    private String marca;

    private double presion;
    
     public  Rueda(String marca){
         this.marca=marca;
         this.presion=0.0;
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public void inflar() {
        this.setPresion(27.0);
        System.out.println("Rueda inflada, presion : "+this.getPresion());
    }

    public void pinchar() {
        this.setPresion(0.0);
        System.out.println("Rueda pinchada, presion : "+this.getPresion());
    }

    public void desinflar() {        
        this.setPresion(this.getPresion()-0.5);
        System.out.println("Desinflo 0.5,presion actual: "+this.getPresion());
    }
}
