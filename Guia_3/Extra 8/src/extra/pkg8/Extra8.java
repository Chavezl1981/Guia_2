/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra.pkg8;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
     * Escriba un programa que lea números enteros.
     * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
     * la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
     * los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */   
     
      Scanner leer = new Scanner(System.in);  
      
      int num ;
      int contpar = 0; int contimpar = 0; 

        while (true) {
            System.out.print(" Ingrese un numero : ");

            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num > 0) {
                if (num % 2 == 0) {
                contpar += 1;
            } else{
            contimpar += 1;
            }
            }
        }
        System.out.println("Cantidad de pares : " + contpar);
        System.out.println("Cantidad de Impares : " + contimpar);
        System.out.println("Cantidad de Total : " + (contpar + contimpar));
    }
    }
