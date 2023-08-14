package g3e4;


public class Hombre {

    public Hombre() {
        
    }
          
public void jugarConRobot(Robot robot){
    robot.avanzar(500);
    robot.retroceder(20);
    robot.energiaActual();
    robot.dormir();
        
    }
}