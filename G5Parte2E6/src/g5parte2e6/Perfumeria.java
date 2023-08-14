package g5parte2e6;

public class Perfumeria extends Producto {
    
    private int tamañoEnCC;
    
    public Perfumeria(int tamañoEnCC,int codigo, String descripcion, String marca, int precioLista, int stock){
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamañoEnCC=tamañoEnCC;
    }

    public int getTamañoEnCC() {
        return tamañoEnCC;
    }

    public void setTamañoEnCC(int tamañoEnCC) {
        this.tamañoEnCC = tamañoEnCC;
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
        return "Perfumeria{" + "tama\u00f1oEnCC=" + tamañoEnCC + '}';
    }
    
}
