/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    
     
    Scanner leer = new Scanner(System.in);    
    
    String cadena;
     
    System.out.println("Ingrese una letra");
        cadena = leer.nextLine();
        cadena = cadena.toLowerCase(); // Convertir cadena a minúsculas

        if (cadena.equals("a") || cadena.equals("e") || cadena.equals("i") || cadena.equals("o") || cadena.equals("u") ){
            System.out.println("La letra es una VOCAL");
            
        }else{
            System.out.println("La letra es una NO es VOCAL");
        }
        }
}
