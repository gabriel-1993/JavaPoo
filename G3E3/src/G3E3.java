

public class G3E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Rueda dD1= new Rueda("Pirelli");
         Rueda dI1= new Rueda("Pirelli");
         Rueda tD1= new Rueda("Pirelli");
         Rueda tI1= new Rueda("Pirelli");
         Auto autitoo= new Auto("Blanco","sad243",dD1,dI1,tD1,tI1);
         autitoo.getColor();
         autitoo.getPatente();
         autitoo.getCombustible();
         autitoo.avanzar(500);
         autitoo.llenarTanque();
         autitoo.retroceder(400);
         autitoo.getdD();
         dD1.inflar();
         autitoo.getdD();
         dI1.inflar();
         tD1.inflar();
         tI1.inflar();
         tD1.pinchar();
         tD1.inflar();
         tD1.desinflar();
                 }
}
