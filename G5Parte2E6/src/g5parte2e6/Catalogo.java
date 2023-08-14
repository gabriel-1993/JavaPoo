package g5parte2e6;

import java.util.HashSet;
import java.util.Iterator;

public class Catalogo {

    private HashSet<Producto> catalogo;

    public Catalogo() {
        this.catalogo = new HashSet<Producto>();
    }

    public void agregarProd(Producto producto) {
        catalogo.add(producto);
    }

    public void cantidadesCadaTipo() {
        int cantRop = 0;
        int cantPer = 0;
        int cantEle = 0;
        Iterator<Producto> it = catalogo.iterator();
        for (Producto elem : catalogo) {
            if (it instanceof Ropa) {
                cantRop++;
            }
            if (it instanceof Perfumeria) {
                cantPer++;
            }
            if (it instanceof Electrodomestico) {
                cantEle++;
            }
        }
        System.out.println("Cantidad Ropa:" + cantRop);
        System.out.println("Cantidad Perfumeria" + cantPer);
        System.out.println("Cantidad Electrodomesticos" + cantEle);

    }

    public void listarProdCate() {
        Iterator<Producto> it = catalogo.iterator();
        for (Producto elem : catalogo) {
            System.out.println("-----PRODUCTOS ROPA-----");
            if (it instanceof Ropa) {
                System.out.println(it.toString());
            }
            System.out.println("-----PRODUCTOS PERFUMERIA------");
            if (it instanceof Perfumeria) {
                System.out.println(it.toString());
            }
            System.out.println("-----PRODUCTOS ELECTRODOMESTICOS-----");
            if (it instanceof Electrodomestico) {
                System.out.println(it.toString());
            }
        }
    }

}
