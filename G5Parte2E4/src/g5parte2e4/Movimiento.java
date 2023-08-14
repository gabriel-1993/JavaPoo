package g5parte2e4;

import java.time.LocalDate;

public class Movimiento {

    private char tipo;

    private double importe;

    private double saldo;

    private LocalDate fecha;

    public Movimiento(char tipo, double importe, double saldo) {
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "tipo=" + tipo + ", importe=" + importe + ", saldo=" + saldo + ", fecha=" + fecha + '}';
    }

}
