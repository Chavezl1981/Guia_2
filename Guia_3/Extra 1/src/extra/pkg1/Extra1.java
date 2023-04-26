/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */

package extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int minutos = input.nextInt();
        int hora = (minutos / 60);
        int dia = (hora / 24);

        while (hora > 24) {
            hora -= 24;
        }

        System.out.println("Segun los minutos ingresados, corresponden a " + dia + " dias y " + hora + " horas");
    }

}
