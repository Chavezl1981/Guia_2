
import java.util.Scanner;

/*
 4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */

/**
 *
 * @author arLuChavez
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Ingrese la temperatura en grados centigrados y los convertire a Fahrenheit");
         
         double gradosC = input.nextDouble();
         
         double gradosF = (32 + ((9* gradosC) /5));
         
         System.out.println("Los grados Fahrenheit son " + gradosF);
                 
    }
    
}
