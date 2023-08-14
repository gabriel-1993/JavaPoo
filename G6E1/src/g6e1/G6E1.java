package g6e1;


public class G6E1 {

    public static void main(String[] args) {
        //Demuestre como provocar intencionalmente una excepción del tipo NullPointerException, 
        //luego agregue las sentencias try/catch para mostrar el mensaje de error.
String NullPointerExceptionString= null;
try{NullPointerExceptionString.length();}catch (NullPointerException a) {
    System.out.println("Excepcion del tipo NullPointerException");
}

    }
}