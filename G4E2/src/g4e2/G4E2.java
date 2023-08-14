
package g4e2;

public class G4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lavadora lavadora1 = new Lavadora(100000, "azul", 'b', 50 ,30);
        Lavadora lavadora2= new Lavadora(100000,"blanco",'d',90,31);
        lavadora1.precioFinal();
        lavadora2.precioFinal();
        //Televisor(int precio, String color, char consumoElectrico, int peso,double resolucion,boolean sintonizadorTDT)
        Televisor tv1 =new Televisor(90000,"negro",'c',20,39.9,false);
        Televisor tv2 =new Televisor(90000,"asda",'z',19,50.5,true);

        tv1.precioFinal();
        tv2.precioFinal();
    }
    
}
