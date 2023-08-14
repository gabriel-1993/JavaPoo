package g4extra1;
 import java.time.LocalDate;
//para darle formato de string a fecha:
import java.time.format.DateTimeFormatter;
 //Para las fechas de alquiler
        public class G4EXTRA1 {
    public static void main(String[] args) {
        // TODO code application logic here
     //FECHAS: de String parseadas a LocalDate  : 
     String stringIngreso="20/04/2022";    
     String stringEgreso="31/04/2022";    
     //Lo primero que podemos hacer es indicar cual es el patrón de la fecha
     //que queremos convertir.
     DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd MM yyyy");
     //Luego convertimos (parseamos)
     LocalDate fechaIngreso= LocalDate.parse(stringIngreso, formato);
     LocalDate fechaEgreso=  LocalDate.parse(stringEgreso,formato);
     Barco barquito = new Barco(10200,10,2004);
     Alquiler alquiler1 = new Alquiler("Messi",30965342,fechaIngreso,fechaEgreso,10,barquito);
}
}