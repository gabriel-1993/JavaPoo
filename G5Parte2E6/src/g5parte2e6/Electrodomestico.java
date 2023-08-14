package g5parte2e6;

public class Electrodomestico extends Producto{
    
    private int consumoEnW;
    
    public Electrodomestico(int consumoEnw,int codigo, String descripcion, String marca, int precioLista, int stock){
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoEnW=consumoEnW;
    }

    public int getConsumoEnW() {
        return consumoEnW;
    }

    public void setConsumoEnW(int consumoEnW) {
        this.consumoEnW = consumoEnW;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(int precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "consumoEnW=" + consumoEnW + '}';
    }
    
}
