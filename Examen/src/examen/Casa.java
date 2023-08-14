package examen;

public class Casa extends Propiedad {

    private int numHabitaciones;

    public Casa(String nombre, double precio, int stock, int numHabitaciones) {
        super(nombre, precio, stock);
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public void calcularPrecioTotal() {
        if (this.stock > 10) {
            double descuento = 5 / 100;
            descuento = descuento * this.getPrecio();
            this.setPrecio(descuento);
            System.out.println("El precio es total con descuento es:" + this.precio);

        }

    }
;

}
