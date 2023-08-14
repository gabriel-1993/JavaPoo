
package g4extra1;


public class BarcoAmotor extends Barco{
    private int potenciaCV;
    
      
    public BarcoAmotor(int matricula,int eslora,int anioFabricado,int potenciaCV){
        super(matricula,eslora,anioFabricado);
        this.potenciaCV=potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    
}
