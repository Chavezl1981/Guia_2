/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba.hora;

/**
 *
 * @author arLuChavez
 */
public class PruebaHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
     int segundos = 0;
        while (true) {
            // Incrementar segundos
            segundos++;
            
            // Calcular horas, minutos y segundos
            int horas = segundos / 3600;
            int minutos = (segundos % 3600) / 60;
            int segundosRestantes = segundos % 60;
            
            // Mostrar tiempo en formato hh:mm:ss
            String tiempo = String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);
            System.out.println(tiempo);
            
            // Esperar un segundo antes de continuar
            Thread.sleep(1000);
        }
    }
}