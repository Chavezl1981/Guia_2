/*
 5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */

package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        int numlim   = input.nextInt();
        int sumar = 0;
        while (sumar < numlim) {
         System.out.println("Ingrese un numero");
        int numnew = input.nextInt();
        sumar += numnew; 
        }
        System.out.println("La suma de los numeors ingresados es: " + sumar);
                               
    }
    
}
