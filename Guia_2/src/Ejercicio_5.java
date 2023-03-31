/*
 5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
2
 */
import java.util.Scanner;
/**
 *
 * @author arLuChavez
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        
        double num = input.nextDouble();
        
        double doble = num * 2;
        
        double triple = num * 3;
        
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es " + doble );
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("la raiz cuadrada de " + num + " es " + raiz);
    }
    
}
