
package g5colece1;

import java.util.HashMap;
import java.util.List;

public class G5COLECE1 {

    public static void main(String[] args) {
    Cliente c1 = new Cliente(11, "", "Perez", "San Luis", "");
		Cliente c2 = new Cliente(22, "", "Perez", "Merlo", "");
		Cliente c3 = new Cliente(33, "", "Ramirez", "Merlo", "");
		Cliente c4 = new Cliente(44, "", "Ramirez", "Beazley", "");
		Cliente c5 = new Cliente(55, "", "Nievas", "Cordoba", "");
		Directorio directorio = new Directorio();

		directorio.agregarCliente(1, c1);
		directorio.agregarCliente(2, c2);
		directorio.agregarCliente(3, c3);
		directorio.agregarCliente(4, c4);
		directorio.agregarCliente(5, c5);

		// Mostrar el directorio
		System.out.printf("directorio: %s\n", directorio.toString());
		
		// buscarCliente
		int cualNumeroBuscar = 5;
		Cliente clienteBuscado = directorio.buscarCliente(cualNumeroBuscar);
		if (clienteBuscado != null) {
			System.out.printf("El dni del telefono %d es %d\n", cualNumeroBuscar, clienteBuscado.getDni());
		} else {
			System.out.printf("El numero %d no tiene clientes asociados\n", cualNumeroBuscar);
		}

		// buscarTelefono
		String cualApellidoBuscar = "Perez";
		List<Integer> listaNumerosApellidos = directorio.buscarTelefono(cualApellidoBuscar);
		System.out.printf("Clientes %s (numeros telefonos): %s\n", cualApellidoBuscar, listaNumerosApellidos.toString());
		
		// buscarClientes
		String cualCiudadBuscar = "Merlo";
		List<Cliente> listaNumeroCiudades = directorio.buscarClientes(cualCiudadBuscar);
		System.out.printf("Clientes %s (numeros telefonos): %s\n", cualCiudadBuscar, listaNumeroCiudades.toString());
		
		// borrarCliente
		directorio.borrarCliente(3); // Borra
		directorio.borrarCliente(3); // Ya esta borrado
		directorio.borrarCliente(666); // No deberia hacer nada
		
		// Mostrar el directorio
		System.out.printf("directorio: %s\n", directorio.toString());
     
    }
    
}
