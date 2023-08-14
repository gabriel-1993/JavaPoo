
public class Auto {

    private String color;

    private String patente;

    private int combustible;
    
    private Rueda dD;

    private Rueda dI;

    private Rueda tD;

    private Rueda tI;

    public Auto(String color,String patente,Rueda dD,Rueda dI,Rueda tD,Rueda tI) {
        this.color=color;
        this.patente=patente;
        this.combustible=50;
        this.dD=dD;
        this.dI=dI;
        this.tD=tD;
        this.tI=tI;
    }

    public Rueda getdD() {
        return dD;
    }

    public void setdD(Rueda dD) {
        this.dD = dD;
    }

    public Rueda getdI() {
        return dI;
    }

    public void setdI(Rueda dI) {
        this.dI = dI;
    }

    public Rueda gettD() {
        return tD;
    }

    public void settD(Rueda tD) {
        this.tD = tD;
    }

    public Rueda gettI() {
        return tI;
    }

    public void settI(Rueda tI) {
        this.tI = tI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void avanzar(int metros) {
        double consumo=  metros * 0.1;
        if(this.getCombustible()>= consumo){
            System.out.println("El auto avanzo "+metros+ "metros ");
            double actual= this.getCombustible()- consumo;
            this.setCombustible((int) actual);
            System.out.println("Su combustible quedo en "+this.getCombustible());
        }else System.out.println("No hay combustible suficiente para esa cantidad de metros");
    }

    public void retroceder(int metros) {
         double consumo=  metros * 0.1;
        if(this.getCombustible()>= consumo){
            System.out.println("El auto retrocedio "+metros+ "metros ");
            double actual= this.getCombustible()- consumo;
            this.setCombustible((int) actual);
            System.out.println("Su combustible quedo en "+this.getCombustible());
        }else System.out.println("No hay combustible suficiente para esa cantidad de metros");
    }

    public void llenarTanque() {
        this.setCombustible(50);
        System.out.println("llenarTanque ejecutada, Tanque llenito "+this.getCombustible() +" litros :D ");
    }
    
  
        
    }

