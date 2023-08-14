
package g5extra1;

public class Pila {
    private int tope;
    private String array1[];
    
    
    public Pila(){
    tope=-1;
    array1= new String[10];
}  

    public int getTope() {
        return tope;
    }

    public String[] getArray1() {
        return array1;
    }

    public void setArray1(String[] array1) {
        this.array1 = array1;
    }
    public boolean pilaLlena(){
        return tope==9;
    }
    public boolean pilaVacia(){
        return tope==-1;
    }
    
    public void agregar(String elem){
        if(!pilaLlena()){
            tope++;
            array1[tope]= elem;
        }else{System.out.println("La pila esta llena");}
    }
    
    public String verTope(){
        return array1[tope];
    }
    
    public String quitar(){
        tope--;
        return array1[tope+1];
    }
    
}
