package g6e2;

public class G6E2 {


    public static void main(String[] args) {
//Demuestre como provocar intencionalmente una excepción del tipo ArrayIndexOutOfBoundsException 
//(índice de arreglo fuera de rango);
//luego agregue las sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
    char arrayCaracteres[]; arrayCaracteres = new char[10];
    
       
        
        String NullPointerExceptionString= null;
try{ System.out.println(arrayCaracteres[11]);}catch (ArrayIndexOutOfBoundsException a) {
    System.out.println("a.fillInStackTrace() = "+a.fillInStackTrace());
}
    
    
    }
    
}
