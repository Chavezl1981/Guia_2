/*
 8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == 0 || i == size - 1) {

                    System.out.print("*");

                } else {

                    if (j == 0 || j == size - 1) {

                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }

                }

            }

            System.out.println(" ");

        }

    }

}

