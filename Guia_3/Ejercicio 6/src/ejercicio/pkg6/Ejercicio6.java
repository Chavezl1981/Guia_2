/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

1 - sumar
2 - restar
3 - multiplicar
4 - dividir
5 - salir
 */

package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        while (num1 <= 0 || num2 <= 0) {
            System.out.println("Ingrese un numero positivo distinto de 0, Gracias!");
            num1 = input.nextInt();
            num2 = input.nextInt();
        }

        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        boolean respuesta = false;
        do {
            System.out.println("Elija una opcion");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + (double) (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salida = input.next();
                    if (salida.toUpperCase().equals("S")) {
                        respuesta = true;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta, vuelva a intentar");
                    break;
            }

        } while (respuesta != true);
        System.out.println("Hasta Luego");
    }

}
