/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g5parte2e3;

/**
 *
 * @author Usuario
 */
public class G5Parte2E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente(3601823, "Gaby", "Fernandez", "San Luis", "Algun lugar");
        Cliente c2 = new Cliente(3601343, "Pepe", "Fernandez", "San Luis", "Algun otro lugar");
        Cliente c3 = new Cliente(2334456, "Juan", "Perez", "Cordoba", "avenida 99");
        Cliente c4 = new Cliente(2386234, "Maria", "Sosa", "Comodoro Rivadavia", "en la playita");
        Cliente c5 = new Cliente(2354323, "Luciana", "Alvarez", "Corrientes", "calle 5");
        Directorio dire = new Directorio();
        dire.agregarCliente(444567, c1);
        dire.agregarCliente(444569, c2);
        dire.agregarCliente(444321, c3);
        dire.agregarCliente(444778, c4);
        dire.agregarCliente(789987, c5);

        // buscar cliente por el tel
        System.out.println(dire.buscarCliente(444778));
        //buscar numeros por apellido
        System.out.println(dire.buscarTelefono("fernandez"));
        //buscar clientes en la misma ciudad
        System.out.println(dire.buscarClientes("san luis"));
        //borrar cliente a travez del tel
        dire.borrarCliente(444569);
        //volver a ver numeros con apellido fernandez
        System.out.println(dire.buscarTelefono("fernandez"));
        System.out.println(dire);
    }

}
