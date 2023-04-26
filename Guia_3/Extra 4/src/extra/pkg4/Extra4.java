/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
y se muestre su equivalente en romano
 */

package extra.pkg4;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 a 10");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("El numero ingresado en romano es: I");

        } else if (num == 2) {
            System.out.println("El numero ingresado en romano es: II");

        }else if (num == 3) {
            System.out.println("El numero ingresado en romano es: III");

        }else if (num == 4) {
            System.out.println("El numero ingresado en romano es: IV");

        }else if (num == 5) {
            System.out.println("El numero ingresado en romano es: V");

        }else if (num == 6) {
            System.out.println("El numero ingresado en romano es: VI");

        }else if (num == 7) {
            System.out.println("El numero ingresado en romano es: VII");

        }else if (num == 8) {
            System.out.println("El numero ingresado en romano es: VIII");

        }else if (num == 9) {
            System.out.println("El numero ingresado en romano es: IX");

        }else if (num == 10) {
            System.out.println("El numero ingresado en romano es: X");

        }else  {
            System.out.println("Ingreso un numero incorrecto");
        }
        
    }

    }


