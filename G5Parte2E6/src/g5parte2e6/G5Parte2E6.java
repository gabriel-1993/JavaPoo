package g5parte2e6;

public class G5Parte2E6 {

    public static void main(String[] args) {

    //Instancio CATALOGO
    Catalogo local1 = new Catalogo();
    
    //Creo 2 productos para cada tipo:
    Ropa chaleco = new Ropa("Nylon", 11223, "Chaleco Azul,abrigadaso", "asereje", 1300, 5);
    Ropa lompa = new Ropa("Jean", 11334, "Pantalon negro", "jadeje", 1000, 8);
    Perfumeria perfuH = new Perfumeria(140, 11445, "perfume ricardo", "olorsito", 900, 25);
    Perfumeria perfuM = new Perfumeria(140, 11556, "ricardo es poco", "shakira", 1200, 16);
    Electrodomestico heladera= new Electrodomestico(800, 12556, "Heladera con freezer,mediana", "Pepe", 70000, 8);
    Electrodomestico lavarropa= new Electrodomestico(900, 33786, "Lava-automatico", "Dream", 80000, 5);
    
    //Agregados al Catalogo por su metodo agregar
    local1.agregarProd(chaleco);
    local1.agregarProd(lompa);
    local1.agregarProd(perfuH);
    local1.agregarProd(perfuM);
    local1.agregarProd(heladera);
    local1.agregarProd(lavarropa);
    
    //Cantidad de productos por categorias
    local1.cantidadesCadaTipo();
    
     //Mostrar los productos de cada Categoria
    local1.listarProdCate();
    }
    
   
}
