package g3e4;

public class Robot {
    private Bateria bateria;
    private boolean duerme;
    public Robot(Bateria bateria) {
        duerme=false;
        this.bateria=bateria;            
    }
    public void avanzar(int pasos){
        double consumo=pasos*0.1;
        if(this.duerme==true){System.out.println("Primero debe despertar al Robot");}
        else if( consumo<= this.bateria.getCarga()){
            System.out.println("El robot avanzo "+pasos+" pasos =) ");
             int actualizarCarga= this.bateria.getCarga()-(int)consumo;
            this.bateria.setCarga(actualizarCarga);
        }
    }
    public void retroceder(int pasos){
        double consumo=pasos*0.1;
        if(this.duerme==true){System.out.println("Primero debe despertar al Robot");}
        else if( consumo<= this.bateria.getCarga()){
            System.out.println("El robot retrocedio "+pasos+" pasos =) ");
             int actualizarCarga= this.bateria.getCarga()-(int)consumo;
            this.bateria.setCarga(actualizarCarga);
        }
    }
    public void dormir(){
        this.duerme=true;
        System.out.println("Robot durmiendo");
    }
    public void despertar(){
        this.duerme=false;
        System.out.println("Robot despierto");
    }
    public void recargar(){
        this.bateria.setCarga(1000);
    }
    public boolean bateriaLlena(){
            return this.bateria.getCarga()==1000;
        }
    public boolean bateriaVacia(){
            return this.bateria.getCarga()==0;
        }
    public int energiaActual(){
       return this.bateria.getCarga();  
    }
}
    

