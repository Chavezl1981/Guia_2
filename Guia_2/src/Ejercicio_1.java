
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

/**
 *
 * @author arLuChavez
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
                
        System.out.println("La suma de los numeros ingresados es " + suma);
        
        
        
    }
    
}
