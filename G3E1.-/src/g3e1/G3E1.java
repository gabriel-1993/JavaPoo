package g3e1; 

public class G3E1 {

    public static void main(String[] args) {
        Perro p1 = new Perro("Checo","callejero","mediano",8);
        Perro p2 = new Perro("Chequito","callejero","mediano",5);
        Perro p3 = new Perro("Pepe","callejero","mediano",6);
        Perro p4 = new Perro("Pepito","callejero","mediano",2);
        Persona persona1 = new Persona("Gabriel","torrez",30,"36018434");
        persona1.adoptarPerro( p1);
        persona1.adoptarPerro( p2);
        persona1.adoptarPerro( p3);
        persona1.adoptarPerro( p4);
        persona1.perroMasGrande();
        }
}
// La manera de usar herencia es a través de la palabra extends.
//class subclase extends superclase {
// atributos y métodos }

//reescribir un metodo heredado: 
//@Override arriba del método que queremos sobreescribir
//@Override
//public void codear(){
//System.out.println(“Está aprendiendo”);}

