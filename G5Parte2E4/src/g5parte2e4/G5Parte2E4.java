package g5parte2e4;

import java.time.LocalDate;

public class G5Parte2E4 {

    public static void main(String[] args) {

        // - Crear el cliente Juan Lucero de la localidad de Merlo, nacido el 25/07/1978
        Cliente cliente1 = new Cliente("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
        //Crear una cuenta nro 1234 para el cliente creado en el punto anterior.
        Cuenta cuenta1 = new Cuenta(1234, cliente1);
        //ver saldo
        System.out.println(cuenta1.verSaldo());
        //Depositar en la cuenta 60.000 (sesenta mil) pesos.
        cuenta1.depositar(60000.00);
        //ver saldo
        System.out.println("Ver saldo actual :" + cuenta1.verSaldo());
        //Extraer de la cuenta 10.000 (diez mil) pesos.
        cuenta1.extraer(10000.0);
        System.out.println("Ver saldo actual :" + cuenta1.verSaldo()
        );
        //Mostrar usando el método de cuenta todos los movimientos.
        
        cuenta1.listarMovimientos();
    }

}
