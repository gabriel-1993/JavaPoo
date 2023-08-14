package g5parte2e4;

import g5parte2e4.Cliente;
import java.util.LinkedList;

public class Cuenta {

    private long num;

    private double saldo;

    private double interesAnual;

    private Cliente titular;

    private LinkedList<Movimiento> movimientos;

    public Cuenta(long num, Cliente titular) {
        this.num = num;
        this.saldo = 0.00;
        this.interesAnual = 0.00;
        this.titular = titular;
        this.movimientos = new LinkedList<Movimiento>();
    }

    public void depositar(double cantidad) {
        this.saldo = saldo + cantidad;
        Movimiento movi = new Movimiento('D', cantidad, this.saldo);
        movimientos.add(movi);
        System.out.println("Deposito realizado : " + movi);

    }

    public void extraer(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            Movimiento movi = new Movimiento('E', cantidad, this.saldo);
            movimientos.add(movi);
            System.out.println("Extraccion finalizada : " + movi);
        } else {
            System.out.println("Saldo insuficiente = $" + saldo + " ingrese un monto menor o igual");
        }
    }

    public void cambiarInteresAnual(double valor) {
        interesAnual = valor;

    }

    public Cliente verTitular() {
        return titular;
    }

    public double verSaldo() {
        return saldo;
    }

    public void listarMovimientos() {
        for (Movimiento elem : movimientos) {
            System.out.println(elem.toString());
        }
    }

}
