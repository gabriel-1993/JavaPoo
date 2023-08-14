/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g3e2;

/**
 *
 * @author Usuario
 */
public class G3E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kiosko kiosko1 = new Kiosko("España 365","El 24",201234560);
        Empleado emp1 = new Empleado("Diego","Perez","27/03/2005",30230321);
        Empleado emp2 = new Empleado("Juan","Sosa","27/02/2003",37230321);
        Empleado emp3 = new Empleado("Maria","Lopez","04/06/2001",39230321);
        Empleado emp4 = new Empleado("Pedro","Fernandez","24/06/2007",39230321);

        kiosko1.ingreso(emp1);
        kiosko1.ingreso(emp2);
        kiosko1.ingreso(emp3);
        kiosko1.ingreso(emp4);
        kiosko1.mayorAntiguedad();
    }
    
}
