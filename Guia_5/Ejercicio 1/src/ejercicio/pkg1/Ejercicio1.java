/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.

 */

package ejercicio.pkg1;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] Vector = new int[100];
        
        for ( int i = 0 ; i < 100 ; i++){            
            Vector[i] = i;           
        }
       for (int i = Vector.length - 1; i >= 0; i--) {
          System.out.println(Vector[i]);
        }
    }
    
}