/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g5e3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G5E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3) En un nuevo proyecto, en el método main de su clase principal, se pide crear un algoritmo que rellene un vector 
        //de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará donde 
        //se encuentra el número y si se encuentra repetido
                        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para el vector ");
        int tamaño = leer.nextInt();
        int []vector1 = new int[tamaño];
        System.out.println("Ingrese el num que desea buscar :");
        int buscar = leer.nextInt();
        for(int i=0; i< tamaño ;i++){
        vector1[i]=(int) (Math.random() * 10);
        if(vector1[i]== buscar){
            System.out.println("El numero "+buscar+" Se encuentra en la posicion: "+i);
        }
        }

    }
    
}
