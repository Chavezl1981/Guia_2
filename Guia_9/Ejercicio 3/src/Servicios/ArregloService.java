/*
 3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
 arreglo B de 20 números reales. Crear la clase ArregloService, en el
 paquete servicio, con los siguientes métodos:




 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author arLuChavez
 */
public class ArregloService {
    /*    1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
     números aleatorios.
     */

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < 50; i++) {
            arreglo[i] = Math.random() * 10;
        }

    }
    /*
     2) Método mostrar recibe un arreglo por parámetro y lo muestra por
     pantalla.
     */

    public void mostrar(double[] arreglo) {
        System.out.println("El arreglo A es: " + Arrays.toString(arreglo));
    }
    /*3) Método ordenar recibe un arreglo por parámetro y lo ordena de
     mayor a menor.
     */

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);

    }
    /*
     4) Método inicializarB copia los primeros 10 números del arreglo A en el
     arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
     mostrar A y B
     */

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
    }

}
