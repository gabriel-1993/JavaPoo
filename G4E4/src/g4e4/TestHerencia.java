
package g4e4;

/**
 *
 * @author Usuario
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guerrero Thor = new Guerrero(new Position(100,200)  ,"thor",false);
        Thor.girar();
        Thor.girar();
        Thor.girar();
        
            for (int i=0; i<=4; i++){
            Thor.avanzar();
            System.out.println("avanzo 1 paso");
            }
            System.out.println("energia"+Thor.energia);
        Thor.disparar(8);
    }
        
}
