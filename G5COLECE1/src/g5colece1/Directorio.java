package g5colece1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directorio {

    public Directorio() {
    }
    Map<Integer, Cliente> directorio = new HashMap<Integer, Cliente>();

    public void agregarCliente(Integer tel, Cliente cliente) {
        directorio.put(tel, cliente);
    }

    ;
  public Cliente buscarCliente(Integer tel) {
        return directorio.get(tel);
    }

    ;
  
  public List<Integer> buscarTelefono(String apellido) {
        List<Integer> numeros = new ArrayList<Integer>();

        for (Map.Entry<Integer, Cliente> entry : directorio.entrySet()) {
            Cliente aux = entry.getValue();
            if (aux.getApellido().contentEquals(apellido)) {
                numeros.add(entry.getKey());
            }
            System.out.println("documento=" + entry.getKey() + "nombre=" + entry.getValue());
// entry.getKey trae la llave y entry.getValue trae los valores del mapa
        }
        return numeros;
    }

    public List buscarClientes(String ciudad) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        for (Map.Entry<Integer, Cliente> entry : directorio.entrySet()) {
            Cliente aux = entry.getValue();
            if (aux.getCiudad().contentEquals(ciudad)) {
                clientes.add(aux);
            }
            System.out.println("documento=" + entry.getKey() + "nombre=" + entry.getValue());
// entry.getKey trae la llave y entry.getValue trae los valores del mapa
        }
        return clientes;
    }

    public void borrarCliente(Integer telefono) {
        directorio.remove(telefono);
    }

    public void mostrarDire() {

        directorio.toString();
    }

    @Override
    public String toString() {
        String s = "{";
        for (Map.Entry<Integer, Cliente> entry : directorio.entrySet()) {
            s += entry.getValue().toString();
        }
        s += "} [" + directorio.size() + "]";
        return s;

    }
};
;
