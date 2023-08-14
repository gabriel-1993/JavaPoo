package g5parte2e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Directorio {

    private HashMap<Integer, Cliente> clientes;

    public Directorio() {
        clientes = new HashMap();

    }

    @Override
    public String toString() {
        return "Directorio{" + "clientes=" + clientes + '}';
    }

    public void agregarCliente(Integer tel, Cliente cliente) {
        clientes.put(tel, cliente);
    }

    public Cliente buscarCliente(int tel) {
        System.out.println("------------BUSCANDO CLIENTE POR N TEL-----------------");
        for (Integer i : clientes.keySet()) {
            if (clientes.containsKey(tel)) {
                System.out.println("Se encontro el telefono-> " + tel + " :");
                return clientes.get(i);
            }
        }
        System.out.println("No se encontro el telefono");
        return null;
    }

    //buscarTeléfono(apellido):List  
    //que en base a un apellido nos devuelve una lista con los nros. de teléfono asociados a dicho apellido.
    public ArrayList buscarTelefono(String apellido) {
        ArrayList encontrados = new ArrayList();
        System.out.println("-------------BUSCANDO TELEFONOS POR APELLIDO----------");
        for (Map.Entry<Integer, Cliente> cliente : clientes.entrySet()) {
            //cliente.getKey trae la llave y cliente.getValue trae los valores del mapa
            if (cliente.getValue().getApellido().toUpperCase().equals(apellido.toUpperCase())) {
                encontrados.add(cliente.getKey());

            }
        }
            return encontrados;
        }
    

    //● buscarClientes(ciudad):List  
    //que en base a una ciudad nos devuelve una lista con los Clientes asociados a dicha ciudad.
    public ArrayList buscarClientes(String ciudad) {
        ArrayList encontrados = new ArrayList();
        System.out.println("-------------BUSCANDO CLIENTES EN LA MISMA CIUDAD----------");
        for (Map.Entry<Integer, Cliente> cliente : clientes.entrySet()) {
            //cliente.getKey trae la llave y cliente.getValue trae los valores del mapa
            if (cliente.getValue().getCiudad().toUpperCase().equals(ciudad.toUpperCase())) {
                encontrados.add(cliente);
            }
        }
        if (encontrados.size() == 0) {
            System.out.println("NO SE ENCONTRARON RESUL PARA LA CIUDAD");
            return null;
        } else {
            System.out.println("APELLIDOS ENCONTRADOS EN LA MISMA CIUDAD : ");
            return encontrados;
        }
    }

    //● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio.
    public void borrarCliente(Integer telBorrarCliente) {
        for (Map.Entry<Integer, Cliente> cliente : clientes.entrySet()) {
            if (cliente.equals(telBorrarCliente)) {
                clientes.remove(telBorrarCliente);
                System.out.println("Cliente borrado");
            }
        }
    }

}
