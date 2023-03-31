
import java.util.Scanner;

/*
 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */

/**
 *
 * @author arLuChavez
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        
        System.out.println("Su nombre es " + nombre);
        
    }
    
}
