package g6e3;

import java.util.Scanner;

public class G6E3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String n1, n2;
        int n1Int, n2Int;
        try {
            System.out.print("Ingrese el primer número: ");
            n1 = leer.nextLine().trim();
            while (n1.isEmpty()) {
                System.out.println("Error: No se ha ingresado ningún valor. Intente nuevamente.");
                System.out.print("Ingrese el primer número: ");
                n1 = leer.nextLine().trim();
            }
            System.out.print("Ingrese el segundo número: ");
            n2 = leer.nextLine().trim();
            while (n2.isEmpty()) {
                System.out.println("Error: No se ha ingresado ningún valor. Intente nuevamente.");
                System.out.print("Ingrese el segundo número: ");
                n2 = leer.nextLine().trim();
            }
            n1Int = Integer.parseInt(n1);
            n2Int = Integer.parseInt(n2);
            System.out.println("El resultado de la división es: " + DivisionNumero.divisionNumeros(n1Int, n2Int));
        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha ingresado un valor no válido. Verifique e intente nuevamente.");
        } catch (ArithmeticException ae) {
            System.out.println("El n2 es igual a 0");
        }
    }
}
