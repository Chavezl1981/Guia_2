/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2guia7poo;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Circunferencia2 {
  private double radio;

    public Circunferencia2() {
    }

    public Circunferencia2(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Ingrese el radio");
        this.radio = input.nextDouble();
    }
    public void area(){
        double area= Math.PI*Math.pow(radio,2);
        System.out.println("El area es: " + area);
    }
    public void perimetro(){
        double perimetro = (2*Math.PI*radio);
        System.out.println("El perimetro es " + perimetro);
    }
      
}
