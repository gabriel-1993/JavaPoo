
package g3e4;


/**
 *
 * @author Usuario
 */
public class G3E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bateria bate1= new Bateria();
        Robot citripio= new Robot( bate1);
        Hombre messi= new Hombre();
        messi.jugarConRobot(citripio);
        System.out.println("bateria : "+bate1.getCarga());
    }
}
