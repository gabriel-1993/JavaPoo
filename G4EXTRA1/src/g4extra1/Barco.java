package g4extra1;
import java.time.LocalDate;

public class Barco {
    protected int matricula;
    protected int eslora;
    protected int anioFabricado;
    
    
    public Barco(int matricula,int eslora,int anioFabricado){
        this.matricula=matricula;
        this.eslora=eslora;
        this.anioFabricado=anioFabricado;
    };

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricado() {
        return anioFabricado;
    }

    public void setAnioFabricado(int anioFabricado) {
        this.anioFabricado = anioFabricado;
    }
    public int modulo(){
        int modulo= this.eslora *10;
        return 0;
        
    }
    
}
