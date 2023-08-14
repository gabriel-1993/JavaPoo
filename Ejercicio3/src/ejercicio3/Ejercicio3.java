
package ejercicio3;


public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador messi = new Jugador ();
        messi.setNombre("Juan");
        messi.setPuntaje(140);
        messi.setNacionalidad("Argentino");
        messi.setEdad(29);
        System.out.println("nombre: "+messi.getNombre()); 
        System.out.println("puntaje: "+messi.getPuntaje());
        System.out.println("nacionalidad: "+messi.getNacionalidad());
        System.out.println("edad: "+messi.getEdad()); 
    }   
}
