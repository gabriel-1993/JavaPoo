
package g4e1;


public class G4E1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro("Checo","croquetas",8,"perro");
        Animal gato = new Gato("Chango","croquetas2",2,"mishifuuu");
        Animal caballo = new Caballo("Tornado","pasto",4,"caballo negro");
        perro.alimentar();
        caballo.alimentar();
        gato.alimentar();
    }
    
}
