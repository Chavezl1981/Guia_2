
import java.util.Scanner;

/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas
 */

/**
 *
 * @author arLuChavez
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este codigo aparentemente se utiliza para que luego se pueda leer lo que se ingresa por teclado, cuando lo hacemos es necesario que se importe import java.util.Scanner;
        Scanner input = new Scanner(System.in);
        //Este codigo seria el "Escribir" en PsInt
        System.out.println("Ingrese una frase: ");
        //Aca defino la variable String que seria para cadena y le agrego el codigo para que guarde la info en la variable que defina
        String frase = input.nextLine();
        //Para utilizar el Metodo en string aparentemente se realiza de la siguiente manera
        String frasemin = frase.toLowerCase();
        String frasemay = frase.toUpperCase();
        
        System.out.println("La frase en minusculas es: " + frasemin);
        
        System.out.println("La frase en minusculas es: " + frasemay);
        
        
    }
    
}
