/*
 3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B
 */

package ejercicio.pkg3;

import Servicios.ArregloService;
import java.util.Arrays;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloService as = new ArregloService();
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
        as.inicializarB(arregloA, arregloB);
        
        System.out.println("El arreglo A es: " + Arrays.toString(arregloA));
        System.out.println("El arreglo B es: " + Arrays.toString(arregloB));
    }
    
    
}
