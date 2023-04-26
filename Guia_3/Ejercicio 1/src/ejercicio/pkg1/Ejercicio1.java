/*
  1. Crear un programa que dado un número determine si es par o impar.
 */

package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num = input.nextInt();

        Boolean resultado = esPar(num);
        if (resultado) {
            System.out.println("El numero es par: ");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

}
